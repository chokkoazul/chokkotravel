package com.chokkoazul.chokkotravel.dao;

import java.util.List;

import com.chokkoazul.chokkotravel.entities.User;

public interface UserDao {

	public List<User> getAll();
	
	public User getUserById(Integer idUser);
	
	public User getUserByUserAndPass(String user,String pass);
	
	public void insertUser(User user);
	
	
	
}
