package tn.esprit.achat.model;

import java.util.Date;

import lombok.Data;

import tn.esprit.rh.achat.entities.Facture;
@Data
public class ReglementModel {
	
	
	private Long idReglement;
	private float montantPaye;
	private float montantRestant;
	private Boolean payee;

	private Date dateReglement;

	private Facture facture;
	


	

}
