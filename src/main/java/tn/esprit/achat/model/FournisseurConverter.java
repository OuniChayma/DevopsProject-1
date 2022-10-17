package tn.esprit.achat.model;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import tn.esprit.rh.achat.entities.Fournisseur;
import tn.esprit.rh.achat.entities.Produit;
@Component
public class FournisseurConverter {
	 public FournisseurModel convertEntityToDto(Fournisseur fournisseur) {
	        ModelMapper modelMapper = new ModelMapper();
	        return modelMapper.map(fournisseur, FournisseurModel.class);}
	 
	 public Fournisseur convertDtoToEntity(FournisseurModel customerDTO) {
	        ModelMapper modelMapper = new ModelMapper();
	        return modelMapper.map(customerDTO, Fournisseur.class);
	    }

}
