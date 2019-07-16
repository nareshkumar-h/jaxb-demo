package com.naresh.dao;

import com.revature.webservice.UserDTO;

public class UserDAO {

	public static UserDTO login(String email, String password) {
		
		//returning a dummy user object
		UserDTO dto = new UserDTO();
		dto.setId(1);
		dto.setName("naresh");
		dto.setEmail("naresh@gmail.com");
		dto.setPassword("pass123");
		return dto;
		
		
	}
}
