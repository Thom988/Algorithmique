package com.structureDonnees.sequentielles.queues;

public class FileParDecalage {
    private int queue = 0;
    private int tete = 0;
    private Integer[] tableau = new Integer[5];
    
    public void enfiler(int valeur) {
	if (estPlein()) {
	    System.out.println("Impossible d'enfiler, la file est pleine");
	} else {
	    this.tableau[this.queue] = valeur;
	    this.queue++;
	}
    }

    private boolean estPlein() {
	if (this.queue == tableau.length) {
	    return true;
	} else {
	    return false;
	}
    }
    
    private boolean estVide() {
	if(this.tete == this.queue) {
	    return true;
	} else {
	return false;

	}
    }
    
    public void defiler() {
	if(estVide()) {
	    System.out.println("Impossible de défiler, la file est vide");	
	} else {
	    decalage();
	}
    }

    private void decalage() {
	for(int i = 0; i < tableau.length - 1 ; i++) {
	    this.tableau[i] = this.tableau[i+1];
	}
	tableau[tableau.length - 1] = null;
    }
    
    public void afficher() {
	for( int i = 0; i < tableau.length; i++ ) {
	    System.out.print(this.tableau[i] + " ");
	}
	System.out.println();
    }
}
