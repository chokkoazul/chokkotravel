package com.chokkoazul.chokkotravel.ejb;

import java.util.List;

import javax.ejb.Local;

import com.chokkoazul.chokkotravel.entities.User;

@Local
public interface UserService {

	public List<User> getUserAll();
	
	public User getUserById(Integer idUser);
	
	public void insertUser(User user);
	
}