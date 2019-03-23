package cn.eric.register;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class RegisterApplication {
//git 1 add 
	public static void main(String[] args) {
		SpringApplication.run(RegisterApplication.class, args);
	}
}
