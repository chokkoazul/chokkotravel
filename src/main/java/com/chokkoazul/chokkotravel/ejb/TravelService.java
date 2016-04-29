package com.chokkoazul.chokkotravel.ejb;

import java.util.List;

import javax.ejb.Local;

import com.chokkoazul.chokkotravel.entities.Travel;

@Local
public interface TravelService {

	public List<Travel> getTravelAll();
	
	public Travel getTravelById(Integer idTravel);
	
	public void insertTravel(Travel travel);
	
}
