/*
 * Caracteristiques d'un arbre :
    Taille : nombre de noeuds qu'il poss�de (arbre vide <=> nb noeuds = 0)
    Niveau : 
    	Racine : 0
    	noeud : niveau p�re + 1
    Profondeur : niveau max de l'arbre
    Degr� d'un noeud : nombre de ses fils
    Degr� de l'arbre : degr� maximum de ses noeuds
    Repr�sentation : tableau ou liste non lin�aire (un maillon, ici noeud (pere), peut �tre r�f�renc� par plusieurs autres noeuds (fils)
    
*/

package com.structureDonnees.hierarchiques.arbres;

public class Arbre {
    
    private int taille;
    private Noeud[] noeuds;
    
    public Arbre(int taille) {
	this.taille = taille;
	this.noeuds = new Noeud[this.taille];
	char car = 'A';
	for (int i = 0; i < this.noeuds.length; i++) {
	    this.noeuds[i] = new Noeud();
	    this.noeuds[i].setInfo(Character.toString(car));
	    car++;
	    System.out.println(this.noeuds[i].getInfo());
	}
	
    }
    
    public int getTaille() {
	return taille;
    }

    public void setTaille(int taille) {
	this.taille = taille;
	
    }
    

    public int getDegre() {
	int degre = 0;
	while (degre < this.noeuds.length && this.noeuds[degre] != null) {
	    degre++;
	}
	return degre;
    }
    
    public boolean estVide() {
	if (this.noeuds[0] == null) {
	    return true;
	} else {
	    return false;
	}
    }
    public Noeud[] getNoeuds() {
	return this.noeuds;
    }
    
    public Noeud getNoeudByInfo(String nom) {
	for (int i =0; i < this.noeuds.length; i++) {
	    if (this.noeuds[i].getInfo().contentEquals(nom)) {
		return this.noeuds[i];
	    }
	}
	return null;
    }
    
    public Noeud getRacine() {
	Noeud noeudRacine = null;
	for (int i = 0; i< this.noeuds.length; i++) {
	    if (this.noeuds[i].estRacine()) {
		noeudRacine = this.noeuds[i];
		break;
	    }
	}
	return noeudRacine;
    }
    
 // PARCOURS EN PROF. PREFIXE le pere est affich� avant les fils 
    public void parcoursEnProfondeurPrefixe(Noeud noeud) {
	if (noeud != null) {
	    System.out.print(noeud.getInfo() + " "); // valeur du pere affich� avant de parcourir les fils
	    for (int i = 0; i < noeud.getListeFils().length; i++) {
		    parcoursEnProfondeurPrefixe(noeud.getFils(i));
	    }
	}
    }
    
    // PARCOURS EN PROF. POSTFIXE : les fils affich�s avant le p�re
    public void parcoursEnProfondeurPostfixe(Noeud noeud) {
	if (noeud != null) {
	    for (int i = 0; i < noeud.getListeFils().length; i++) {
		    parcoursEnProfondeurPostfixe(noeud.getFils(i));
	    }
	    System.out.print(noeud.getInfo() + " "); // apr�s chaque r�cursion pour les fils (fin de boucle) le p�re est affich�
	}
    }
    
    
    
    
    
  
}
