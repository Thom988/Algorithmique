package com.structureDonnees.hierarchiques.arbres;

public class Main {

    public static void main(String[] args) {

/******************************************* LES ARBRES : *****************************************************************************/
	Arbre arbre = new Arbre(13);
	arbre.getNoeudByInfo("A").addFils(arbre.getNoeudByInfo("B"));
	arbre.getNoeudByInfo("A").addFils(arbre.getNoeudByInfo("C"));
	arbre.getNoeudByInfo("A").addFils(arbre.getNoeudByInfo("D"));
	
	arbre.getNoeudByInfo("B").addFils(arbre.getNoeudByInfo("E"));
	arbre.getNoeudByInfo("B").addFils(arbre.getNoeudByInfo("F"));
	
	arbre.getNoeudByInfo("C").addFils(arbre.getNoeudByInfo("G"));
	arbre.getNoeudByInfo("C").addFils(arbre.getNoeudByInfo("H"));
	arbre.getNoeudByInfo("C").addFils(arbre.getNoeudByInfo("I"));
	
	arbre.getNoeudByInfo("H").addFils(arbre.getNoeudByInfo("L"));
	arbre.getNoeudByInfo("H").addFils(arbre.getNoeudByInfo("M"));
	
	arbre.getNoeudByInfo("D").addFils(arbre.getNoeudByInfo("J"));
	arbre.getNoeudByInfo("D").addFils(arbre.getNoeudByInfo("K"));
	
	arbre.getNoeudByInfo("B").setPredecesseur(arbre.getNoeudByInfo("A"));
	arbre.getNoeudByInfo("C").setPredecesseur(arbre.getNoeudByInfo("A"));
	arbre.getNoeudByInfo("D").setPredecesseur(arbre.getNoeudByInfo("A"));
	arbre.getNoeudByInfo("E").setPredecesseur(arbre.getNoeudByInfo("B"));
	arbre.getNoeudByInfo("F").setPredecesseur(arbre.getNoeudByInfo("B"));
	arbre.getNoeudByInfo("G").setPredecesseur(arbre.getNoeudByInfo("C"));
	arbre.getNoeudByInfo("H").setPredecesseur(arbre.getNoeudByInfo("C"));
	arbre.getNoeudByInfo("I").setPredecesseur(arbre.getNoeudByInfo("C"));
	arbre.getNoeudByInfo("J").setPredecesseur(arbre.getNoeudByInfo("D"));
	arbre.getNoeudByInfo("K").setPredecesseur(arbre.getNoeudByInfo("D"));
	arbre.getNoeudByInfo("L").setPredecesseur(arbre.getNoeudByInfo("H"));
	arbre.getNoeudByInfo("M").setPredecesseur(arbre.getNoeudByInfo("H"));
	
	if (arbre.estVide()) {
	    System.out.println("l'arbre est vide");
	} else {
	    System.out.println("L'arbre n'est pas vide");
	}
	
	if (arbre.getNoeudByInfo("K").estFeuille()) {
	    System.out.println("le noeud K est une feuille");
	} else {
	    System.out.println("Le noeud K n'est pas une feuille");
	}

	if (arbre.getNoeudByInfo("C").estFeuille()) {
	    System.out.println("le noeud C est une feuille");
	} else {
	    System.out.println("Le noeud C n'est pas une feuille");
	}
	
	arbre.parcoursEnProfondeurPrefixe(arbre.getRacine());
	System.out.println();
	arbre.parcoursEnProfondeurPostfixe(arbre.getRacine());
	
	
	
    }

}
