package com.marlabs.democloudfoudry.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.marlabs.democloudfoudry.config.DBConfigBean;

@RestController
@RefreshScope
public class ConfigurationController {

	
	@Autowired
	private DBConfigBean DBConfigBean;
	
	@GetMapping("/config/dbConfig")
	public String getDBConfig() {
		return DBConfigBean.getConnection() + " - " + DBConfigBean.getHost() + " - " + DBConfigBean.getPort();
	}
	
	@Value("${my.greetings}")
	private String greetings;
	
	@Value("${my.message}")
	private String message;
	
	public DBConfigBean getDBConfigBean() {
		return DBConfigBean;
	}

	public void setDBConfigBean(DBConfigBean dBConfigBean) {
		DBConfigBean = dBConfigBean;
	}

	public String getGreetings() {
		return greetings;
	}

	public void setGreetings(String greetings) {
		this.greetings = greetings;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	@GetMapping("/config/greetings")
	public String getGreeting() {
		return greetings + " - " + message;
	}
	
	
}
