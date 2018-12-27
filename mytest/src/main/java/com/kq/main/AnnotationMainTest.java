package com.kq.main;

import com.kq.bean.Employee;
import com.kq.config.MyConfiguration;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * AnnotationMain
 *
 * @author kq
 * @date 2018-12-26
 */
public class AnnotationMainTest {

	private static Logger logger = LoggerFactory.getLogger(AnnotationMainTest.class);

	public static void main(String args[]) {

		logger.info("start AnnotationMainTest");

		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(MyConfiguration.class);
		Employee e = ctx.getBean(Employee.class);
		System.out.println(e);


	}

}
