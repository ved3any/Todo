package com.example.springboot.learn_spring_mvc_web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class LoginController {
	
	private AuthenticatorServeice authService;

	public LoginController(AuthenticatorServeice authService) {
		super();
		this.authService = authService;
	}

	@RequestMapping(value="login", method = RequestMethod.GET)
	public String doLogin() {
		return "login";
	}
	
	@RequestMapping(value="login", method = RequestMethod.POST)
	public String welcome(@RequestParam String name, @RequestParam String password, ModelMap model ) {
		if(authService.Authenticate(name, password))
		{
			model.put("name", name);
			model.put("password", password);
			return "welcome";

		}
		return "login";
	}

}
