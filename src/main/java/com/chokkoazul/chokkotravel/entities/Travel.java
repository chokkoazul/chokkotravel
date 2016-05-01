package com.chokkoazul.chokkotravel.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@NamedQueries( { @NamedQuery(name = "Travel.findAll", query = "SELECT t FROM Travel t ORDER BY t.idTravel") })
@Table(name="travel")
public class Travel {

	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="SEQUENCE2")
	@SequenceGenerator(name="SEQUENCE2", sequenceName="SEQUENCE2", allocationSize=1)
    @Column(name = "id_travel")
	private Integer idTravel;
	
	//@ManyToOne(cascade={CascadeType.ALL})
	@ManyToOne
	@JoinColumn(name = "id_user")
	private User user;

    /*@Column(name = "id_user")
	private Integer idUser;
	*/
	@Column(name = "name")
	private String name;

	public Integer getIdTravel() {
		return idTravel;
	}

	public void setIdTravel(Integer idTravel) {
		this.idTravel = idTravel;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	/*public Integer getIdUser() {
		return idUser;
	}

	public void setIdUser(Integer idUser) {
		this.idUser = idUser;
	}*/
	
	
	
	
	
}
