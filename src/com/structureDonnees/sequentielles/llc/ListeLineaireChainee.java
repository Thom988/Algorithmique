/*
 * 
 * En Java, la suppression des objets est g�r�e par le ramasse-miettes (garbage collector). 
 * Lorsqu�un objet n�est plus r�f�renc� par aucun autre objet dans le programme, il devient 
 * �ligible pour le ramasse-miettes, qui lib�re la m�moire occup�e par cet objet.
 * Dans le contexte de votre liste cha�n�e, un maillon sera supprim� par le ramasse-miettes 
 * si aucun autre objet dans le programme ne le r�f�rence. 
 * Par exemple, si vous supprimez un maillon de la liste et qu�aucun autre objet ne le r�f�rence, 
 * ce maillon sera �ligible pour le ramasse-miettes.
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
	maillon.setSuivant(null); //mettre ref objet suivant � null
	if (this.tete != null) {
	    this.queue.setSuivant(maillon);
	} else {
	    this.tete = maillon;
	}
	this.queue = maillon;
    }
    
    public void afficherListe() {
	Maillon<T> maillon = this.tete; // initialiser un maillon � celui de la tete de liste.
	while (maillon != null) {
	    System.out.println(maillon.getValeur());
	    maillon = maillon.getSuivant();
	}
    }
    
    public boolean rechercherValeur(T valeur) {
	Maillon<T> maillon = this.tete; // initialiser un maillon � celui de la tete de liste.
	while (maillon != null) {
	    if (maillon.getValeur() == valeur) {
		return true;
	    }
	    maillon = maillon.getSuivant();
	}
	return false;
    }

    
    
    
}
