package com.learning.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.learning.demo.emailer.DummyEmailerImpl;
import com.learning.demo.emailer.IEmailSender;

@RestController
public class EmailController {
	
	//private IEmailSender email = new DummyEmailerImpl();
		
	private IEmailSender email;
	
	@Autowired
	public EmailController(IEmailSender temp) {
		this.email = temp;
	}

	@RequestMapping("/email")
	public String email() {
		
		email.sendEmail("Steve@apple.com","Launch of new apple pro 13","Body of the email");
		return "Mail Sent";
	}
}
