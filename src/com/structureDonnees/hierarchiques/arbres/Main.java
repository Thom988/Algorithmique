/* 
 Caracteristiques d'un arbre :
    Taille : nombre de noeuds qu'il poss�de (arbre vide <=> nb noeuds = 0)
    Niveau : 
    	Racine : 0
    	noeud : niveau p�re + 1
    Profondeur : niveau max de l'arbre
    Degr� d'un noeud : nombre de ses fils
    Degr� de l'arbre : degr� maximum de ses noeuds
    Repr�sentation : tableau ou liste non lin�aire (un maillon, ici noeud (pere), 
    peut �tre r�f�renc� par plusieurs autres noeuds (fils)
    
   les arbres peuvent �tre r�alis�s avec des tableaux ou des listes. 
   Il existe le parcours en profondeur et en largeur : 
   	- Profondeur : on descend le plus profond�ment possible dans
			l�arbre puis, une fois qu�une feuille a �t� atteinte, on remonte pour explorer les autres
			branches. Il existe deux type de parcours en profondeur : 
   				� Parcours en profondeur Prefixe : o� on affiche le p�re avant ses fils
				� Parcours en profondeur Postfixe : o� on affiche les fils avant leur p�re
   	- Largeur : tous les noeuds � une profondeur (ou niveau) i doivent avoir �t�
		    visit�s avant que le premier noeud � la profondeur i + 1 ne soit visit�.
		
	Pour r�aliser un parcours en largeur, on utilise des file d'attente.
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
