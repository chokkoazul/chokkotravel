package com.chokkoazul.chokkotravel.dao;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

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

	public void insertUser(User user) {
		em.persist(user);
		// TODO Auto-generated method stub
		
	}

	public User getUserById(Integer idUser) {
		// TODO Auto-generated method stub
		User userOut =  em.find(User.class, idUser);
		return userOut;
	}

	@SuppressWarnings("unused")
	public User getUserByUserAndPass(String user,String pass) {
		// TODO Auto-generated method stub
		User u=null;
		Query q = em.createNamedQuery("User.findUserPass");
		q.setParameter(1, user);
		q.setParameter(2, pass);
		
		try{
			u = (User) q.getSingleResult();
		}catch(Exception e){
			return u;
		}
		
		return u;
	}

}
