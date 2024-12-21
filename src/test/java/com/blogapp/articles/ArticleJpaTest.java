package com.blogapp.articles;

import java.util.Date;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.ActiveProfiles;

import com.blogapp.user.UserEntity;
import com.blogapp.user.UserRepository;

@DataJpaTest
@ActiveProfiles("test")
public class ArticleJpaTest {

	@Autowired
	private ArticleRepository articleRepository;

	@Autowired
	private UserRepository userRepository;

	@Test
	void create_article() {

		UserEntity user1 = new UserEntity(null, "Asish", "a@gmail.com", "writer", "image1");

		var result = userRepository.save(user1);

		Date createdAt = new Date();

		System.out.println(result);
		ArticleEntity article = new ArticleEntity(null, "my article", "slug", "sub title", "This is article", createdAt,
				result);

		var artResponse = articleRepository.save(article);
		System.out.println(artResponse);

		Assertions.assertNotNull(artResponse);
	}

}
