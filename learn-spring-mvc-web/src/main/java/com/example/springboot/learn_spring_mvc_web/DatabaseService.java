package com.example.springboot.learn_spring_mvc_web;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;
@Repository
public class DatabaseService {
	/*
	 * 
	 * private Logger logger = LoggerFactory.getLogger(DatabaseService.class);
	 * 
	 * @SuppressWarnings("rawtypes") public Map Query_DB(String Query) { Map map =
	 * new HashMap(); try { Class.forName("com.mysql.cj.jdbc.Driver"); Connection
	 * con = DriverManager.getConnection(
	 * "jdbc:mysql://sql110.infinityfree.com:3306/if0_37098857_Todo_Application",
	 * "if0_37098857","Tigerman132");
	 * logger.info("Database : Connection Was Successfully Created"); ResultSet data
	 * = this.ExecuteQuery(Query,con);
	 * 
	 * con.close(); map.put("name", data.getString("name")); map.put("password",
	 * data.getString("password")); map.put("email", data.getString("email"));
	 * map.put("phone", data.getString("phone"));
	 * 
	 * 
	 * } catch (ClassNotFoundException e){ logger.error(e.toString()); } catch
	 * (SQLException e) { logger.error(e.toString()); } return map; } public
	 * ResultSet ExecuteQuery(String query , Connection con) throws SQLException {
	 * PreparedStatement ps = con.prepareStatement(query); ResultSet rs =
	 * ps.executeQuery(); return rs;
	 * 
	 * }
	 */}
