package devonframework.sample.office.common.servlet;

import java.io.PrintWriter;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import devon.core.collection.LData;
import devon.core.collection.LMultiData;
import devon.core.log.LLog;
import devon.core.log.trace.LTraceID;
import devonframework.bridge.rui.util.LRuiConstants;
import devonframework.bridge.rui.util.LRuiConverter;
import devonframework.front.channel.LAbstractServlet;
import devonframework.front.channel.context.LActionContext;

/**
 * 
 * 운영관리의 요청과 응답을 처리하기 위한 서블릿 클래스이다.
 *
 * @version SmartChannelPlatform 1.0
 * @since 2011.11.18 : A23997(ittinker@gmail.com) : 문서화위한 표준 주석 추가
 */
public class AjaxServlet extends LAbstractServlet {
	private static final long serialVersionUID = 9022722988639227411L;

	public AjaxServlet() {
		super();
	}

	protected void catchService() {
		PrintWriter pw = null;

		try {
			LActionContext.getHttpServletResponse().setContentType("text/html;charset=utf-8");
			pw = LActionContext.getHttpServletResponse().getWriter();

			this.process();
			Object data = LActionContext.getAttribute(LRuiConstants.KEY_DATA);

			if (data != null) {
				String message = null;
				if (data instanceof String)
					message = (String) data;
				else if (data instanceof LMultiData)
					message = LRuiConverter.convertToMessage((LMultiData) data);
				else if (data instanceof LData)
					message = LRuiConverter.convertToMessage((LData) data);
				else if (data instanceof List)
					message = LRuiConverter.convertToMessage((List) data);
				else
					throw new Exception("알 수 없는 데이터");

				if (message != null && !"".equals(message))
					pw.write(message);
			}
		} catch (Exception e) {
			LLog.devon.write(e.toString());
			e.printStackTrace(LLog.devon);

			LActionContext.getHttpServletResponse().setStatus(HttpServletResponse.SC_INTERNAL_SERVER_ERROR);
			String message = (String) LActionContext.getAttribute(LRuiConstants.KEY_DATA);
			if (message == null)
				message = e.getMessage();

			pw.write(message);
		} finally {
			LTraceID.clear();
			pw.flush();
			pw.close();
		}
	}

	protected void beforeCatchService() {
	}
}
