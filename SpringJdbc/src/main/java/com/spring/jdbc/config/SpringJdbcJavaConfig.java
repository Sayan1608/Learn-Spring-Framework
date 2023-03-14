package com.spring.jdbc.config;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
@ComponentScan(basePackages = "com.spring.jdbc.Dao")
public class SpringJdbcJavaConfig {

	@Bean(name = { "ds" })
	public DataSource getDataSource() {
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
		dataSource.setUrl("jdbc:mysql://localhost:3306/springjdbc");
		dataSource.setUsername("root");
		dataSource.setPassword("sayan");
		return dataSource;
	}

	@Bean(name = { "jdbcTemplate" })
	public JdbcTemplate getJdbcTemplate() {
		JdbcTemplate jdbcTemplate = new JdbcTemplate(getDataSource());
		return jdbcTemplate;
	}

	

}
