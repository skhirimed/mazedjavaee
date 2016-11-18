package tn.mazed.entities;

import java.io.Serializable;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: YankeeAuction
 *
 */
@Entity
@DiscriminatorValue(value="Yankee")
public class YankeeAuction extends Auction implements Serializable {

	
	private static final long serialVersionUID = 1L;

	public YankeeAuction() {
		super();
	}
   
}
