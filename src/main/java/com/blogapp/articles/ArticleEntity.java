package com.blogapp.articles;

import java.util.Date;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.lang.NonNull;

import com.blogapp.user.UserEntity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="article")
public class ArticleEntity {
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	@Column(name="article_id")
	private Long id;
	
	@Column
	@NonNull
	private String title;
	
	@Column
	@NonNull
	private String slug;
	
	@Column
	@NonNull
	private String subtitle;
	
	@Column
	@NonNull
	private String body;
	
	@CreatedDate
	private Date createdAt;
	
	@ManyToOne
	@JoinColumn(name="author_id",nullable = false)
	private UserEntity author;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getSlug() {
		return slug;
	}

	public void setSlug(String slug) {
		this.slug = slug;
	}

	public String getSubtitle() {
		return subtitle;
	}

	public void setSubtitle(String subtitle) {
		this.subtitle = subtitle;
	}

	public String getBody() {
		return body;
	}

	public void setBody(String body) {
		this.body = body;
	}

	public Date getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	public UserEntity getAuthor() {
		return author;
	}

	public void setAuthor(UserEntity author) {
		this.author = author;
	}

	public ArticleEntity() {
		super();
	}

	public ArticleEntity(Long id, String title, String slug, String subtitle, String body, Date createdAt,
			UserEntity author) {
		super();
		this.id = id;
		this.title = title;
		this.slug = slug;
		this.subtitle = subtitle;
		this.body = body;
		this.createdAt = createdAt;
		this.author = author;
	}

	@Override
	public String toString() {
		return "ArticleEntity [id=" + id + ", title=" + title + ", slug=" + slug + ", subtitle=" + subtitle + ", body="
				+ body + ", createdAt=" + createdAt + ", author=" + author + "]";
	}
	
	

}
