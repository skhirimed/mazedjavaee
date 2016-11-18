package tn.mazed.entities;

import java.io.Serializable;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: AggregateAuction
 *
 */
@Entity
@DiscriminatorValue(value="Aggregate")
public class AggregateAuction extends Auction implements Serializable {

	private float fixedPrice;
	private int nbrItemsAvailable;
	private float droppingAmount;
	/*
	 * to make my life easier
	 * changes type from buy now => bid 
	 * */
	private boolean isFixedPriceType;
	
	private static final long serialVersionUID = 1L;

	public AggregateAuction() {
		super();
	}

	public float getFixedPrice() {
		return fixedPrice;
	}

	public void setFixedPrice(float fixedPrice) {
		this.fixedPrice = fixedPrice;
	}

	public int getNbrItemsAvailable() {
		return nbrItemsAvailable;
	}

	public void setNbrItemsAvailable(int nbrItemsAvailable) {
		this.nbrItemsAvailable = nbrItemsAvailable;
	}

	public float getDroppingAmount() {
		return droppingAmount;
	}

	public void setDroppingAmount(float droppingAmount) {
		this.droppingAmount = droppingAmount;
	}

	public boolean isFixedPriceType() {
		return isFixedPriceType;
	}

	public void setFixedPriceType(boolean isFixedPriceType) {
		this.isFixedPriceType = isFixedPriceType;
	}
   
}
