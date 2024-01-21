package com.structureDonnees.hierarchiques.abr;

import com.structureDonnees.sequentielles.queue.FileParLLC;

public class ArbreBinaireDeRecherche {

    int taille;
    Noeud[] noeuds;
    FileParLLC<Noeud> file = new FileParLLC<Noeud>();

    public ArbreBinaireDeRecherche(int taille, int degre) {
	this.taille = taille;
	this.noeuds = new Noeud[taille];
	char car = 'A';
	for (int i = 0; i < this.noeuds.length; i++) {
	    this.noeuds[i] = new Noeud(Character.toString(car));
	    car++;
	}
    }

    public void affecterFilsG(Noeud fils, Noeud noeud) {
	noeud.setFilsG(fils);
    }

    public void affecterFilsD(Noeud fils, Noeud noeud) {
	noeud.setFilsD(fils);
    }

    public void affecterCle(int cle, Noeud noeud) {
	noeud.setCle(cle);
    }

    public Noeud getNoeudByInfo(String name) {
	for (int i = 0; i < this.noeuds.length; i++) {
	    if (this.noeuds[i].getInfo().contentEquals(name)) {
		return this.noeuds[i];
	    }
	}
	return null;
    }

    public Noeud getRacine() {
	for (int i = 0; i < this.noeuds.length; i++) {
	    if (this.noeuds[i].estRacine()) {
		return this.noeuds[i];
	    }
	}
	return null;
    }

    public void parcoursEnProfondeurPrefixe(Noeud noeud) {
	if (noeud != null) {
	    System.out.print(noeud.getInfo() + "(" + noeud.getCle() + ") "); // Prefixe
	    parcoursEnProfondeurPrefixe(noeud.getFilsG());
	    parcoursEnProfondeurPrefixe(noeud.getFilsD());
	}
    }

    public void parcoursEnProfondeurPostfixe(Noeud noeud) {
	if (noeud != null) {
	    parcoursEnProfondeurPostfixe(noeud.getFilsG());
	    parcoursEnProfondeurPostfixe(noeud.getFilsD());
	    System.out.print(noeud.getInfo() + "(" + noeud.getCle() + ") "); // Postfixe
	}
    }

    public void parcoursEnProfondeurInfixe(Noeud noeud) {
	if (noeud != null) {
	    parcoursEnProfondeurInfixe(noeud.getFilsG());
	    System.out.print(noeud.getInfo() + "(" + noeud.getCle() + ") "); // Infixe
	    parcoursEnProfondeurInfixe(noeud.getFilsD());
	}
    }

    public void parcoursEnLargeur(Noeud noeud) {
	if (noeud != null) {
	    this.file = new FileParLLC<Noeud>();
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
    
    public Noeud rechercher(Noeud noeud, int cle) {
	if (noeud == null || cle == noeud.getCle()) {
	    return noeud;
	} else if (noeud.getCle() > cle) {
	    return rechercher(noeud.getFilsG(), cle);
	} else {
	    return rechercher(noeud.getFilsD(), cle);
	}
    }

}
