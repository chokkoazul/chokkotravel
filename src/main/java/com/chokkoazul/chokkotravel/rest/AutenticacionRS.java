package com.chokkoazul.chokkotravel.rest;

import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import com.chokkoazul.chokkotravel.dao.UserDao;
import com.chokkoazul.chokkotravel.entities.Autenticacion;
import com.chokkoazul.chokkotravel.entities.User;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@Stateless
@Path("/autenticacion")
public class AutenticacionRS {

	
	@EJB
	private UserDao userDao;

	@GET
	@Path("{user}/{pass}")
    @Produces("application/json")
    public String getUser(@PathParam("user") String user,@PathParam("pass") String pass) throws JsonProcessingException{
		ObjectMapper mapper = new ObjectMapper();
		Autenticacion aut = new Autenticacion();
		
    	User us = userDao.getUserByUserAndPass(user,pass);
    	
    	if(us==null){
    		aut.setCorrecto("No");
    	}
    	else{
    		aut.setCorrecto("Si");
    	}
    	
    	aut.setUsuario(us);
    	String jsonInString = mapper.writeValueAsString(aut);
		
		return jsonInString;
    	
	}
	
	
}
