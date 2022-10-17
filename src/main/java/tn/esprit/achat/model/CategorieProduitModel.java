package tn.esprit.achat.model;

import java.util.Set;


import lombok.Data;

import tn.esprit.rh.achat.entities.Produit;
@Data
public class CategorieProduitModel {
	
	
	
	private Long idCategorieProduit;
	private String codeCategorie;
	private String libelleCategorie;
	private Set<Produit> produits;


	

}
