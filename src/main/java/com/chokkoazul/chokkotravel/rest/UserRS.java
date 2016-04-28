package com.chokkoazul.chokkotravel.rest;

import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
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
	
	@GET
	@Path("{userId}")
    @Produces("application/json")
    public String getUserById(@PathParam("userId") String id) throws JsonProcessingException{
		ObjectMapper mapper = new ObjectMapper();
		
    	User usuario = userDao.getUserById(Integer.valueOf(id));
    	
    	String jsonInString = mapper.writeValueAsString(usuario);
		
		return jsonInString;
    	
	}
	
    @POST
    @Consumes("application/json")
    public void insertaNombre(User user) throws JsonProcessingException {
    	userDao.insertUser(user);
    }
	
}
