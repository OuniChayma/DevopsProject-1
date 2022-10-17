package tn.esprit.rh.achat.services;

import tn.esprit.achat.model.OperateurModel;
import tn.esprit.achat.model.ReglementModel;
import tn.esprit.rh.achat.entities.Operateur;

import java.util.List;


public interface IOperateurService {

	List<Operateur> retrieveAllOperateurs();

	Operateur addOperateur(Operateur o);

	void deleteOperateur(Long id);

	Operateur updateOperateur(Operateur o);

	Operateur retrieveOperateur(Long id);
	public OperateurModel saveOperateur(OperateurModel operateurModel);


}
