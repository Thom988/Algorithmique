/* 
 Caracteristiques d'un arbre :
    Taille : nombre de noeuds qu'il possède (arbre vide <=> nb noeuds = 0)
    Niveau : 
    	Racine : 0
    	noeud : niveau père + 1
    Profondeur : niveau max de l'arbre
    Degré d'un noeud : nombre de ses fils
    Degré de l'arbre : degré maximum de ses noeuds
    Représentation : tableau ou liste non linéaire (un maillon, ici noeud (pere), 
    peut être référencé par plusieurs autres noeuds (fils)
    
   les arbres peuvent être réalisés avec des tableaux ou des listes. 
   Il existe le parcours en profondeur et en largeur : 
   	- Profondeur : on descend le plus profondément possible dans
			l’arbre puis, une fois qu’une feuille a été atteinte, on remonte pour explorer les autres
			branches. Il existe deux type de parcours en profondeur : 
   				– Parcours en profondeur Prefixe : où on affiche le père avant ses fils
				– Parcours en profondeur Postfixe : où on affiche les fils avant leur père
   	- Largeur : tous les noeuds à une profondeur (ou niveau) i doivent avoir été
		    visités avant que le premier noeud à la profondeur i + 1 ne soit visité.
		
	Pour réaliser un parcours en largeur, on utilise des file d'attente.
 */

package com.structureDonnees.hierarchiques.arbres;

public class Main {

    public static void main(String[] args) {

/******************************************* LES ARBRES avec Tableau : *****************************************************************************/
	// new arbre(taille, degre) => necessaire pour initialiser la dimension des tableaux
	Arbre arbre = new Arbre(13,3);
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
	System.out.println();
	arbre.parcoursEnLargeur(arbre.getRacine());
		
    }
    
    

}
