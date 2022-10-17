package tn.esprit.rh.achat.services;

import tn.esprit.achat.model.ProduitModel;
import tn.esprit.rh.achat.entities.Produit;

import java.util.List;

public interface IProduitService {

	List<Produit> retrieveAllProduits();

	Produit addProduit(Produit p);

	void deleteProduit(Long id);

	ProduitModel updateProduit(ProduitModel produitModel);

	Produit retrieveProduit(Long id);

	void assignProduitToStock(Long idProduit, Long idStock);
	public ProduitModel saveProduit(ProduitModel produitModel);

}
