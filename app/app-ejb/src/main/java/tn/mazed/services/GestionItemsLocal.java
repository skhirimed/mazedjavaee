package tn.mazed.services;

import java.util.List;

import javax.ejb.Local;

import tn.mazed.entities.Item;

@Local
public interface GestionItemsLocal {
	String ajouterItem(Item item);

	String modifierItem(Item item);

	String supprimerItem(Item item);

	Item chercherLaboParId(int id);

	List<Item> chercherLaboParNom(String nom);

}
