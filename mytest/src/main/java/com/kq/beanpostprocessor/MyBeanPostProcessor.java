package com.kq.beanpostprocessor;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.lang.Nullable;

/**
 * MyBeanPostProcessor
 *
 * @author kq
 * @date 2019-01-14
 */
public class MyBeanPostProcessor implements BeanPostProcessor{

	private Logger logger = LoggerFactory.getLogger(this.getClass());

	@Nullable
	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {

		logger.info("--------------  execute before postProcessBeforeInitialization {}",bean);

		return bean;
	}

	@Nullable
	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {

		logger.info("--------------  execute after postProcessBeforeInitialization {}",bean);
		return bean;
	}
}
