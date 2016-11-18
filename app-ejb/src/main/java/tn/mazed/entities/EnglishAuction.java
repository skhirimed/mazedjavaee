package tn.mazed.entities;

import java.io.Serializable;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: EnglishAuction
 *
 */
@Entity
@DiscriminatorValue(value="English")
public class EnglishAuction extends Auction implements Serializable {

	
	private static final long serialVersionUID = 1L;

	public EnglishAuction() {
		super();
	}
   
}
