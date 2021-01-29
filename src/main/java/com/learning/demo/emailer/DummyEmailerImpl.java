package com.learning.demo.emailer;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;


// Dummy class which will send dummy email

public class DummyEmailerImpl implements IEmailSender {

	// Common logging which is wrapper around slf4j
	private static Log log=LogFactory.getLog(DummyEmailerImpl.class);
	
	@Override
	public void sendEmail(String emailID, String subject, String mailContent) {
		log.info("Dummy Mail receiver ID : "+emailID);
		log.info("Dummy Mail Subject : "+subject);
		log.info("Dummy Mail Body : "+mailContent);
	}
}

