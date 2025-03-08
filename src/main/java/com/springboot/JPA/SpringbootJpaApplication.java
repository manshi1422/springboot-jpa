package com.springboot.JPA;

import com.springboot.JPA.repositories.userInterface;
import com.springboot.JPA.entities.user;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class SpringbootJpaApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootJpaApplication.class, args);
		System.out.print("hello");


	}
	@Bean
	public CommandLineRunner run(userInterface user){
		return (args) -> {
//			insertUser(user);
			List<user> users = user.getAllUser();
			List<user> usersname = user.getAllUserByName("9262244464");

			usersname.forEach(user1 -> System.out.print(user1));
		};
	}
	public void insertUser(userInterface user){
		user.save(new user("9262244464","456789"));

	}

}
