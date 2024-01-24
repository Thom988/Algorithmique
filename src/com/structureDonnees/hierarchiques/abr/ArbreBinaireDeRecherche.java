package com.structureDonnees.hierarchiques.abr;

import com.structureDonnees.sequentielles.queues.FileParLLC;

public class ArbreBinaireDeRecherche {

    int taille;
    NoeudBinaire[] noeuds;
    FileParLLC<NoeudBinaire> file = new FileParLLC<NoeudBinaire>();

    public ArbreBinaireDeRecherche(int taille, int degre) {
	this.taille = taille;
	this.noeuds = new NoeudBinaire[taille];
	char car = 'A';
	for (int i = 0; i < this.noeuds.length; i++) {
	    this.noeuds[i] = new NoeudBinaire(Character.toString(car));
	    car++;
	}
    }

    public void affecterFilsG(NoeudBinaire fils, NoeudBinaire noeud) {
	noeud.setFilsG(fils);
    }

    public void affecterFilsD(NoeudBinaire fils, NoeudBinaire noeud) {
	noeud.setFilsD(fils);
    }

    public void affecterCle(int cle, NoeudBinaire noeud) {
	noeud.setCle(cle);
    }

    public NoeudBinaire getNoeudByInfo(String name) {
	for (int i = 0; i < this.noeuds.length; i++) {
	    if (this.noeuds[i].getInfo().contentEquals(name)) {
		return this.noeuds[i];
	    }
	}
	return null;
    }

    public NoeudBinaire getRacine() {
	for (int i = 0; i < this.noeuds.length; i++) {
	    if (this.noeuds[i].estRacine()) {
		return this.noeuds[i];
	    }
	}
	return null;
    }

    public void parcoursEnProfondeurPrefixe(NoeudBinaire noeud) {
	if (noeud != null) {
	    System.out.print(noeud.getInfo() + "(" + noeud.getCle() + ") "); // Prefixe
	    parcoursEnProfondeurPrefixe(noeud.getFilsG());
	    parcoursEnProfondeurPrefixe(noeud.getFilsD());
	}
    }

    public void parcoursEnProfondeurPostfixe(NoeudBinaire noeud) {
	if (noeud != null) {
	    parcoursEnProfondeurPostfixe(noeud.getFilsG());
	    parcoursEnProfondeurPostfixe(noeud.getFilsD());
	    System.out.print(noeud.getInfo() + "(" + noeud.getCle() + ") "); // Postfixe
	}
    }

    public void parcoursEnProfondeurInfixe(NoeudBinaire noeud) {
	if (noeud != null) {
	    parcoursEnProfondeurInfixe(noeud.getFilsG());
	    System.out.print(noeud.getInfo() + "(" + noeud.getCle() + ") "); // Infixe
	    parcoursEnProfondeurInfixe(noeud.getFilsD());
	}
    }

    public void parcoursEnLargeur(NoeudBinaire noeud) {
	if (noeud != null) {
	    this.file = new FileParLLC<NoeudBinaire>();
	    this.file.enfiler(noeud);
	    while (!this.file.estVide()) {
		noeud = this.file.tete.getValeur();
		System.out.print(noeud.getInfo() + "(" + noeud.getCle() + ") ");
		this.file.defiler();
		if (noeud.getFilsG() != null ) {
		    this.file.enfiler(noeud.getFilsG());
		}
		if (noeud.getFilsD() != null ) {
		    this.file.enfiler(noeud.getFilsD());
		}
	    }
	}
    }
    
    public NoeudBinaire rechercher(NoeudBinaire noeud, int cle) {
	if (noeud == null || cle == noeud.getCle()) {
	    return noeud;
	} else if (noeud.getCle() > cle) {
	    return rechercher(noeud.getFilsG(), cle);
	} else {
	    return rechercher(noeud.getFilsD(), cle);
	}
    }

}
