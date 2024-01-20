package com.structureDonnees.sequentielles.llc;

public class Main {

    public static void main(String[] args) {
/************************* LLC : Listes lin�aires cha�n�es **********************************/
	
	ListeLineaireChainee LLC = new ListeLineaireChainee();
	// Ajoutuer des �l�ments dans la liste :
	LLC.ajouterAListe(4);
	LLC.ajouterAListe("9");
	LLC.ajouterAListe(6);
	LLC.ajouterAListe(2);
	// Afficher la liste :
	System.out.println("afficher LLC :");
	LLC.afficherListe();
	
	
	int intVal = 4;
	// Rechercher valeur dans la liste :
	if (LLC.rechercherValeur(intVal)) {
	    System.out.println("valeur " + intVal + " trouv�e !");
	} else {
	    System.out.println("valeur introuvable");
	}
	
	System.out.println("\n");
	
/************************* LLCB : Listes lin�aires cha�n�es bidirectionnelles *******************/
	
	
	ListeLineaireChaineeBidirectionnelle LLCB = new ListeLineaireChaineeBidirectionnelle();
	LLCB.ajouterAListe(5);
	LLCB.ajouterAListe("8");
	LLCB.ajouterAListe(2);
	// Afficher la liste :
	System.out.println("afficher LLCB : \ndepuis tete :");
	LLCB.afficherListeDepuisTete();
	System.out.println("depuis queue :");
	LLCB.afficherListeDepuisQueue();
	
	
	String stringVal = "8";
	// Rechercher valeur dans la liste :
	if (LLCB.rechercherValeur(stringVal)) {
	    System.out.println("valeur " + stringVal + " trouv�e !");
	} else {
	    System.out.println("valeur introuvable");
	}
	

	
    }
}
