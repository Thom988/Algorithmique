package com.structureDonnees.sequentielles.piles;

import com.structureDonnees.sequentielles.llc.Maillon;

public class PileParLLC<T> {
    
public Maillon<T> base, sommet;
    
    public void creerListeLineaireChainee() {
	this.sommet = null;
    }
    
    public void empiler(T valeur) {
	Maillon<T> maillon = new Maillon<T>();
	maillon.setValeur(valeur); //affecter valeur
	maillon.setSuivant(null); //mettre ref objet suivant à null
	if (this.sommet != null) {
	    maillon.setSuivant(this.sommet);
	} else {
	    this.sommet = maillon;
	}
	this.sommet = maillon;
	System.out.println("la valeur " + valeur + " a été empilée");
    }
    
    public void depiler() {
	if (estVide()) {
	    System.out.println("impossible de vider la pile car la elle est vide");
	} else {
	    T valeur = this.sommet.getValeur();
	    this.sommet = this.sommet.getSuivant();
	    System.out.println("la valeur " + valeur + " a été dépilée");
	}
    }
    
    public void afficherPile() {
	Maillon<T> maillon = this.sommet; // initialiser un maillon à celui de la tete de liste.
	if (estVide()) {
	    System.out.println("la pile est vide");
	} else {
	    while (maillon != null) {
		    System.out.println(maillon.getValeur());
		    maillon = maillon.getSuivant();
		}
	}
    }
    
    public boolean estVide() {
	if (this.sommet == null) {
	    return true;
	} else {
	    return false;
	}
    }

}
