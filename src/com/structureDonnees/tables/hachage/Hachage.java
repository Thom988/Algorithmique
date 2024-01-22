

package com.structureDonnees.tables.hachage;

import java.util.HashMap;

public class Hachage {
    
    String[][] hashMap = new String[24][2];
    
//    public void ajouter(String cle, int valeur) {
//	this.hashTable.put(cle, valeur);
//	
//    }
//    
//    public int acceder(String cle) {
//	
//    }
    
    public int hachageChar(char cle) {
	int indice = cle% this.hashMap.length;
	return indice;
    }
    
    public int hachageString(String cle) {
	int indice = cle.charAt(0) + cle.charAt(1)%this.hashMap.length;
	return indice;
    }
    
    public int hachageNum(int cle) {
	int indice = cle%this.hashMap.length;
	return indice;
    }
    
    
    public int hachageMilieuDuCarre(int cle) {
	String carre = String.valueOf(cle*cle);
	int tailleCarre = carre.length();
	if(this.hashMap.length < 100) {
	    carre = carre.substring(tailleCarre/2,(tailleCarre/2) + 1);
	} else {
	    carre = carre.substring(tailleCarre/2,(tailleCarre/2) + 2);
	}
	int indice = Integer.parseInt(carre);
	return indice;
    }
    
    public int hachageDeFibonacci(int cle) {
	double r = (Math.sqrt(5)-1)/2;
	int indice = (int) Math.floor(this.hashMap.length*(cle*r - Math.floor(cle*r)));
	return indice;
    }
 
}
