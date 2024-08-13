package com.example.springboot.learn_spring_mvc_web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {
	private Utilities utils;
	private AuthenticatorServeice authService;

	public LoginController(AuthenticatorServeice authService , Utilities utils) {
		super();
		this.authService = authService;
		this.utils = utils;
	}



	
	@RequestMapping(value="login", method = RequestMethod.GET)
	public String doLogin() {
		return "login";
	}
	
	@RequestMapping(value="login", method = RequestMethod.POST)
	public String welcome(@RequestParam String name, @RequestParam String password, ModelMap model ) {
		if(authService.Authenticate(name, password))
		{
			model.addAttribute("name", utils.Capitalize1Letter(name));
			model.put("password", password);
			return "welcome";

		}
		model.put("error", "The Password or Username Is Wrong! Try Again.");
		return "login";
	}

}
