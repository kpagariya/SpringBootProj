package com.learning.demo.emailer;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
public class MailConfig {
	@Bean
	@Profile("dev")
	public IEmailSender dummyEmailerImpl() {
		return new DummyEmailerImpl();
	}
	@Bean
	@ConditionalOnProperty
	public IEmailSender smtpEmailerImpl() {
		return new SmtpEmailerImpl();
	}
}
