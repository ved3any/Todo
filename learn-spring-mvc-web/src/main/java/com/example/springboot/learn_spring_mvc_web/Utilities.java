package com.example.springboot.learn_spring_mvc_web;

import org.springframework.stereotype.Component;

@Component

public class Utilities {
	

	public String Capitalize1Letter(String str) {
		if (str == null || str.length() == 0) {
			return str;
			} 
		return str.substring(0, 1).toUpperCase() + str.substring(1);  
	} 
	

}

