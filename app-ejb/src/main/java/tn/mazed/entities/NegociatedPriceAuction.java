package tn.mazed.entities;

import java.io.Serializable;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: NegociatedPriceAuction
 *
 */
@Entity
@DiscriminatorValue(value="NegociatedPrice")
public class NegociatedPriceAuction extends Auction implements Serializable {

	private float reserve;

	public float getReserve() {
		return reserve;
	}

	public void setReserve(float reserve) {
		this.reserve = reserve;
	}

	private static final long serialVersionUID = 1L;

	public NegociatedPriceAuction() {
		super();
	}
   
}
