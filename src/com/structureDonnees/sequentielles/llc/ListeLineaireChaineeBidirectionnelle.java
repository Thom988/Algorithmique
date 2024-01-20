package com.structureDonnees.sequentielles.llc;

public class ListeLineaireChaineeBidirectionnelle<T> {
    
    public MaillonBidirectionnel<T> tete, queue;
    
    public ListeLineaireChaineeBidirectionnelle() {
	this.tete = null;
	this.queue = null;
    }
    
    
    public void ajouterAListe(T valeur ) {
	MaillonBidirectionnel<T> maillon = new MaillonBidirectionnel<T>();
	maillon.setValeur(valeur); //affecter valeur
	maillon.setSuivant(null); //mettre ref objet suivant à null
	if (this.tete != null) {
	    this.queue.setSuivant(maillon);
	    maillon.setPrecedent(this.queue);
	    
	} else {
	    this.tete = maillon;
	}
	this.queue = maillon;
    }
    
    public void afficherListeDepuisTete() {
	MaillonBidirectionnel<T> maillon = this.tete;
	while (maillon != null) {
	    System.out.println(maillon.getValeur());
	    maillon = (MaillonBidirectionnel<T>) maillon.getSuivant();
	}
    }
    
    public void afficherListeDepuisQueue() {
	MaillonBidirectionnel<T> maillon = this.queue;
	while (maillon != null) {
	    System.out.println(maillon.getValeur());
	    maillon = (MaillonBidirectionnel<T>) maillon.getPrecedent();
	}
    }
    
    public boolean rechercherValeur(T valeur) {
	MaillonBidirectionnel<T> maillon = this.tete; // initialiser un maillon à celui de la tete de liste.
	while (maillon != null) {
	    if (maillon.getValeur() == valeur) {
		return true;
	    }
	    maillon = maillon.getSuivant();
	}
	return false;
    }

    
    
    
}
