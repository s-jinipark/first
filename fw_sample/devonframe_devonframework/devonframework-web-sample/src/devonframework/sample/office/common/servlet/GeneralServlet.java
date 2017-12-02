/*
 * @(#) GeneranServlet.java
 * 
 * Copyright ⓒ LG CNS, Inc. All rights reserved.
 * 
 * Do Not Erase This Comment!!! (이 주석문을 지우지 말것)
 * 
 * 본 프로그램의 모든 내용은 LG CNS "SmartChannelPlatform" 이하 SCP의 자산이므로
 * 어떤한 경우라도 허락없이 재배포 하거나 LG CNS 외부로의 유출이 금지되어 있습니다.
 * 
 * 프로젝트에서 SCP를 사용하거나 SCP를 변경한 경우 프로젝트 정보와 변경된 내용을 SCP 팀에 알려야 한다.
 */
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
 * <pre>
 * agent servlet
 * </pre>
 * 
 * [ 변경내역 ]
 * <ul>
 * <li>[Ver 4.0.0] 2014. 12. 15.: 77021 | 최초생성</li>
 * </ul>
 * 
 * @author Smart Channel Platform, LG CNS,Inc., devonscp@lgcns.com
 * @version Smart Channel Platform 4.0.0
 * @since Smart Channel Platform 4.0.0
 */
public class GeneralServlet extends LAbstractServlet {

    private static final long serialVersionUID = 7489477535914252784L;

    public GeneralServlet() {
        super();
    }
    
    /**
     * <pre>
     * </pre>
     * 
     * @see devonframework.front.channel.LAbstractServlet#beforeCatchService()
     */
    @Override
    protected void beforeCatchService() {
        // TODO Auto-generated method stub
    }

    /**
     * <pre>
     * </pre>
     * 
     * @see devonframework.front.channel.LAbstractServlet#catchService()
     */
    @Override
    protected void catchService() {
        PrintWriter pw = null;

        try {
            LActionContext.getHttpServletResponse().setContentType("text/plain;charset=utf-8");
            pw = LActionContext.getHttpServletResponse().getWriter();

            this.process();
            
            Object data = LActionContext.getAttribute("result");
            if (data != null) {
                String message = null;
                if (data instanceof String) {
                    message = (String) data;
                } else if (data instanceof LMultiData) {
                    message = LRuiConverter.convertToMessage((LMultiData) data);
                } else if (data instanceof LData) {
                    message = LRuiConverter.convertToMessage((LData) data);
                } else if (data instanceof List) {
                    message = LRuiConverter.convertToMessage((List) data);
                } else {
                    throw new Exception("알 수 없는 데이터");
                }

                if (message != null && !"".equals(message)) {
                    pw.write(message);
                }
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

}
