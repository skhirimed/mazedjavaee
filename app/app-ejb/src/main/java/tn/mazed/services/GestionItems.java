package tn.mazed.services;

import java.util.List;

import javax.ejb.Local;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import tn.mazed.entities.Item;



@Stateless
public class GestionItems implements GestionItemRemote, GestionItemsLocal{

	@PersistenceContext
	EntityManager em;
	
	@Override
	public String ajouterItem(Item item) {
		em.persist(item);
		return "suceess";
	}

	@Override
	public String modifierItem(Item item) {
		em.merge(item);
		return "success";
	}

	@Override
	public String supprimerItem(Item item) {
		em.remove(em.merge(item));
		return "success";
	}

	@Override
	public Item chercherLaboParId(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Item> chercherLaboParNom(String nom) {
		// TODO Auto-generated method stub
		return null;
	}
}
