package com.chokkoazul.chokkotravel.ejb;

import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.jws.WebService;

import com.chokkoazul.chokkotravel.dao.UserDao;
import com.chokkoazul.chokkotravel.entities.User;

@Stateless
@WebService(endpointInterface = "com.chokkoazul.chokkotravel.webservice.UserWS")
public class UserServiceImpl implements UserService {

	@EJB
	private UserDao userDao;
	
	public List<User> getUserAll() {
		// TODO Auto-generated method stub
		return userDao.getAll();
	}

	public void insertUser(User user) {
		userDao.insertUser(user);
		// TODO Auto-generated method stub
		
	}

	public User getUserById(Integer idUser) {
		// TODO Auto-generated method stub
		return userDao.getUserById(idUser);
	}

	public User getUserByUserAndPass(String user,String pass) {
		// TODO Auto-generated method stub
		return userDao.getUserByUserAndPass(user,pass);
	}

}
