

package com.structureDonnees.tables.triees;

import java.util.HashMap;

public class Hachage {
    
    String[][] hashTable;
    
    public Hachage(int taille) {
	this.hashTable = new String[taille][2];
    }
    
    public void ajouter(String cle, String valeur) {
	int indice = hachageString(cle);
	this.hashTable[indice][0] = cle;
	this.hashTable[indice][1] = valeur;
    }
    
    public String acceder(String cle) {
	int indice = hachageString(cle);
	if ( this.hashTable[indice] == null ) {
	    System.out.println("L'element rechercher n'existe pas");
	    return null;
	} else {
	    return this.hashTable[indice][0] + " " + this.hashTable[indice][1];

	}
    }
    
    public void retirer(String cle) {
	this.hashTable[hachageString(cle)] = null;
    }
    
    
    public int hachageChar(char cle) {
	int indice = cle% this.hashTable.length;
	return indice;
    }
    
    public int hachageString(String cle) {
	int indice = (cle.charAt(0) + cle.charAt(1))%this.hashTable.length;
	return indice;
    }
    
    public int hachageNum(int cle) {
	int indice = cle%this.hashTable.length;
	return indice;
    }
    
    
    public int hachageMilieuDuCarre(int cle) {
	String carre = String.valueOf(cle*cle);
	int tailleCarre = carre.length();
	if(this.hashTable.length < 100) {
	    carre = carre.substring(tailleCarre/2,(tailleCarre/2) + 1);
	} else {
	    carre = carre.substring(tailleCarre/2,(tailleCarre/2) + 2);
	}
	int indice = Integer.parseInt(carre);
	return indice;
    }
    
    public int hachageDeFibonacci(int cle) {
	double r = (Math.sqrt(5)-1)/2;
	int indice = (int) Math.floor(this.hashTable.length*(cle*r - Math.floor(cle*r)));
	return indice;
    }

    
 
}
