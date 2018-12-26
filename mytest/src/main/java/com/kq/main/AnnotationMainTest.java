package com.kq.main;

import com.kq.bean.Employee;
import com.kq.config.MyConfiguration;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * AnnotationMain
 *
 * @author kq
 * @date 2018-12-26
 */
public class AnnotationMainTest {

	public static void main(String args[]) {

		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(MyConfiguration.class);
		Employee e = ctx.getBean(Employee.class);
		System.out.println(e);


	}

}
