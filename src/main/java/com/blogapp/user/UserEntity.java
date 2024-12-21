package com.blogapp.user;

import org.springframework.lang.NonNull;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="users")
public class UserEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	@Column(name="user_id", nullable=false)
	private Long id;
	
	@Column(nullable = false)
	@NonNull
	private String username;
	
	@Column(nullable = false)
	@NonNull
	private String email;
	
	@Column(nullable = false)
	@NonNull
	private String bio;
	
	@Column(nullable = false)
	@NonNull
	private String image;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getBio() {
		return bio;
	}

	public void setBio(String bio) {
		this.bio = bio;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public UserEntity() {
		super();
	}

	public UserEntity(Long id, String username, String email, String bio, String image) {
		super();
		this.id = id;
		this.username = username;
		this.email = email;
		this.bio = bio;
		this.image = image;
	}

	@Override
	public String toString() {
		return "UserEntity [id=" + id + ", username=" + username + ", email=" + email + ", bio=" + bio + ", image="
				+ image + "]";
	}
	
	
	

}
