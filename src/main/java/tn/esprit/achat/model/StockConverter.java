package tn.esprit.achat.model;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;
import tn.esprit.rh.achat.entities.Produit;
import tn.esprit.rh.achat.entities.Stock;
@Component
public class StockConverter {
	 public  StockModel convertEntityToDto( Stock stock ) {
	        ModelMapper modelMapper = new ModelMapper();
	        return modelMapper.map( stock,  StockModel.class);}
	 
	 public Stock convertDtoToEntity(StockModel customerDTO) {
	        ModelMapper modelMapper = new ModelMapper();
	        return modelMapper.map(customerDTO, Stock.class);
	    }

}
