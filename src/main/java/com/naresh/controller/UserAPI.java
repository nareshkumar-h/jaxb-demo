package com.naresh.controller;

import com.naresh.dao.UserDAO;
import com.revature.webservice.GetLoginRequest;
import com.revature.webservice.GetLoginResponse;
import com.revature.webservice.UserDTO;

//@Endpoint
public class UserAPI {

	private static final String NAMESPACE_URI = "http://revature.com/webservice";

	//@PayloadRoot(namespace = NAMESPACE_URI, localPart = "getLoginRequest")
	//@ResponsePayload
	public GetLoginResponse login(/*@RequestPayload*/GetLoginRequest request) {
		
		UserDTO user = UserDAO.login(request.getEmail(), request.getPassword());
		GetLoginResponse response = new GetLoginResponse();
		response.setUser(user);
		return response;
	}
	
}
