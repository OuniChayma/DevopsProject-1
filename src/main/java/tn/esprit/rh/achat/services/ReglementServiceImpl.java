package tn.esprit.rh.achat.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.esprit.achat.model.OperateurConverter;
import tn.esprit.achat.model.ReglementConverter;
import tn.esprit.achat.model.ReglementModel;
import tn.esprit.rh.achat.entities.Operateur;
import tn.esprit.rh.achat.entities.Reglement;
import tn.esprit.rh.achat.repositories.FactureRepository;
import tn.esprit.rh.achat.repositories.ReglementRepository;

import java.util.Date;
import java.util.List;

@Service
public class ReglementServiceImpl implements IReglementService {
	@Autowired
	ReglementConverter customerConverter;

	@Autowired
	FactureRepository factureRepository;
	@Autowired
	ReglementRepository reglementRepository;
	@Override
	public List<Reglement> retrieveAllReglements() {
		return (List<Reglement>) reglementRepository.findAll();
	}

	@Override
	public Reglement addReglement(Reglement r) {
        reglementRepository.save(r);
		return r;
	}

	@Override
	public Reglement retrieveReglement(Long id) {
	
		
		return reglementRepository.findById(id).orElse(null);
	}

	@Override
	public List<Reglement> retrieveReglementByFacture(Long idFacture) {
		return reglementRepository.retrieveReglementByFacture(idFacture);
				
	}

	@Override
	public float getChiffreAffaireEntreDeuxDate(Date startDate, Date endDate) {
		return reglementRepository.getChiffreAffaireEntreDeuxDate( startDate, endDate);
	}

	@Override
	public ReglementModel saveReglement(ReglementModel reglementModel) {
		Reglement customer = customerConverter.convertDtoToEntity(reglementModel);
        customer = reglementRepository.save(customer);
        return customerConverter.convertEntityToDto(customer);
		
	}

}
