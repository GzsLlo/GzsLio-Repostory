package com.onmyoji.utils.modules.common;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class SpringApplicationContext implements ApplicationContextAware {

	private static ApplicationContext ac;

	@Override
	public void setApplicationContext(ApplicationContext applicationContext)
			throws BeansException {
		ac = applicationContext;
	}

	public static Object getBean(String beanName) {
		return ac.getBean(beanName);
	}

	public static <E> E getBean(Class<E> clazz) {
		return ac.getBean(clazz);
	}

}
