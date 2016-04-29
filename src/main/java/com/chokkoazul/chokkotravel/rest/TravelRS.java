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

import com.chokkoazul.chokkotravel.dao.TravelDao;
import com.chokkoazul.chokkotravel.entities.Travel;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@Stateless
@Path("/travel")
public class TravelRS {

	
	@EJB
	private TravelDao travelDao;
	
    @GET
    @Produces("application/json")
    public String getTravelAll() throws JsonProcessingException{
		ObjectMapper mapper = new ObjectMapper();
		
    	List<Travel> lista = travelDao.getAll();
    	
    	for(Travel lis:lista){
    		System.out.println("getIdTravel "+lis.getIdTravel());
    		System.out.println("getName "+lis.getName());
    		//System.out.println("getName user "+lis.getUser().getName());
    	}
    	
    	String jsonInString = mapper.writeValueAsString(lista);
		
		return jsonInString;
    	
	}
    
	@GET
	@Path("{travelId}")
    @Produces("application/json")
    public String getTravelById(@PathParam("travelId") String id) throws JsonProcessingException{
		ObjectMapper mapper = new ObjectMapper();
		
    	Travel travel = travelDao.getTravelById(Integer.valueOf(id));
    	
    	String jsonInString = mapper.writeValueAsString(travel);
		
		return jsonInString;
    	
	}
	
    @POST
    @Consumes("application/json")
    public void insertTravel(Travel travel) throws JsonProcessingException {
    	
    	travelDao.insertTravel(travel);
    }
}
