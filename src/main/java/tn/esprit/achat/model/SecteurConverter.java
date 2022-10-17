package tn.esprit.achat.model;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;
import tn.esprit.rh.achat.entities.Produit;
import tn.esprit.rh.achat.entities.SecteurActivite;
@Component
public class SecteurConverter {
	 public SecteurModel convertEntityToDto(SecteurActivite secteurActivite) {
	        ModelMapper modelMapper = new ModelMapper();
	        return modelMapper.map(secteurActivite, SecteurModel.class);}
	 
	 public SecteurActivite convertDtoToEntity(SecteurModel customerDTO) {
	        ModelMapper modelMapper = new ModelMapper();
	        return modelMapper.map(customerDTO, SecteurActivite.class);
	    }

}
