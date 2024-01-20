package com.structureDonnees.sequentielles.llc;

public class MaillonBidirectionnel<T> {
    T valeur;
    MaillonBidirectionnel<T> precedent, suivant;
    
    
    public T getValeur() {
	return this.valeur;
    }
    
    public void setValeur(T valeur) {
	this.valeur = valeur;
    }
    
    public MaillonBidirectionnel<T> getPrecedent() {
	return this.precedent;
    }
    
    public MaillonBidirectionnel<T> getSuivant() {
	return this.suivant;
    }
    
    public void setPrecedent(MaillonBidirectionnel<T> precedentMaillon) {
	this.precedent = precedentMaillon;
    }
    
    public void setSuivant(MaillonBidirectionnel<T> maillonSuivant) {
	this.suivant = maillonSuivant;
    }
    
}
