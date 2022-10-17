package tn.esprit.achat.model;

import java.util.Set;



import lombok.Data;
import tn.esprit.rh.achat.entities.Fournisseur;
@Data
public class SecteurModel {
	
	
	private Long idSecteurActivite;
	private String codeSecteurActivite;
	private String libelleSecteurActivite;
	
	private Set<Fournisseur> fournisseurs;

	

}
