package com.accp.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

@Configuration
public class MyWebMvcConfig extends WebMvcConfigurationSupport {
	
	//覆盖原有的静态资源配置，必须重新配置
	@Override
	protected void addResourceHandlers(ResourceHandlerRegistry registry) {
		// TODO Auto-generated method stub
		registry.addResourceHandler("/**").addResourceLocations("classpath:/static/").addResourceLocations("file:d//school/images");
		super.addResourceHandlers(registry);
	}
	
	@Override
	protected void addCorsMappings(CorsRegistry registry) {
		// TODO Auto-generated method stub
		registry.addMapping("/**").allowedMethods("*").allowedHeaders("*").allowedOrigins("*");
		super.addCorsMappings(registry);
	}
}
