package com.planmyday;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;

@Configuration
public class TestAutoConfiguration {
	
	static Logger logr = LoggerFactory.getLogger(TestAutoConfiguration.class);
	static {
		logr.info("TestAutoConfiguration being configured");
	}
	@Bean 
	@Lazy
	public String getString() {
		logr.info("Bean getstring in TestAutoConfiguration registered!");
		return "Hello There!";
	}

}
