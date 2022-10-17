package tn.esprit.rh.achat.services;

import tn.esprit.achat.model.StockModel;
import tn.esprit.rh.achat.entities.Stock;

import java.util.List;

public interface IStockService {

	List<Stock> retrieveAllStocks();

	Stock addStock(Stock s);

	void deleteStock(Long id);

	Stock updateStock(Stock u);

	Stock retrieveStock(Long id);

	String retrieveStatusStock();
	public StockModel saveStock(StockModel stockModel);
}
