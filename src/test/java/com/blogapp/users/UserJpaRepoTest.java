package com.blogapp.users;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.ActiveProfiles;

import com.blogapp.user.UserEntity;
import com.blogapp.user.UserRepository;

@DataJpaTest
@ActiveProfiles("test")
public class UserJpaRepoTest {

	@Autowired
	private UserRepository userRepository;

	@Test
	void create_users() {

		UserEntity user1 = new UserEntity(null, "Asish", "a@gmail.com", "writer", "image1");

		var userResponse = userRepository.save(user1);
		System.out.println(userResponse);
		Assertions.assertNotNull(userResponse);

	}
}
