package com.chokkoazul.chokkotravel.ejb;

import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Stateless;

import com.chokkoazul.chokkotravel.dao.TravelDao;
import com.chokkoazul.chokkotravel.entities.Travel;

@Stateless
public class TravelServiceImpl implements TravelService {

	
	@EJB
	private TravelDao travelDao;
	
	public List<Travel> getTravelAll() {
		// TODO Auto-generated method stub
		return travelDao.getAll();
	}

	public Travel getTravelById(Integer idTravel) {
		// TODO Auto-generated method stub
		return travelDao.getTravelById(idTravel);
	}

	public void insertTravel(Travel travel) {
		// TODO Auto-generated method stub
		travelDao.insertTravel(travel);
	}

}
