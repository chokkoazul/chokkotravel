package com.chokkoazul.chokkotravel.dao;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.chokkoazul.chokkotravel.entities.User;

@Stateless
public class UserDaoImpl implements UserDao {

	@PersistenceContext(unitName = "UserPU")
	EntityManager em;
	
	@SuppressWarnings("unchecked")
	public List<User> getAll() {
		// TODO Auto-generated method stub
		return em.createNamedQuery("User.findAll").getResultList();

	}

}
