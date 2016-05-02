package com.chokkoazul.chokkotravel.entities;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@NamedQueries( { @NamedQuery(name = "User.findAll", query = "SELECT u FROM User u ORDER BY u.idUser"),
			     @NamedQuery(name = "User.findUserPass", query = "SELECT u FROM User u where u.user = ?1 and u.pass = ?2")})

@Table(name="user")
public class User {

	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="SEQUENCE1")
	@SequenceGenerator(name="SEQUENCE1", sequenceName="SEQUENCE1", allocationSize=1)
	@Column(name = "id_user")
	private Integer idUser;
	
	@Column(name = "user")
	private String user;

	@Column(name = "pass")
	private String pass;
	
	@Column(name = "name")
	private String name;
	

	public User(){
		
	}

	public User(Integer idUser,String user,String pass,String name){
		this.idUser=idUser;
		this.user=user;
		this.pass=pass;
		this.name=name;
	}

	public Integer getIdUser() {
		return idUser;
	}

	public void setIdUser(Integer idUser) {
		this.idUser = idUser;
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
	
	
	
}