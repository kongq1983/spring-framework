package com.kq.config;

import com.kq.bean.Employee;
import com.kq.beanpostprocessor.MyBeanPostProcessor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Configuration
 *
 * @author kq
 * @date 2018-12-26
 */
@Configuration
public class MyConfiguration {


	@Bean
	public Employee getEmployee(){
		Employee e = new Employee();
		e.setId("1");
		e.setName("name1");

		return e;
	}

	@Bean
	public MyBeanPostProcessor getMyBeanPostProcessor(){
		MyBeanPostProcessor p = new MyBeanPostProcessor();
		return p;
	}

}
