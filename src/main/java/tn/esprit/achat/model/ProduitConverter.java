package tn.esprit.achat.model;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;
import tn.esprit.rh.achat.entities.Produit;
@Component
public class ProduitConverter {
	 public ProduitModel convertEntityToDto(Produit produit) {
	        ModelMapper modelMapper = new ModelMapper();
	        return modelMapper.map(produit, ProduitModel.class);}
	 
	 public Produit convertDtoToEntity(ProduitModel customerDTO) {
	        ModelMapper modelMapper = new ModelMapper();
	        return modelMapper.map(customerDTO, Produit.class);
	    }

}
