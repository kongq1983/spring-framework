package com.kq.main;

import com.kq.bean.Employee;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * XmlMainTest
 *
 * @author kq
 * @date 2019-01-15
 */
public class XmlMainTest {

	private static Logger logger = LoggerFactory.getLogger(XmlMainTest.class);

	public static void main(String args[]) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext(
				new String[] {"application.xml"});

		Employee employee = ctx.getBean(Employee.class);
		System.out.println("employee="+employee);
	}



}