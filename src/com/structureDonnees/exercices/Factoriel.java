package com.structureDonnees.exercices;

public class Factoriel {

    public static void main(String[] args) {
	Factoriel facto = new Factoriel();
	System.out.println(facto.getFacto(5));
    }

    private int getFacto(int x) {
	if (x==1) { //condition pour stopper la r�cursivit�
	    return 1; 
	}
	return x*getFacto(x-1); // r�cursivit� (la m�thode getFacto() s'appelle d'elle-m�me)
    }
}
