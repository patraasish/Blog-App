package com.blogapp.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import jakarta.activation.DataSource;

@Configuration
public class JpaTestConfig {
	
	@Bean
	public DataSource dataSource() {
		
		var dataSource = new DriverManagerDataSource();
		dataSource.setDriverClassName("org.h2.Driver");
		dataSource.setUrl("jdbc:h2:mem:testdb2");
		dataSource.setUsername("root");
		dataSource.setPassword("root");
		
		return (DataSource) dataSource;
	}

}
