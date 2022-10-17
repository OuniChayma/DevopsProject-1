package tn.esprit.achat.model;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import tn.esprit.rh.achat.entities.Facture;
import tn.esprit.rh.achat.entities.Produit;
@Component
public class FactureConverter {
	 public FactureModel convertEntityToDto(Facture facture) {
	        ModelMapper modelMapper = new ModelMapper();
	        return modelMapper.map(facture, FactureModel.class);}
	 
	 public Facture convertDtoToEntity(FactureModel customerDTO) {
	        ModelMapper modelMapper = new ModelMapper();
	        return modelMapper.map(customerDTO, Facture.class);
	    }

}
