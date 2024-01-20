package com.structureDonnees.hierarchiques.arbres;

import com.structureDonnees.sequentielles.queue.FileParLLC;

public class Arbre {
    
    private int degre;
    private int taille;
    private Noeud[] noeuds;
    private FileParLLC<Noeud> file = new FileParLLC<Noeud>();
    
    public Arbre(int taille, int degre) {
	this.degre = degre;
	this.taille = taille;
	this.noeuds = new Noeud[this.taille];
	char car = 'A';
	for (int i = 0; i < this.noeuds.length; i++) {
	    this.noeuds[i] = new Noeud(degre);
	    this.noeuds[i].setInfo(Character.toString(car));
	    car++;
	    System.out.println(this.noeuds[i].getInfo());
	}
	
    }
    
    public int getTaille() {
	return taille;
    }
    
    public int getDegre() {
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
	    for (int i = 0; i < noeud.getDegre(); i++) {
		    parcoursEnProfondeurPrefixe(noeud.getFils(i));
	    }
	}
    }
    
    // PARCOURS EN PROF. POSTFIXE : les fils affichés avant le père
    public void parcoursEnProfondeurPostfixe(Noeud noeud) {
	if (noeud != null) {
	    for (int i = 0; i < noeud.getDegre(); i++) {
		    parcoursEnProfondeurPostfixe(noeud.getFils(i));
	    }
	    System.out.print(noeud.getInfo() + " "); // après chaque récursion pour les fils (fin de boucle) le père est affiché
	}
    }

    
    public void parcoursEnLargeur(Noeud racine) {
	if (racine != null) {
	    this.file.enfiler(racine);
	    Noeud noeud = racine;
	    while (!this.file.estVide()) {
		System.out.print(noeud.getInfo() + " ");
		this.file.defiler();
		for (int i = 0; i < noeud.getDegre(); i++) {
		    if (noeud != null) {
			this.file.enfiler(noeud.getListeFils()[i]);
		    }
		}
		if (!this.file.estVide()) {
			noeud = this.file.tete.getValeur();
		}
	    }
	    System.out.println();
	}
    }
    
    
    
    
    
    
    
  
}
