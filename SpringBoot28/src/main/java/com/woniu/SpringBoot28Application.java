package com.woniu;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.woniu.mapper")
@SpringBootApplication
public class SpringBoot28Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringBoot28Application.class, args);
	}

}
