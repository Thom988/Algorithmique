/*
    - Arbre binaire : c’est un arbre ou le degré maximum d’un noeud est égal à 2.
    – Arbre binaire de recherche : c’est un arbre binaire où la clé de chaque noeud est
    supérieure à celles de ses descendants gauche, et inférieure à celles de ses descendants
    droits
    
    Les arbres binaires de recherche sont utilisés pour accélérer la recherche dans les arbres
    m-aires. Un arbre binaire de recherche est un arbre binaire vérifiant la propriété suivante :
    Soient x et y deux nœuds de l’arbre, si y est un nœud du sous-arbre gauche de x, alors
    cle´(y) ≤ cle´(x), si y est un nœud du sous-arbre droit de x, alors cle´(y) ≥ cle´(x)
 */

package com.structureDonnees.hierarchiques.abr;

public class Main {

    public static void main(String[] args) {

	ArbreBinaireDeRecherche abr = new ArbreBinaireDeRecherche(11, 2);
	
	abr.getNoeudByInfo("A").setCle(15);
	
	abr.getNoeudByInfo("B").setCle(6);
	abr.getNoeudByInfo("B").setPredecesseur(abr.getNoeudByInfo("A"));
	
	abr.getNoeudByInfo("C").setCle(18);
	abr.getNoeudByInfo("C").setPredecesseur(abr.getNoeudByInfo("A"));
	
	abr.getNoeudByInfo("D").setCle(3);
	abr.getNoeudByInfo("D").setPredecesseur(abr.getNoeudByInfo("B"));
	
	abr.getNoeudByInfo("E").setCle(7);
	abr.getNoeudByInfo("E").setPredecesseur(abr.getNoeudByInfo("B"));
	
	abr.getNoeudByInfo("F").setCle(17);
	abr.getNoeudByInfo("F").setPredecesseur(abr.getNoeudByInfo("C"));
	
	abr.getNoeudByInfo("G").setCle(20);
	abr.getNoeudByInfo("G").setPredecesseur(abr.getNoeudByInfo("C"));
	
	abr.getNoeudByInfo("H").setCle(2);
	abr.getNoeudByInfo("H").setPredecesseur(abr.getNoeudByInfo("D"));
	
	abr.getNoeudByInfo("I").setCle(4);
	abr.getNoeudByInfo("I").setPredecesseur(abr.getNoeudByInfo("D"));
	
	abr.getNoeudByInfo("J").setCle(13);
	abr.getNoeudByInfo("J").setPredecesseur(abr.getNoeudByInfo("E"));
	
	abr.getNoeudByInfo("K").setCle(9);
	abr.getNoeudByInfo("K").setPredecesseur(abr.getNoeudByInfo("J"));

	abr.affecterFilsG(abr.getNoeudByInfo("B"), abr.getNoeudByInfo("A"));
	abr.affecterFilsD(abr.getNoeudByInfo("C"), abr.getNoeudByInfo("A"));
	abr.affecterFilsG(abr.getNoeudByInfo("D"), abr.getNoeudByInfo("B"));
	abr.affecterFilsD(abr.getNoeudByInfo("E"), abr.getNoeudByInfo("B"));
	abr.affecterFilsG(abr.getNoeudByInfo("F"), abr.getNoeudByInfo("C"));
	abr.affecterFilsD(abr.getNoeudByInfo("G"), abr.getNoeudByInfo("C"));
	abr.affecterFilsG(abr.getNoeudByInfo("H"), abr.getNoeudByInfo("D"));
	abr.affecterFilsD(abr.getNoeudByInfo("I"), abr.getNoeudByInfo("D"));
	abr.affecterFilsD(abr.getNoeudByInfo("J"), abr.getNoeudByInfo("E"));
	abr.affecterFilsG(abr.getNoeudByInfo("K"), abr.getNoeudByInfo("J"));
	
	System.out.println("Parcours en profondeur prefixe :");
	abr.parcoursEnProfondeurPrefixe(abr.getRacine());
	System.out.println("\nParcours en profondeur postfixe :");
	abr.parcoursEnProfondeurPostfixe(abr.getRacine());
	System.out.println("\nParcours en profondeur infixe :");
	abr.parcoursEnProfondeurInfixe(abr.getRacine());
	System.out.println("\nParcours en largeur (=> file) :");
	abr.parcoursEnLargeur(abr.getRacine());
	
	System.out.println("\nRecherche d'un noeud :");
	NoeudBinaire noeud = abr.rechercher(abr.getRacine(), 9);
	if(noeud != null) {
	    System.out.println("Le noeud " + noeud.getInfo() + "(" + noeud.getCle() + ") a �t� trouv�");
	} else {
	    System.out.println("le noeud n'existe pas dans cet arbre ou branche");
	}
	
    }

}
