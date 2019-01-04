package com.ceramicasietecoyas.jhsinformaticsolutionsbackend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages= "com.ceramicasietecoyas.jhsinformaticsolutionsbackend")
@SpringBootApplication
@EnableAutoConfiguration(exclude={DataSourceAutoConfiguration.class})
public class JhsinformaticsolutionsbackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(JhsinformaticsolutionsbackendApplication.class, args);
	}
}
