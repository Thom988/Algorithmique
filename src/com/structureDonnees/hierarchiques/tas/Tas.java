package com.structureDonnees.hierarchiques.tas;

import com.structureDonnees.hierarchiques.abr.NoeudBinaire;
import com.structureDonnees.sequentielles.queue.FileParLLC;

public class Tas {

    int taille;
    NoeudBinaire[] noeuds;
    FileParLLC<NoeudBinaire> file = new FileParLLC<NoeudBinaire>();
    private char cmptNoeuds = 'A';

    public Tas(int taille, int degre) {
	this.taille = taille;
	this.noeuds = new NoeudBinaire[taille];
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
		if (noeud.getFilsG() != null) {
		    this.file.enfiler(noeud.getFilsG());
		}
		if (noeud.getFilsD() != null) {
		    this.file.enfiler(noeud.getFilsD());
		}
	    }
	}
    }

// Specifique au TAS ************************************************************************

    public boolean estVide() {
	if (getRacine() == null) {
	    return true;
	} else {
	    return false;
	}
    }

    public void ajout(int cle) {
	NoeudBinaire noeud = chercherNoeudImcomplet();
	NoeudBinaire n = new NoeudBinaire(Character.toString(this.cmptNoeuds), cle, noeud);
	if (noeud == null) {
	    this.noeuds[0] = n;
	} else {
	    if (noeud.getFilsG() == null) {
		noeud.setFilsG(n);
	    } else {
		noeud.setFilsD(n);
	    }
	}
	this.cmptNoeuds++;
	trierPriorite(n);
    }

    // A corriger !!!!!!!!!!!!!
    private void trierPriorite(NoeudBinaire noeud) {
	NoeudBinaire n;
	while (noeud.getPredecesseur()!= null && noeud.getPredecesseur().getCle() < noeud.getCle() ) {
	    n = noeud;
	    noeud = noeud.getPredecesseur();
	    noeud.setPredecesseur(n);	    
	}
    }

    public void retrait() {

    }

    private NoeudBinaire chercherNoeudImcomplet() {
	this.file = new FileParLLC<NoeudBinaire>();
	NoeudBinaire noeud = this.noeuds[0];
	if (noeud != null) {
	    this.file.enfiler(getRacine());
	    while (!this.file.estVide()) {
		noeud = this.file.tete.getValeur();
		this.file.defiler();
		if (noeud.getFilsG() == null || noeud.getFilsD() == null) {
		    return noeud;
		} else {
		    this.file.enfiler(noeud.getFilsG());
		    this.file.enfiler(noeud.getFilsD());
		}
	    }
	}
	return null;
    }

}
