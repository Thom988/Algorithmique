/*
 * Caracteristiques d'un arbre :
    Taille : nombre de noeuds qu'il possède (arbre vide <=> nb noeuds = 0)
    Niveau : 
    	Racine : 0
    	noeud : niveau père + 1
    Profondeur : niveau max de l'arbre
    Degré d'un noeud : nombre de ses fils
    Degré de l'arbre : degré maximum de ses noeuds
    Représentation : tableau ou liste non linéaire (un maillon, ici noeud (pere), peut être référencé par plusieurs autres noeuds (fils)
    
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
    
 // PARCOURS EN PROF. PREFIXE le pere est affiché avant les fils 
    public void parcoursEnProfondeurPrefixe(Noeud noeud) {
	if (noeud != null) {
	    System.out.print(noeud.getInfo() + " "); // valeur du pere affiché avant de parcourir les fils
	    for (int i = 0; i < noeud.getListeFils().length; i++) {
		    parcoursEnProfondeurPrefixe(noeud.getFils(i));
	    }
	}
    }
    
    // PARCOURS EN PROF. POSTFIXE : les fils affichés avant le père
    public void parcoursEnProfondeurPostfixe(Noeud noeud) {
	if (noeud != null) {
	    for (int i = 0; i < noeud.getListeFils().length; i++) {
		    parcoursEnProfondeurPostfixe(noeud.getFils(i));
	    }
	    System.out.print(noeud.getInfo() + " "); // après chaque récursion pour les fils (fin de boucle) le père est affiché
	}
    }
    
    
    
    
    
  
}
