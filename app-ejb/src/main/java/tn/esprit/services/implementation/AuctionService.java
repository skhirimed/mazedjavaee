package tn.esprit.services.implementation;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import tn.esprit.services.interfaces.AuctionServiceRemote;
import tn.mazed.entities.Auction;
import tn.mazed.entities.User;

@Stateless
public class AuctionService implements AuctionServiceRemote {

	@PersistenceContext
	EntityManager em;
	
	@Override
	public boolean addOrUpdateAuction(Auction a) {
		try {
			em.merge(a);
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	@Override
	public boolean deleteAuction(Auction a) {
		try {
			em.remove(em.merge(a));
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	@Override
	public boolean deleteAuctionById(int id) {
		try {
			em.merge(em.find(Auction.class, id));
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	/*
	 * return null will be handled in business implementation :D
	 * */
	@Override
	public Auction getAuctionById(int id) {
		try {
			return em.find(Auction.class, id);
		} catch (Exception e) {
			return null;
		}
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Auction> getAllAuctions() {
		try {
			return em.createQuery("select a from Auction a").getResultList();
		} catch (Exception e) {
			return null;
		}
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Auction> getAuctionsByUser(User u) {
		try {
			return em.createQuery("select a from Auction a where a.user.id=:x")
					.setParameter("x", u.getId())
					.getResultList();
		} catch (Exception e) {
			return null;
		}
	}

}
