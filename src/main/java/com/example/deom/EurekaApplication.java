package com.example.deom;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.context.annotation.ComponentScan;

@EnableEurekaServer
@SpringBootApplication
// 开启通用注解扫描
@ComponentScan
/*
@Configuration
@SpringBootApplication
@EnableAutoConfiguration*/
public class EurekaApplication extends SpringBootServletInitializer {

	// public static void main(String[] args) {
	// SpringApplication.run(EurekaApplication.class, args);
	// }

	/**
	 * 实现SpringBootServletInitializer可以让spring-boot项目在web容器中运行
	 */
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		builder.sources(this.getClass());
		return super.configure(builder);
	}
}
