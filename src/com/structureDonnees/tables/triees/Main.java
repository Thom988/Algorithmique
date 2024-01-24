/*
 C’est une technique très utilisée en informatique, elle se base sur une fonction h appelée
fonction de hachage ou de hashcoding, qui appliquée à la clé fournit l’indice correspondant
dans la table : 

– Clé = Caractère (A, B, ···)
– N = 10
– h : Code ASCII mod N

h(Cle) = i (indice du tableau)


Un problème sérieux se pose avec les fonctions de hachage si deux clés différentes
donnent lieu à une même adresse lorsqu’on leur applique la fonction de hachage, c-à-d
h(cle1) = h(cle2).
Une telle situation est appelée « collision » et plusieurs solutions existent pour sa résolution.

Les LLC :
    Elle consiste à placer toutes les clés qui donnent le même indice qu’une clé existante
    dans une liste linéaire chainée, appelée liste de débordement
Essai linéaire (adressage ouvert) :
    Cette méthode est généralement utilisée si le nombre d’informations est peu par rapport à la taille de la table. On range la clé qui a causé la collision (k par exemple) dans la
    première position vide dans la séquence cyclique :
    h(k - 1), h(k - 2), ··· , 0, N - 1, N − 2,...,h(k + 1)
    On doit garder, dans ce cas, une case toujours vide pour indiquer la fin de la recherche,
    c-à-d une valeur interdite dans les clés
Chaînage interne séparé :
    On ajoute à la table une partie réservée aux collisions de taille M. La taille de la table
    sera donc N + M.
    On insère l’élément en collision dans la première place vide dans la partie des collisions et
    on le relie par un chaînage.

 */

package com.structureDonnees.tables.triees;

public class Main {

    public static void main(String[] args) {
	Hachage table = new Hachage(24);
	
	int indice = 0;
	System.out.println("Fonction hachage caractère : ");
	indice = table.hachageChar('J');
	System.out.println("indice = " + indice);
	
	System.out.println("Fonction hachage chaine de caractère : ");
	indice = table.hachageString("Thomas");
	System.out.println("indice = " + indice);
	
	System.out.println("Fonction hachage valeur numerique : ");
	indice = table.hachageNum(5);
	System.out.println("indice = " + indice);
	
	System.out.println("Fonction hachage milieu du carre : ");
	indice = table.hachageMilieuDuCarre(453);
	System.out.println("indice = " + indice);
	
	System.out.println("Fonction hachage suite de Fibonacci : ");
	indice = table.hachageDeFibonacci(62);
	System.out.println("indice = " + indice);
	
	table.ajouter("maj", "Thom");
	table.ajouter("adx", "Tom");
	
	System.out.println(table.acceder("maj"));
	System.out.println(table.acceder("adx"));
	
	table.retirer("maj");
	System.out.println(table.acceder("maj"));
	
	

    }

}
