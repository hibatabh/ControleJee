package com.example.ProjetControle.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.ProjetControle.entity.Livre;
import com.example.ProjetControle.service.LivreService;



@RestController
@RequestMapping(path="/emsi_api")
public class LivreController {
	@Autowired
	private LivreService service;
	
	 @PostMapping("/addLivres")
	 public String addLivres(@RequestBody List<Livre> livres){
	 service.saveLivres(livres);
	 return "réussi!";
	 }
	
	@PostMapping("/addLivre")
	public String add(@RequestBody Livre livre) {
	    service.addLivre(livre);
	    return "réussi";
	}
	@GetMapping("/livres")
	public List<Livre> findAllLivres(){
		return service.getLivres();
	}
	
	 @GetMapping("/LivreTitre/{titre}")
	 public Livre findLivreByTitre (@PathVariable String titre) {
	 return service.getLivreByTitre(titre);
	 }
	  
	@GetMapping("/livre/{id}")
	public Livre findLivreById(@PathVariable int id) {
		return service.getLivreById(id);
	}
	
	@PutMapping("/update")
	public Livre updateLivre(@RequestBody Livre livre) {
		return service.updateLivre(livre);
	}
	
	@DeleteMapping("/delete/{id}")
	public String deleteLivre(@PathVariable int id) {
		return service.deleteLivre(id);
	}
}
