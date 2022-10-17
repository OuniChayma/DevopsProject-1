package tn.esprit.achat.model;

import java.util.Set;



import lombok.Data;
import tn.esprit.rh.achat.entities.Facture;


@Data
public class OperateurModel {
	
	
	private Long idOperateur;
	private String nom;
	private String prenom;
	
	private String password;
	
	private Set<Facture> factures;

	

}
