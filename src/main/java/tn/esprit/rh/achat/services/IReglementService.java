package tn.esprit.rh.achat.services;

import tn.esprit.achat.model.ReglementModel;
import tn.esprit.rh.achat.entities.Reglement;

import java.util.Date;
import java.util.List;

public interface IReglementService {

	List<Reglement> retrieveAllReglements();
	Reglement addReglement(Reglement r);
	Reglement retrieveReglement(Long id);
	List<Reglement> retrieveReglementByFacture(Long idFacture);
	float getChiffreAffaireEntreDeuxDate(Date startDate, Date endDate); 
	public ReglementModel saveReglement(ReglementModel reglementModel);


}
