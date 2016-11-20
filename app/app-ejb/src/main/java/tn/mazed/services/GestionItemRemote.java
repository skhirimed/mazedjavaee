package tn.mazed.services;

import java.util.List;

import javax.ejb.Remote;

import tn.mazed.entities.Item;
@Remote
public interface GestionItemRemote {
	String ajouterItem(Item item);

	String modifierItem(Item item);

	String supprimerItem(Item item);

	Item chercherLaboParId(int id);

	List<Item> chercherLaboParNom(String nom);
}
