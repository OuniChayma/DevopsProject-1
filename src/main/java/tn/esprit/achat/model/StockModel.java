package tn.esprit.achat.model;

import java.util.Set;



import lombok.Data;

import tn.esprit.rh.achat.entities.Produit;
@Data
public class StockModel {
	
	
	private Long idStock;
	private String libelleStock;
	private Integer qte;
	private Integer qteMin;
	
	private Set<Produit> produits;
	


	

}
