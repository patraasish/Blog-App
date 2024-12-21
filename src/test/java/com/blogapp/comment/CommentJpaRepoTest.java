package com.blogapp.comment;

import java.util.Date;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.ActiveProfiles;

import com.blogapp.articles.ArticleEntity;
import com.blogapp.articles.ArticleRepository;
import com.blogapp.comments.CommentEntity;
import com.blogapp.comments.CommentRepository;
import com.blogapp.user.UserEntity;
import com.blogapp.user.UserRepository;

@DataJpaTest
@ActiveProfiles("test")
public class CommentJpaRepoTest {

	@Autowired
	private CommentRepository commentRepository;

	@Autowired
	private ArticleRepository articleRepository;

	@Autowired
	private UserRepository userRepository;

	@Test
	void create_comment() {

		UserEntity user1 = new UserEntity(null, "Asish", "a@gmail.com", "writer", "image1");

		var result = userRepository.save(user1);

		Date createdAt = new Date();

		System.out.println(result);
		ArticleEntity article = new ArticleEntity(null, "my article", "slug", "sub title", "This is article", createdAt,
				result);

		var artResponse = articleRepository.save(article);

		Date createdArticleAt = new Date();
		CommentEntity comment = new CommentEntity(null, "comment", "great article", createdArticleAt, artResponse,
				result);

		var comments = commentRepository.save(comment);

		System.out.println(comments);
		Assertions.assertNotNull(comments);

	}

}
