package com.structureDonnees.dichotomie;

/*
 * La recherche dichotomique est de complexité log2(n) car l'approche de la solution est divisée par 2 à chaque étape
 */

public class Dichotomie {
	
	public static void afficherTableau(int[] tableau) {
		System.out.println("afficher tableau : ");
		for (int i = 0; i < tableau.length; i++) {
			System.out.println(tableau[i]);
		}
	}
	
	public static String rechercheDicho(int[] tableau, int target) {
		boolean trouv = false;
		int moy = 0; 
		int min = tableau[0];
		int max = tableau[tableau.length-1];
		System.out.println("recherche dichotomique de " + target);
		while (trouv == false && min <= max ) {
			moy = (min + max)/2;
			System.out.println("min : " + min + " max : " + max + " moy : " + moy);
			if (tableau[moy] == target ) {
				trouv = true;
			} else if (tableau[moy] < target) {
				min = moy + 1;
			} else {
				max = moy - 1;
			}
		}
		String message = "" + target;
		if (trouv == true) {
			message += ", existe";
		} else {
			message += ", n'existe pas";
			System.out.println("min : " + min + " max : " + max + " moy : " + moy);
		}
		return message;
	}
	
	public static int[] remplirTableau(int[] tableau) {
		for (int i=0; i<tableau.length; i++) {
			tableau[i] = i;
		}
		return tableau;
	}

	public static void main(String[] args) {
		int[] tableau = new int[20];
		int target = 15;
		tableau = remplirTableau(tableau);
		afficherTableau(tableau);
		System.out.println(rechercheDicho(tableau, target));
	}

}
