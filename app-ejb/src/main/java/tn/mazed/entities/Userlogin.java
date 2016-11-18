package tn.mazed.entities;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the aspnetuserlogins database table.
 * 
 */
@Entity
@Table(name="aspnetuserlogins")
@NamedQuery(name="Aspnetuserlogin.findAll", query="SELECT a FROM Userlogin a")
public class Userlogin implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private UserloginPK id;

	//bi-directional many-to-one association to Aspnetuser
	@ManyToOne
	@JoinColumn(name="UserId")
	private User user;

	public Userlogin() {
	}

	public UserloginPK getId() {
		return id;
	}

	public void setId(UserloginPK id) {
		this.id = id;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	

}