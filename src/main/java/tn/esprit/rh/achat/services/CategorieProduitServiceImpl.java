package tn.esprit.rh.achat.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.esprit.achat.model.CategorieProduitConverter;
import tn.esprit.achat.model.CategorieProduitModel;

import tn.esprit.rh.achat.entities.CategorieProduit;
import tn.esprit.rh.achat.repositories.CategorieProduitRepository;

import java.util.List;

@Service
public class CategorieProduitServiceImpl implements ICategorieProduitService {
	

	CategorieProduitConverter customerConverter;
	@Autowired
	CategorieProduitRepository categorieProduitRepository;
	@Override
	public List<CategorieProduit> retrieveAllCategorieProduits() {
		
		return categorieProduitRepository.findAll();
	}

	@Override
	public CategorieProduit addCategorieProduit(CategorieProduit cp) {
		categorieProduitRepository.save(cp);
		return cp;
	}

	@Override
	public void deleteCategorieProduit(Long id) {
		categorieProduitRepository.deleteById(id);
		
	}

	@Override
	public CategorieProduit updateCategorieProduit(CategorieProduit cp) {
		
		return categorieProduitRepository.save(cp);
	}

	@Override
	public CategorieProduit retrieveCategorieProduit(Long id) {
		return categorieProduitRepository.findById(id).orElse(null);
	}
	@Override
	public CategorieProduitModel saveCategorieProduit(CategorieProduitModel categorieProduitModel) {
		  CategorieProduit customer = customerConverter.convertDtoToEntity(categorieProduitModel);
	        customer = categorieProduitRepository.save(customer);
	        return customerConverter.convertEntityToDto(customer);

}

}
