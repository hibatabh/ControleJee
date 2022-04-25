package com.example.ProjetControle.service;

import java.util.List;

import javax.persistence.OrderBy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ProjetControle.entity.Livre;
import com.example.ProjetControle.repository.LivreRepo;


@Service
public class LivreService {

	@Autowired
	   private LivreRepo repository;
	
	 
	   
	public void addLivre(Livre livre) {
		 repository.save(livre);
	    }
	 public List<Livre> saveLivres(List<Livre> livres){
		 return repository.saveAll(livres);
	 }
	 
	   
	   @OrderBy(value = "titre ASC")
		public List<Livre> getLivres(){
			return repository.findAll();
		}
	   public Livre getLivreByTitre (String titre) {
		   return repository.findByTitre(titre);
	   }
	   
	   public Livre getLivreById(int id) {
		   return repository.findById(id).orElse(null);
	   }
	   
	  
	   public String deleteLivre(int id){
		   repository.deleteById(id);
		   return "livre supprimez!! "+id;
	   }
		   
	   public Livre updateLivre(Livre livre){
		   Livre existingLivre=repository.findById(livre.getId()).orElse(null);
		   existingLivre.setTitre(livre.getTitre());
		   existingLivre.setDatesortie(livre.getDatesortie());
		   existingLivre.setMaisonedition(livre.getMaisonedition());
		   existingLivre.setAuteur(livre.getAuteur());
		   existingLivre.setNbrpage(livre.getNbrpage());
		   existingLivre.setDateconsu(livre.getDateconsu());
		   existingLivre.setDispo(livre.isDispo());

		   return repository.save(existingLivre);	   
		   		
	   }
}
