package com.structureDonnees.hierarchiques.abr;

public class NoeudBinaire {
    private int cle;
    private String info;
    private NoeudBinaire predecesseur;
    private NoeudBinaire filsG;
    private NoeudBinaire filsD;
    
    public NoeudBinaire(String info) {
	this.info = info;
    }
    
    public NoeudBinaire(String info, int cle) {
	this.info = info;
	this.cle = cle;
    }

    public int getCle() {
	return cle;
    }

    public void setCle(int cle) {
	this.cle = cle;
    }

    public String getInfo() {
	return info;
    }

    public void setInfo(String info) {
	this.info = info;
    }

    public NoeudBinaire getPredecesseur() {
	return predecesseur;
    }

    public void setPredecesseur(NoeudBinaire predecesseur) {
	this.predecesseur = predecesseur;
    }

    public NoeudBinaire getFilsG() {
	return filsG;
    }

    public void setFilsG(NoeudBinaire filsG) {
	this.filsG = filsG;
    }

    public NoeudBinaire getFilsD() {
	return filsD;
    }

    public void setFilsD(NoeudBinaire filsD) {
	this.filsD = filsD;
    }

    public boolean estFeuille() {
	if (this.filsD == null && this.filsG == null) {
	    return true;
	} else {
	    return false;
	}
    }

    public boolean estRacine() {
	if (this.predecesseur == null) {
	    return true;
	} else {
	    return false;
	}
    }
    
    public int getDegre(NoeudBinaire noeud) {
	if (noeud == null) {
	    return 0;
	} else if (noeud.filsD != null && noeud.filsD != null) {
	    return 2;
	} else {
	    return 1;
	}
    }

}
