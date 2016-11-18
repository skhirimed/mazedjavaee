package tn.mazed.entities;

import java.io.Serializable;
import java.lang.String;
import java.util.Collection;
import java.util.Date;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Auction
 *
 */
@Entity
@Table(name="Auctions")
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="AuctionType")
public class Auction implements Serializable {

	@Id
	private int idAuction;
	private String title;
	private String picture;
	private float priceEstimation;
	@Temporal(TemporalType.TIMESTAMP)
	private Date startDate;
	@Temporal(TemporalType.TIMESTAMP)
	private Date endDate;
	private float startPrice;
	private float currentPrice;
	@Lob
	private String details;
	private static final long serialVersionUID = 1L;
	
	@OneToMany
	private Collection<Item>items;
	
	@OneToMany
	private Collection<Comment> comments;
	
	@OneToMany(mappedBy="auction", cascade=CascadeType.ALL)
	private Collection<Bid> bids;
	
	@ManyToOne
	private User user;

	public Auction() {
		super();
	}   
	public int getIdAuction() {
		return this.idAuction;
	}

	public void setIdAuction(int idAuction) {
		this.idAuction = idAuction;
	}   
	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}   
	public String getPicture() {
		return this.picture;
	}

	public void setPicture(String picture) {
		this.picture = picture;
	}   
	public float getPriceEstimation() {
		return this.priceEstimation;
	}

	public void setPriceEstimation(float priceEstimation) {
		this.priceEstimation = priceEstimation;
	}   
	public Date getStartDate() {
		return this.startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}   
	public Date getEndDate() {
		return this.endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}   
	public float getStartPrice() {
		return this.startPrice;
	}

	public void setStartPrice(float startPrice) {
		this.startPrice = startPrice;
	}   
	public float getCurrentPrice() {
		return this.currentPrice;
	}

	public void setCurrentPrice(float currentPrice) {
		this.currentPrice = currentPrice;
	}   
	public String getDetails() {
		return this.details;
	}

	public void setDetails(String details) {
		this.details = details;
	}
	public Collection<Item> getItems() {
		return items;
	}
	public void setItems(Collection<Item> items) {
		this.items = items;
	}
	public Collection<Comment> getComments() {
		return comments;
	}
	public void setComments(Collection<Comment> comments) {
		this.comments = comments;
	}
	public Collection<Bid> getBids() {
		return bids;
	}
	public void setBids(Collection<Bid> bids) {
		this.bids = bids;
	}
   
}
