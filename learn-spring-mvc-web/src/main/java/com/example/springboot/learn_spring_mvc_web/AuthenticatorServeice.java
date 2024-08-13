package com.example.springboot.learn_spring_mvc_web;

import org.springframework.stereotype.Service;

@Service
public class AuthenticatorServeice {
 public boolean Authenticate(String name, String password) {
	 boolean isValidName = name.equalsIgnoreCase("vedant");
	 boolean isValidPass = password.equalsIgnoreCase("dummy");
	 return isValidName && isValidPass;
 } 
}
