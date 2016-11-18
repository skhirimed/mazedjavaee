package tn.mazed.entities;

import java.io.Serializable;

import javax.persistence.*;


/**
 * Entity implementation class for Entity: Bid
 *
 */
@Entity

public class Bid implements Serializable {

	@EmbeddedId
	private BidId idBid;
	
	@ManyToOne
	@JoinColumn(name = "idUser", referencedColumnName = "id", updatable = false, insertable = false)
	private User user;
	@ManyToOne
	@JoinColumn(name = "idAuction", referencedColumnName = "idAuction", updatable = false, insertable = false)
	private Auction auction;
	
	private float amount;
	

	private static final long serialVersionUID = 1L;

	public Bid() {
		super();
	}

	public BidId getIdBid() {
		return idBid;
	}

	public void setIdBid(BidId idBid) {
		this.idBid = idBid;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Auction getAuction() {
		return auction;
	}

	public void setAuction(Auction auction) {
		this.auction = auction;
	}

	public float getAmount() {
		return amount;
	}

	public void setAmount(float amount) {
		this.amount = amount;
	}
	
	
   
}
