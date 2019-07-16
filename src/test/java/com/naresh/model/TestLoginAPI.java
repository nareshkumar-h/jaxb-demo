package com.naresh.model;

import com.naresh.controller.UserAPI;
import com.revature.webservice.GetLoginRequest;
import com.revature.webservice.GetLoginResponse;
import com.revature.webservice.UserDTO;

public class TestLoginAPI {

	public static void main(String[] args) {

		//Request Object
		GetLoginRequest request = new GetLoginRequest();
		request.setEmail("naresh@gmail.com");
		request.setPassword("pass123");
		
		//API Call
		UserAPI userAPI = new UserAPI();
		GetLoginResponse apiResponse = userAPI.login(request);
		
		
		
		//Response Object
		GetLoginResponse response = new GetLoginResponse();
		UserDTO userDTO = new UserDTO();
		userDTO.setId(1);
		userDTO.setName("naresh");
		userDTO.setEmail("naresh@gmail.com");
		response.setUser(userDTO);
		
		
		
	}

}
