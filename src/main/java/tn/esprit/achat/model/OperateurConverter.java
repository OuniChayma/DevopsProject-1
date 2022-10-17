package tn.esprit.achat.model;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import tn.esprit.rh.achat.entities.Operateur;
@Component
public class OperateurConverter {
	 public OperateurModel convertEntityToDto(Operateur operateur) {
	        ModelMapper modelMapper = new ModelMapper();
	        return modelMapper.map(operateur,OperateurModel.class);}
	 
	 public Operateur convertDtoToEntity(OperateurModel customerDTO) {
	        ModelMapper modelMapper = new ModelMapper();
	        return modelMapper.map(customerDTO, Operateur.class);
	    }

}
