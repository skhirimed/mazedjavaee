package tn.mazed.entities;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the aspnetuserclaims database table.
 * 
 */
@Entity
@Table(name="aspnetuserclaims")
@NamedQuery(name="Aspnetuserclaim.findAll", query="SELECT a FROM Userclaim a")
public class Userclaim implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;

	@Lob
	private String claimType;

	@Lob
	private String claimValue;

	//bi-directional many-to-one association to Aspnetuser
	@ManyToOne
	@JoinColumn(name="UserId")
	private User user;

	public Userclaim() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getClaimType() {
		return this.claimType;
	}

	public void setClaimType(String claimType) {
		this.claimType = claimType;
	}

	public String getClaimValue() {
		return this.claimValue;
	}

	public void setClaimValue(String claimValue) {
		this.claimValue = claimValue;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	

}