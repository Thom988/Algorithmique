package com.structureDonnees.sequentielles.queue;

public class FileParFlot {
    
    
    public int tete = 0; 
    public int queue = 0;
    // Un tableau de n �l�ments est d�clar� mais seul n-1 El�ments pourront �tre adress�s.
    // une case est r�serv�e pour retirer l'ambiguit� tete=queue
    Integer[] tableau = new Integer[5];
    
    public void enfiler(int nombre) {
	if (estPleine()) {
	    System.out.println("Impossible d'enfiler, la file est pleine");
	} else {
	    tableau[this.queue] = nombre;
	    this.queue = (this.queue + 1)%tableau.length;
	}
    }

    private boolean estPleine() {
	if (this.tete == (this.queue + 1) % tableau.length) {
	    return true;
	} else {
	    return false;
	}
    }
    
    public boolean estVide() {
	if (this.tete == this.queue) {
	    return true;
	} else {
	    return false;
	}
    }
    
    
    public void defiler() {
	if (estVide()) {
	    System.out.println("Impossible de d�filer, la file est vide");
	} else {
	    this.tableau[tete] = null;
	    this.tete = (this.tete+1)% tableau.length;
	}
    }
    
    public void afficher() {
	for (int i = 0; i < tableau.length; i++) {
	    System.out.print(tableau[i] + " ");
	}
	System.out.println();
    }
    

}
