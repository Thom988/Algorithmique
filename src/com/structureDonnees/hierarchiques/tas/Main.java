/*
Un tas (heap en anglais) est un arbre qui vérifie les deux propriétés suivantes :
1) C’est un arbre binaire complet c’est-à-dire un arbre binaire dont tous les niveaux sont
remplis sauf éventuellement le dernier où les éléments sont rangés le plus à gauche
possible.
2) La clé de tout nœud est supérieure à celle de ses descendants.
L’élément le plus prioritaire se trouve donc toujours à la racine.


Les tas peuvent être implémentés dynamiquement exactement comme les ABR, et sont
utilisés par le même modèle.
Une représentation statique très efficace utilisant des tableaux est très utilisée en pratique,
elle consiste à ranger les éléments du tas dans un tableau selon un parcours en largeur.

[16,14,10,8,7,9,3,2,4,1]
  P Fg Fd 

Le fils gauche (Fg) d’un élément d’indice i (P) se trouve
toujours s’il existe à la position 2i, et son fils droit se trouve à la position (2i + 1) et son
père se trouve à la position i/2. Les opérations d’ajout et de retrait sur le tas statique se
font de la même façon que dans le cas du tas dynamique. Avec ce principe les opérations
d’ajout et de retrait se font d’une manière très simple et extrêmement efficace.
Les tas sont utilisés même pour le tri des tableaux : on ajoute les éléments d’un tableau à
un tas, puis on les retire dans l’ordre décroissant.
 */

package com.structureDonnees.hierarchiques.tas;

public class Main {

    public static void main(String[] args) {
	Tas tas = new Tas(15);
	tas.ajout(16);
	tas.ajout(14);
	tas.ajout(10);
	tas.ajout(8);
	tas.ajout(7);
	tas.ajout(9);
	tas.ajout(3);
	tas.parcoursEnLargeur();
	tas.ajout(15);
	tas.parcoursEnLargeur();
	tas.ajout(18);
	tas.parcoursEnLargeur();
	// TODO Auto-generated method stub
	tas.retrait();
	tas.parcoursEnLargeur();
	tas.retrait();
	tas.parcoursEnLargeur();
	tas.ajout(1);
	tas.parcoursEnLargeur();
	tas.ajout(13);
	tas.parcoursEnLargeur();
    }

}
