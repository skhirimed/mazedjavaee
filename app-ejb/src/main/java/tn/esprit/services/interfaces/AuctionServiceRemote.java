package tn.esprit.services.interfaces;

import java.util.List;

import javax.ejb.Remote;

import tn.mazed.entities.Auction;
import tn.mazed.entities.User;

@Remote
public interface AuctionServiceRemote {
	boolean addOrUpdateAuction(Auction a);
	boolean deleteAuction(Auction a);
	boolean deleteAuctionById(int id);
	Auction getAuctionById(int id);
	List<Auction> getAllAuctions();
	List<Auction> getAuctionsByUser(User u);
	
	
}
