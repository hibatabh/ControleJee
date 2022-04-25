package com.example.ProjetControle.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "books")
public class Livre {
	@Id
	@GeneratedValue
	private int id;
	
	@Column(nullable = false, length = 50)
	private String titre;
	
	@Column(nullable = false, updatable = false)
	private String maisonedition;
	
	@Column(nullable = false)
	private String datesortie;
	
	@Column(nullable = false)
	private String auteur;
	
	@Column(nullable = false)
	private int nbrpage;
	
	@Column(unique=true, nullable = false, updatable = false)
	private String isbn;
	
	@Column(nullable = false)
	private String dateconsu;
	
	@Column(nullable = false)
	private boolean dispo;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitre() {
		return titre;
	}

	public void setTitre(String titre) {
		this.titre = titre;
	}

	public String getMaisonedition() {
		return maisonedition;
	}

	public void setMaisonedition(String maisonedition) {
		this.maisonedition = maisonedition;
	}

	public String getDatesortie() {
		return datesortie;
	}

	public void setDatesortie(String datesortie) {
		this.datesortie = datesortie;
	}

	public String getAuteur() {
		return auteur;
	}

	public void setAuteur(String auteur) {
		this.auteur = auteur;
	}

	public int getNbrpage() {
		return nbrpage;
	}

	public void setNbrpage(int nbrpage) {
		this.nbrpage = nbrpage;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public String getDateconsu() {
		return dateconsu;
	}

	public void setDateconsu(String dateconsu) {
		this.dateconsu = dateconsu;
	}

	public boolean isDispo() {
		return dispo;
	}

	public void setDispo(boolean dispo) {
		this.dispo = dispo;
	}

	
	
	
	
	

}
