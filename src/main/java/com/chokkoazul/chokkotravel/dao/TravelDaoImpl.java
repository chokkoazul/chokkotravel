package com.chokkoazul.chokkotravel.dao;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.chokkoazul.chokkotravel.entities.Travel;

@Stateless
public class TravelDaoImpl implements TravelDao {

	@PersistenceContext(unitName = "UserPU")
	EntityManager em;
	
	@SuppressWarnings("unchecked")
	public List<Travel> getAll() {
		// TODO Auto-generated method stub
		return em.createNamedQuery("Travel.findAll").getResultList();

	}

	public Travel getTravelById(Integer idTravel) {
		Travel travelOut =  em.find(Travel.class, idTravel);
		return travelOut;
		
	}

	public void insertTravel(Travel travel) {
		// TODO Auto-generated method stub
		em.persist(travel);
	}

}
