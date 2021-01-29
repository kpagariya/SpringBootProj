package com.learning.demo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	
	@Value("${app.smpt.name}")
	private String appSmtpName;
	
	@RequestMapping("/hello")
	public String hello() {
		return "Hello World " +appSmtpName ;
	}
}
