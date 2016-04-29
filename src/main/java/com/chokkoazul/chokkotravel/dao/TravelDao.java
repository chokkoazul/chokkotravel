package com.chokkoazul.chokkotravel.dao;

import java.util.List;

import com.chokkoazul.chokkotravel.entities.Travel;

public interface TravelDao {

	public List<Travel> getAll();
	
	public Travel getTravelById(Integer idTravel);
	
	public void insertTravel(Travel travel);

	
}
