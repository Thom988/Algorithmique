package com.structureDonnees.exercices;

/*
 * La recherche dichotomique est de complexit� log2(n) car l'approche de la solution est divis�e par 2 � chaque �tape
 */

public class Dichotomie {
	
	public static void afficherTableau(int[] tableau) {
		System.out.println("afficher tableau de " + tableau.length + " commen�ant par  " + tableau[0]);
		for (int i = 0; i < tableau.length; i++) {
			System.out.println(tableau[i]);
		}
	}
	
	public static String rechercheDicho(int[] tableau, int target) {
		boolean trouv = false;
		int moy = 0; 
		int min = tableau[0];
		int max = tableau[tableau.length-1];
		int index = 0;
		System.out.println("recherche dichotomique de " + target);
		while (trouv == false && min <= max ) {
			moy = (min + max)/2;
			index = moy - tableau[0]; // cr�er un off-set au cas o� le tableau ne commence pas � 0
			System.out.println("min : " + min + " max : " + max + " moy : " + moy);
			if (tableau[index] == target ) {
				trouv = true;
			} else if (tableau[index] < target) {
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
			tableau[i] = i+50; // i + x : permet de cr�er un tableau de n element, commen�ant pas x
		}
		return tableau;
	}

	public static void main(String[] args) {
		int[] tableau = new int[20];
		int target = 57;
		tableau = remplirTableau(tableau);
		afficherTableau(tableau);
		System.out.println(rechercheDicho(tableau, target));
	}

}
