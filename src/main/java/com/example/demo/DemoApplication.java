package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@RestController
	public class UserController {

		@GetMapping("/api/users/{id}")
		public User getUser(@PathVariable long id) {
			if (id == 1) {

				User user = new User();
				user.setId(1);
				user.setName("chhay");
				user.setEmail("chhay@gmail.com");
				return user;
			} else {
				return null; // Return null or handle the case when the user is not found
			}
		}
	}

	// test

	public class User {
		private long id;
		private String name, email;

		// Constructors, getters, and setters

		public long getId() {
			return id;
		}

		public void setId(long id) {
			this.id = id;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		public String getEmail() {
			return email;
		}
	}
}
