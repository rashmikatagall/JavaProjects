package com.planmyday;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;


@SpringBootApplication
//@EnableAutoConfiguration
public class Application {

	
  static Logger logr = LoggerFactory.getLogger(Application.class);
  static {
	  logr.info("Application bootstrapping...");
  }
   
  
	@Bean
	public String getAppString() {
		logr.info("Bean getString in Application registered!");
		return "Hello from mainconfig";
	}
	
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
		logr.info("Application autoconfiguration done..");
		
		logr.info("The value of autowired string : "+ContextAwareUtil.getBean("getAppString") );
		
	}

}
