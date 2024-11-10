package com.example.springboot.learn_spring_mvc_web;

import java.util.Map;

import org.springframework.stereotype.Service;

@Service
public class AuthenticatorServeice {
	private DatabaseService dbservice;
	public AuthenticatorServeice(DatabaseService dbService) {
		super();
		this.dbservice = dbService;
	}

 public boolean Authenticate(String name, String password) {
//	 Map map = dbservice.Query_DB(String.format("select * from registration where name = %s and password = %s",name,password));
	 
//	 if (map.get("name") != "" || map.get("name") != null && map.get("password") != "" || map.get("password") != null) 
//	 {
//		return false;
//	 }else {
//		 return true;
//	 }
//	 
return true;
 } 
 
}
