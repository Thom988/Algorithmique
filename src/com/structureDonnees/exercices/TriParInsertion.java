package com.structureDonnees.exercices;

public class TriParInsertion {
    
    

    public static void main(String[] args) {
	// TODO Auto-generated method stub
	int[] tableau = {7,0,1,17,11,665,44,5,13,12,8,24,57,3,89,9,54};
	TriParInsertion triParInsertion = new TriParInsertion();
	System.out.println("avant tri :");
	triParInsertion.afficherTableau(tableau);
	triParInsertion.trierTableauV2(tableau);
	System.out.println("apres tri :");
	triParInsertion.afficherTableau(tableau);
	
	

    }
// Methode de tri par insertion :
    private void trierTableauV2(int[] tableau) {
	for (int i = 1; i < tableau.length; i++ ) {
	    int cle = tableau[i];
	    int j = i-1;
	    while (j >= 0 && tableau[j] > tableau[j+1]) {
		tableau[j+1] = tableau[j];
		tableau[j] = cle;
		j--;
	    }
	}	
    }

//    private void trierTableauV1(int[] tableau) {
//	int i;
//	int j;
//	int tmp;
//	for ( i = 1; i < tableau.length; i++ ) {
//	    for (j = i-1; j >= 0; j--) {
//		if (tableau[j] > tableau[j+1]) {
//		    tmp = tableau[j];
//		    tableau[j] = tableau[j+1];
//		    tableau[j+1] = tmp;
//		}
//	    }
//	}
//    }

    private void afficherTableau(int[] tableau) {
	for (int i = 0; i < tableau.length; i++) {
	        System.out.println(tableau[i]);	
	}
    }

}
