package aa.bb.get;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

/*
@Controller
public class LoginController {
	@RequestMapping(value = "login", method = RequestMethod.GET)
	public ModelAndView submit(HttpServletRequest request) {
		String id = request.getParameter("id");
		String pwd = request.getParameter("pwd");
		String data = "";
		
		if(id.equals("aa") && pwd.equals("bb")) data = "로그인 성공";
		else data = "로그인 실패";
		
		ModelAndView modelAndView = new ModelAndView("result");
		modelAndView.addObject("data", data);
		
		return modelAndView;
	}
}
*/
/*
@Controller
@RequestMapping("login")
public class LoginController {
	@RequestMapping(method = RequestMethod.GET)
	public ModelAndView submit(
				@RequestParam("id") String id,
				@RequestParam("pwd") String pwd
			) {
		String data = "";
		
		if(id.equals("aa") && pwd.equals("bb")) data = "로그인 성공";
		else data = "로그인 실패";
		
		ModelAndView modelAndView = new ModelAndView("result");
		modelAndView.addObject("data", data);
		
		return modelAndView;
	}
}
*/

@Controller
@RequestMapping("login")
public class LoginController {
	@RequestMapping(method = RequestMethod.GET)
	public ModelAndView submit(
				@RequestParam("id") String id,
				@RequestParam("pwd") int pwd
			) {
		String data = "";
		
		if(id.equals("aa") && pwd == 11) data = "로그인 성공";
		else data = "로그인 실패";
		
		ModelAndView modelAndView = new ModelAndView("result");
		modelAndView.addObject("data", data);
		
		return modelAndView;
	}
}