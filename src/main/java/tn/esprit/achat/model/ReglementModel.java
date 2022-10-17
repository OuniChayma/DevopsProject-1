package tn.esprit.achat.model;

import java.util.Date;
import java.util.Set;

import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Data;
import tn.esprit.rh.achat.entities.CategorieProduit;
import tn.esprit.rh.achat.entities.DetailFacture;
import tn.esprit.rh.achat.entities.Facture;
import tn.esprit.rh.achat.entities.Stock;
@Data
public class ReglementModel {
	
	
	private Long idReglement;
	private float montantPaye;
	private float montantRestant;
	private Boolean payee;

	private Date dateReglement;

	private Facture facture;
	


	

}
