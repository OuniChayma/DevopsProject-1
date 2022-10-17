package tn.esprit.achat.model;

import java.util.Date;
import java.util.Set;

import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Data;
import tn.esprit.rh.achat.entities.CategorieProduit;
import tn.esprit.rh.achat.entities.DetailFacture;
import tn.esprit.rh.achat.entities.Produit;
import tn.esprit.rh.achat.entities.Stock;
@Data
public class StockModel {
	
	
	private Long idStock;
	private String libelleStock;
	private Integer qte;
	private Integer qteMin;
	
	private Set<Produit> produits;
	


	

}
