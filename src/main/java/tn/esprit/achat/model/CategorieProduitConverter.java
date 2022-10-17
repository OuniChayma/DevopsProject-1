package tn.esprit.achat.model;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import tn.esprit.rh.achat.entities.CategorieProduit;
@Component
public class CategorieProduitConverter {
	 public CategorieProduitModel convertEntityToDto(CategorieProduit categorieProduit) {
	        ModelMapper modelMapper = new ModelMapper();
	        return modelMapper.map(categorieProduit, CategorieProduitModel.class);}
	 
	 public CategorieProduit convertDtoToEntity(CategorieProduitModel customerDTO) {
	        ModelMapper modelMapper = new ModelMapper();
	        return modelMapper.map(customerDTO, CategorieProduit.class);
	    }

}
