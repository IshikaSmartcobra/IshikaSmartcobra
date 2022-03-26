package com.jpa.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.ApplicationContext;

import com.jpa.test.dao.UserRepository;
import com.jpa.test.entities.User;

@EnableAutoConfiguration(exclude={DataSourceAutoConfiguration.class})
@SpringBootApplication(scanBasePackages = "com.jpa.test") 
public class BootJpaExampleApplication {

	public static void main(String[] args) {
ApplicationContext context=SpringApplication.run(BootJpaExampleApplication.class, args);
UserRepository userRepository=context.getBean(UserRepository.class);
User user =new User();
user.setName("bhagyashri deokar");
user.setCity("Nashik");
user.setStatus("java developer");
User user1=userRepository.save(user);
	System.out.println(user1);
	}

}
