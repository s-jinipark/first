package devonframe.sample.office.common.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * <pre>
 * 본 클래스는 로그인 처리를 담당하는 Controller 클래스입니다.
 * </pre>
 *
 * @author XXX팀 OOO
 */

@Controller
public class LoginController {

	@RequestMapping(value = "/main.do")
	public String retrieveMainPage(String redirectUrl, ModelMap model) {
		if (redirectUrl != null && !redirectUrl.trim().equals("")) {
			model.addAttribute("redirectUrl", redirectUrl);
			String menuCode = redirectUrl.substring(0, redirectUrl.indexOf("/"));
			if (redirectUrl.startsWith("/")) {
				menuCode = redirectUrl.substring(1);
				menuCode = menuCode.substring(0, menuCode.indexOf("/"));
			}
			model.addAttribute("menuCode", menuCode);
		}
		return "main";
	}
}
