package com.learning.demo.emailer;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;


public class SmtpEmailerImpl implements IEmailSender {

	// Common logging which is wrapper around slf4j
	private static Log log=LogFactory.getLog(SmtpEmailerImpl.class);
	
	@Override
	public void sendEmail(String emailID, String subject, String mailContent) {
		log.info("SMPT Mail receiver ID : "+emailID);
		log.info("SMTP Mail Subject : "+subject);
		log.info("SMTP Mail Body : "+mailContent);
	}
}

