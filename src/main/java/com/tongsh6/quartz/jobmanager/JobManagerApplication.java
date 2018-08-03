package com.tongsh6.quartz.jobmanager;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan("com.tongsh6.quartz.jobmanager")
@MapperScan("com.tongsh6.quartz.jobmanager.dao")
@SpringBootApplication
public class JobManagerApplication {

	public static void main(String[] args) {
		SpringApplication.run(JobManagerApplication.class, args);
	}
}
