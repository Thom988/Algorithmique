package com.structureDonnees.sequentielles.llc;

public class Maillon<T> {
    
    private T valeur;
    private Maillon<T> suivant;
    
    
// le Garbage Collector en java gere automatiquement la mémoire, inutile d'allouer ou liberer
////////////////////////////////////////
    private void allouer() {
	
    }
    private void liberer() {
	
    }
////////////////////////////////////////
    
    
    public T getValeur() {
	return this.valeur;
    }
    public Maillon<T> getSuivant() {
	return this.suivant;
    }
    public void setValeur(T valeur) {
	this.valeur = valeur;
    }
    public void setSuivant(Maillon<T> refSuivant) {
	this.suivant = refSuivant;
    }

}
