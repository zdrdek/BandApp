package com.BandApp.BandApp;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

@Component
public class JdbcMemberDao implements MemberDao {

private JdbcTemplate jdbcTemplate;
	
	@Autowired
	public JdbcMemberDao(DataSource dataSource) {
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}
	
//								***METHOD CREATE A NEW USER AND ENTER THE INFO TO THE DB***
	
	@Override
	public void createAccount(Member member) {
		String sqlInsertReview = "INSERT INTO member(user_name, password) "
				+ "					   VALUES (			?,			?) RETURNING band_id";

		long id = jdbcTemplate.queryForObject(sqlInsertReview, Long.class, member.getUserId(), member.getPassword());
		member.setBandId(id);
		
	}
}
