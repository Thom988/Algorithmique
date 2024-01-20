/*
 * 
_ Chaque noeud a au plus un prédécesseur
– Le prédécesseur s’il existe s’appelle père (père de C = A, père de L = H)
– Le successeur s’il existe s’appelle fils (fils de A = { B,C,D }, fils de H= {L,M })
– Le noeud qui n’a pas de prédécesseur s’appelle racine (A)
– Le noeud qui n’a pas de successeur s’appelle feuille (E,F,G,L,J,...)
– Descendants de C={G,H,I,L,M}, de B={E,F},...
– Ascendants de L={H,C,A}, E={B,A},...
 * 
 */

package com.structureDonnees.hierarchiques.arbres;

public class Noeud {
    
    private String info;
    private Noeud[] listeFils;
    private Noeud predecesseur;
    
    public Noeud(int degreArbre) {
	this.listeFils = new Noeud[degreArbre];
    }


    public String getInfo() {
	return info;
    }

    public void setInfo(String info) {
	this.info = info;
    }

    public Noeud getFils(int i) {
	    return this.listeFils[i];
    }

    public Noeud[] getListeFils() {
	return this.listeFils;
    }

    public void addFils(Noeud fils) {
	for (int i = 0; i < this.listeFils.length; i++) {
	    if (this.listeFils[i] == null) {
		this.listeFils[i] = fils;
		break;
	    }
	}
    }

    public Noeud getPredecesseur() {
	return predecesseur;
    }
    public void setPredecesseur(Noeud noeud) {
	this.predecesseur = noeud;
    }

    public boolean estFeuille() {
	if (this.listeFils[0] == null) {
	    return true;
	} else {
	    return false;
	}
    }

    public boolean estRacine() {
	if (this.getPredecesseur() == null) {
	    return true;
	} else {
	    return false;
	}
    }

    public int getDegre() {
	int degre = 0;
	while (degre < this.listeFils.length && this.listeFils[degre] != null) {
	    degre++;
	}
	return degre;
    }

}
