package tn.esprit.achat.model;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;
import tn.esprit.rh.achat.entities.Produit;
import tn.esprit.rh.achat.entities.Reglement;
@Component
public class ReglementConverter {
	 public ReglementModel convertEntityToDto(Reglement reglement) {
	        ModelMapper modelMapper = new ModelMapper();
	        return modelMapper.map(reglement, ReglementModel.class);}
	 
	 public Reglement convertDtoToEntity(ReglementModel customerDTO) {
	        ModelMapper modelMapper = new ModelMapper();
	        return modelMapper.map(customerDTO, Reglement.class);
	    }

}
