//created by JK 27/09/19
package com.kinahanj.spring.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;
import com.kinahanj.spring.config.WebConfig;
import com.kinahanj.spring.config.AppConfig;

public class MyWebAppInitialiser extends AbstractAnnotationConfigDispatcherServletInitializer{

	@Override
	protected Class<?>[] getRootConfigClasses() {
		 
		return new Class[] {AppConfig.class};
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		 
		return new Class[] {WebConfig.class};
	}

	@Override
	protected String[] getServletMappings() {
		 
		return new String [] {"/"};
	}

	
}
