package com.structureDonnees.sequentielles.piles;

public class PileParTableau {
    
    public Integer[] tableau = new Integer[4];
    private int sommet = 0;
    
    
    public void empiler(int nombre) {
	if (!estPlein()) {
	    this.tableau[this.sommet] = nombre;
	    this.sommet++;
	    System.out.println("le nombre " + nombre + " a été empilé");
	} else {
	    System.out.println("Impossible d'empiler, la pile est pleine");
	}
	
    }
    
    public void depiler() {
	if (estVide()) {
	    System.out.println("Impossible de dépiler, la pile est vide");
	} else {
	    int nombre = this.tableau[this.sommet-1];
	    this.tableau[this.sommet-1] = null;
	    this.sommet--;
	    System.out.println("le nombre " + nombre + " a été dépilé");
	}
    }
    
    public void afficher() {
	for (int i = 0; i < this.sommet; i++) {
	    System.out.println(this.tableau[i]);
	}
    }
    
    public boolean estPlein() {
	if (this.sommet == this.tableau.length ) {
	    System.out.println("la pile est pleine...");
	    return true;
	} else {
	    return false;
	}
    }
    
    public boolean estVide() {
	if (this.sommet == 0) {
	    System.out.println("La pile est vide");
	    return true;
	} else {
	    return false;
	}
    }
    
}
