package com.structureDonnees.sequentielles.queue;

public class Main {

    public static void main(String[] args) {
	
/*************** FILE PAR DECALAGE : implémentation statique => tableau simple mais probleme de decalage à chaque défilement ****************/
	
	FileParDecalage fileParDecalage = new FileParDecalage();
	fileParDecalage.defiler();
	fileParDecalage.afficher();
	
	fileParDecalage.enfiler(1);
	fileParDecalage.afficher();
	
	fileParDecalage.enfiler(2);
	fileParDecalage.afficher();
	
	fileParDecalage.enfiler(3);
	fileParDecalage.afficher();
	
	fileParDecalage.enfiler(4);
	fileParDecalage.afficher();
	
	fileParDecalage.enfiler(5);
	fileParDecalage.afficher();
	
	fileParDecalage.enfiler(6);
	fileParDecalage.afficher();
	
	fileParDecalage.defiler();
	fileParDecalage.afficher();
	
/******************************* FILE PAR FLOT (implémentation statique) => tableau "circulaire" ********µµµµµµµµµµµµµµ*********************/
//                            les modulo % permettent de parcourir le tableau de manière circulaire 	
	
	
	FileParFlot fileParFlot = new FileParFlot();
	fileParFlot.enfiler(1);
	fileParFlot.afficher();
	
	fileParFlot.enfiler(2);
	fileParFlot.afficher();
	
	fileParFlot.enfiler(3);
	fileParFlot.afficher();
	
	fileParFlot.enfiler(4);
	fileParFlot.afficher();
	
	fileParFlot.defiler();
	fileParFlot.afficher();
	
	fileParFlot.defiler();
	fileParFlot.afficher();
	
	fileParFlot.enfiler(3);
	fileParFlot.afficher();
	
	fileParFlot.enfiler(4);
	fileParFlot.afficher();

	
	

/****************************************** FILE PAR LISTE LINEAIRE CHAINEE  : implémentation dynamique ****************************************/

	FileParLLC fileParLLC = new FileParLLC();
	
	fileParLLC.defiler();
	fileParLLC.afficher();
	
	fileParLLC.enfiler(0);
	fileParLLC.afficher();
	
	fileParLLC.enfiler("yes");
	fileParLLC.afficher();
	
	fileParLLC.enfiler(1);
	fileParLLC.afficher();
	
	fileParLLC.enfiler("no");
	fileParLLC.afficher();
	
	fileParLLC.enfiler(0);
	fileParLLC.afficher();
	
	fileParLLC.defiler();
	fileParLLC.afficher();
	
	fileParLLC.enfiler("WhyNot");
	fileParLLC.afficher();
	
	fileParLLC.defiler();
	fileParLLC.afficher();
	fileParLLC.defiler();
	fileParLLC.afficher();
	fileParLLC.defiler();
	fileParLLC.afficher();
	fileParLLC.defiler();
	fileParLLC.afficher();
	fileParLLC.defiler();
	fileParLLC.afficher();
	fileParLLC.defiler();
	

	
/********************************************* FILE DATTENTE AVEC PRIORITE : implémentation dynamique (=> LLC ) ********************************/
//                            Il semblerait que les tas soient plus appropriés pour faire ce traitement là.

	// TODO
	
    }

}
