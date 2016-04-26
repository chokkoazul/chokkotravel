package com.chokkoazul.chokkotravel.rest;

import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import com.chokkoazul.chokkotravel.dao.UserDao;
import com.chokkoazul.chokkotravel.entities.User;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@Stateless
@Path("/user")
public class UserRS {

	@EJB
	private UserDao userDao;
	
	@GET
    @Produces("application/json")
    public String getUserAll() throws JsonProcessingException{
		ObjectMapper mapper = new ObjectMapper();
		
    	List<User> lista = userDao.getAll();
    	
    	String jsonInString = mapper.writeValueAsString(lista);
		
		return jsonInString;
    	
	}
	
}
