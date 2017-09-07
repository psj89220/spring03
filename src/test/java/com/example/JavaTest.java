package com.example;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.junit.Test;

public class JavaTest {
	static Log log = LogFactory.getLog(JavaTest.class);
	@Test
	public void test() {
		log.info("###########################");
		log.info("TestJava Commons Logging...");
		log.info("###########################");
	}

}
