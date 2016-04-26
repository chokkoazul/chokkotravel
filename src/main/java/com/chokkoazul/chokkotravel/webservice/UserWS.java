package com.chokkoazul.chokkotravel.webservice;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebService;

import com.chokkoazul.chokkotravel.entities.User;

@WebService
public interface UserWS {

	@WebMethod
	public List<User> getUserAll();
	
}
