package com.structureDonnees.hierarchiques.abr;

public class Noeud {
    private int cle;
    private String info;
    private Noeud predecesseur;
    private Noeud filsG;
    private Noeud filsD;
    
    public Noeud(String info) {
	this.info = info;
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

    public Noeud getPredecesseur() {
	return predecesseur;
    }

    public void setPredecesseur(Noeud predecesseur) {
	this.predecesseur = predecesseur;
    }

    public Noeud getFilsG() {
	return filsG;
    }

    public void setFilsG(Noeud filsG) {
	this.filsG = filsG;
    }

    public Noeud getFilsD() {
	return filsD;
    }

    public void setFilsD(Noeud filsD) {
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
    
    public int getDegre(Noeud noeud) {
	if (noeud == null) {
	    return 0;
	} else if (noeud.filsD != null && noeud.filsD != null) {
	    return 2;
	} else {
	    return 1;
	}
    }

}
