package com.structureDonnees.hierarchiques.tas;

import com.structureDonnees.hierarchiques.abr.NoeudBinaire;
import com.structureDonnees.sequentielles.queues.FileParLLC;

public class Tas {

    char cmptNoeud = 'A';
    NoeudBinaire[] noeuds;
    FileParLLC<NoeudBinaire> file;

    public Tas(int taille) {
	this.noeuds = new NoeudBinaire[taille];
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

    public void ajout(int cle) {
	int i;
	for (i = 0; i < this.noeuds.length; i++) {
	    if (this.noeuds[i] == null) {
		this.noeuds[i] = new NoeudBinaire(Character.toString(this.cmptNoeud), cle);
		this.cmptNoeud++;
		break;
	    }
	}
	System.out.println("le noeud " + this.noeuds[i].getInfo() + "(" + this.noeuds[i].getCle() + ") a été ajouté");
	if (i > 0) {
	    trierPrioriteAjout(i + 1);
	}
    }
    
    /* La complexité de cette opération est de O(h = Log2(n)) si n est le nombre de noeuds contrairement 
     * contrairement à l'utilisation d'une file où placer le noeud en fonction de sa cle mettrait O(h = n)
     */
    private void trierPrioriteAjout(int numNoeud) {
	if (numNoeud > 1) {
	    if (this.noeuds[(numNoeud / 2) - 1].getCle() < this.noeuds[numNoeud - 1].getCle()) {
		NoeudBinaire noeud = this.noeuds[numNoeud - 1];
		this.noeuds[numNoeud - 1] = this.noeuds[(numNoeud / 2) - 1];
		this.noeuds[(numNoeud / 2) - 1] = noeud;
		trierPrioriteAjout(numNoeud / 2);
	    }
	}

    }

    public void retrait() {
	NoeudBinaire noeudRetire = this.noeuds[0];
	if (this.noeuds[0] == null) {
	    System.out.println("Impossible de retirer un noeud, l'abre est vide");
	} else if (this.noeuds[1] == null) {
	    this.noeuds[0] = null;
	    System.out.print("Le noeud " + noeudRetire.getInfo() + "(" + noeudRetire.getCle() + ") a été retiré");
	} else {
	    int i;
	    for (i = 2; i < this.noeuds.length; i++) {
		if (this.noeuds[i] == null) {
		    this.noeuds[0] = this.noeuds[i - 1];
		    this.noeuds[i - 1] = null;
		    break;
		} else if (i == this.noeuds.length - 1) {
		    this.noeuds[0] = this.noeuds[i - 1];
		    this.noeuds[i] = null;
		}
	    }
	    System.out.println("Le noeud : " + noeudRetire.getInfo() + "(" + noeudRetire.getCle() + ") a été retiré");
	    if (i > 2) {
		trierPrioriteRetrait();
	    }
	}

    }

    /* La complexité de cette opération est de O(h = Log2(n)) si n est le nombre de noeuds contrairement 
     * contrairement à l'utilisation d'une file où placer le noeud en fonction de sa cle mettrait O(h = n)
     */
    private void trierPrioriteRetrait() {
	int i = 1;
	NoeudBinaire nb;
	// Tant que i est un père et que le fils gauche n'est pas null et que la cle du fils est superieur
	while (i <= this.noeuds.length / 2 && this.noeuds[i*2-1] != null
		&& this.noeuds[i-1].getCle() < this.noeuds[i*2-1].getCle()) {
	    nb = this.noeuds[i-1];
	    // Si fils Droit null
	    if (this.noeuds[i*2] == null ) {
		this.noeuds[i-1] = this.noeuds[i*2-1];
		this.noeuds[i*2-1]=nb;
		i = i*2;
	    } else {
		if (this.noeuds[i*2-1].getCle() > this.noeuds[2*i].getCle()) {
		    this.noeuds[i - 1] = this.noeuds[i * 2 - 1];
		    this.noeuds[i * 2 - 1] = nb;
		    i = i * 2;
		} else {
		    this.noeuds[i-1] = this.noeuds[i * 2];
		    this.noeuds[i * 2] = nb;
		    i = i * 2 + 1;
		}
	    }
	}
    }

    public void parcoursEnLargeur() {
	for (int i = 0; i < this.noeuds.length; i++) {
	    if (this.noeuds[i] != null) {
		System.out.print(this.noeuds[i].getInfo() + "(" + this.noeuds[i].getCle() + ") ");
	    }
	}
	System.out.println();

    }

}
