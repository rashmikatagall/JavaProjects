package com.planmyday;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.stereotype.Component;
@Component
public class TestAutowiring {

	static Logger logr = LoggerFactory.getLogger(TestAutowiring.class);
	
	
	String testStr;
	
	TestAutoConfiguration tac;
	
	static {
		logr.info("TestAutowiring being autowired");
	}
	
	@Autowired
	@Qualifier("getString")
	public void setTestStr(String testStr) {
		this.testStr = testStr;
		logr.info("Setter injection called and dset :" + this.testStr);
	}


	public String gettestStr() {
		return this.testStr;
	}

    @Autowired
	public TestAutowiring(TestAutoConfiguration tac) {
    	logr.info("Autowiring constructor injection TestAutoConfiguration ");
		this.tac = tac;
	}
}
