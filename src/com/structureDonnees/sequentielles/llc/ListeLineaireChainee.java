/*
 * 
 * En Java, la suppression des objets est gérée par le ramasse-miettes (garbage collector). 
 * Lorsqu’un objet n’est plus référencé par aucun autre objet dans le programme, il devient 
 * éligible pour le ramasse-miettes, qui libère la mémoire occupée par cet objet.
 * Dans le contexte de votre liste chaînée, un maillon sera supprimé par le ramasse-miettes 
 * si aucun autre objet dans le programme ne le référence. 
 * Par exemple, si vous supprimez un maillon de la liste et qu’aucun autre objet ne le référence, 
 * ce maillon sera éligible pour le ramasse-miettes.
 */

package com.structureDonnees.sequentielles.llc;

public class ListeLineaireChainee<T> {
    public Maillon<T> tete, queue;
    
    public void creerListeLineaireChainee() {
	this.tete = null;
	this.queue = null;
    }
    
    public void ajouterAListe(T valeur) {
	Maillon<T> maillon = new Maillon<T>();
	maillon.setValeur(valeur); //affecter valeur
	maillon.setSuivant(null); //mettre ref objet suivant à null
	if (this.tete != null) {
	    this.queue.setSuivant(maillon);
	} else {
	    this.tete = maillon;
	}
	this.queue = maillon;
    }
    
    public void afficherListe() {
	Maillon<T> maillon = this.tete; // initialiser un maillon à celui de la tete de liste.
	while (maillon != null) {
	    System.out.println(maillon.getValeur());
	    maillon = maillon.getSuivant();
	}
    }
    
    public boolean rechercherValeur(T valeur) {
	Maillon<T> maillon = this.tete; // initialiser un maillon à celui de la tete de liste.
	while (maillon != null) {
	    if (maillon.getValeur() == valeur) {
		return true;
	    }
	    maillon = maillon.getSuivant();
	}
	return false;
    }

    
    
    
}
