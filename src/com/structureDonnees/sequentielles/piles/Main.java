package com.structureDonnees.sequentielles.piles;

public class Main {

    public static void main(String[] args) {
	
/****************************** Pile par Tableau *****************************/
	    
//	PileParTableau pileTab = new PileParTableau();
//	pileTab.depiler();
//	pileTab.empiler(5);
//	pileTab.empiler(6);
//	pileTab.empiler(7);
//	pileTab.empiler(8);
//	pileTab.empiler(9);
//	pileTab.depiler();
//	pileTab.afficher();
	
	
	

	
/********************* Pile par Liste Lénéaire Chaînée ***********************/
	
	PileParLLC pileLLC = new PileParLLC();
	pileLLC.depiler();
	pileLLC.empiler(4);
	pileLLC.empiler(8);
	pileLLC.empiler(5);
	pileLLC.afficherPile();
	pileLLC.depiler();
	pileLLC.afficherPile();
	pileLLC.empiler(7);
	pileLLC.empiler(3);
	pileLLC.afficherPile();
	pileLLC.depiler();
	pileLLC.depiler();
	pileLLC.depiler();
	pileLLC.depiler();
	pileLLC.depiler();
	
    }
    

}
