package com.structureDonnees.sequentielles.queue;

import com.structureDonnees.sequentielles.llc.Maillon;

public class FileParLLC<T> {

    public Maillon<T> tete, queue;

    public void creerListeLineaireChainee() {
	this.tete = null;
	this.queue = null;

    }

    public void enfiler(T valeur) {
	Maillon<T> maillon = new Maillon<T>();
	maillon.setValeur(valeur); // affecter valeur
	maillon.setSuivant(null); // mettre ref objet suivant à null
	if (this.tete != null) {
	    this.queue.setSuivant(maillon);
	} else {
	    this.tete = maillon;
	}
	this.queue = maillon;
	// System.out.println("la valeur " + valeur + " a été enfilée");
    }

    public void defiler() {
	if (estVide()) {
	    System.out.println("impossible de vider la pile car la elle est vide");
	} else {
//	    T valeur = this.tete.getValeur();
	    this.tete = this.tete.getSuivant();
	    // System.out.println("la valeur " + valeur + " a été défilée");
	}

    }

    public void afficher() {
	Maillon<T> maillon = this.tete; // initialiser un maillon à celui de la tete de liste.
	if (estVide()) {
	    System.out.println("la pile est vide");
	} else {
	    while (maillon != null) {
		System.out.print(maillon.getValeur() + " ");
		maillon = maillon.getSuivant();
	    }
	    System.out.println();
	}
    }

    public boolean estVide() {
	if (this.tete == null) {
	    return true;
	} else {
	    return false;
	}
    }
}
