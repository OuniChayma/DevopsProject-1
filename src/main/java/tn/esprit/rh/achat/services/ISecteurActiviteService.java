package tn.esprit.rh.achat.services;

import tn.esprit.achat.model.SecteurModel;
import tn.esprit.achat.model.StockModel;
import tn.esprit.rh.achat.entities.SecteurActivite;

import java.util.List;

public interface ISecteurActiviteService {

	List<SecteurActivite> retrieveAllSecteurActivite();

	SecteurActivite addSecteurActivite(SecteurActivite sa);

	void deleteSecteurActivite(Long id);

	SecteurActivite updateSecteurActivite(SecteurActivite sa);

	SecteurActivite retrieveSecteurActivite(Long id);
	public SecteurModel saveSecteur(SecteurModel secteurModel);


}
