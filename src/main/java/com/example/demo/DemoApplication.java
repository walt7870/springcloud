package com.example.demo;

import com.example.eureka.EurekaApplication;
import com.example.eurekacli.EurekacliApplication;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
//@EnableZuulProxy
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
//		SpringApplication.run(EurekaApplication.class, args);
//		SpringApplication.run(EurekacliApplication.class, args);
	}
}
