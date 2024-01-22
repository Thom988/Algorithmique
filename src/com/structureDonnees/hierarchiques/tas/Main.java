/*
Un tas (heap en anglais) est un arbre qui v�rifie les deux propri�t�s suivantes :
1) C�est un arbre binaire complet c�est-�-dire un arbre binaire dont tous les niveaux sont
remplis sauf �ventuellement le dernier o� les �l�ments sont rang�s le plus � gauche
possible.
2) La cl� de tout n�ud est sup�rieure � celle de ses descendants.
L��l�ment le plus prioritaire se trouve donc toujours � la racine.


Les tas peuvent �tre impl�ment�s dynamiquement exactement comme les ABR, et sont
utilis�s par le m�me mod�le.
Une repr�sentation statique tr�s efficace utilisant des tableaux est tr�s utilis�e en pratique,
elle consiste � ranger les �l�ments du tas dans un tableau selon un parcours en largeur.

[16,14,10,8,7,9,3,2,4,1]
  P Fg Fd 

Le fils gauche (Fg) d�un �l�ment d�indice i (P) se trouve
toujours s�il existe � la position 2i, et son fils droit se trouve � la position (2i + 1) et son
p�re se trouve � la position i/2. Les op�rations d�ajout et de retrait sur le tas statique se
font de la m�me fa�on que dans le cas du tas dynamique. Avec ce principe les op�rations
d�ajout et de retrait se font d�une mani�re tr�s simple et extr�mement efficace.
Les tas sont utilis�s m�me pour le tri des tableaux : on ajoute les �l�ments d�un tableau �
un tas, puis on les retire dans l�ordre d�croissant.
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
