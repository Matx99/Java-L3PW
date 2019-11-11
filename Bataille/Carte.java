package fr.mat.bataille;

public class Carte {
	// Déclaration des variables
	static String[] couleurs = {"coeur", "trefle", "carreau", "pique"};
	static String[] valeurs = {"2","3","4","5","6","7","8","9","10","roi","dame","valet","as"};
	private int carteCouleur;
	private int carteValeur;
	
	// Constructeur par défaut
	Carte(int uneCouleur, int uneValeur){
		carteCouleur = uneCouleur;
		carteValeur = uneValeur;
	}
	// methode comparateur
	public int comparateur(Carte adversaire) {
		if (this.carteValeur > adversaire.carteValeur)
			return 1;
		else
			return 0;
	}
	
	// methodes accesseurs
	public int getCouleur() {
        return carteCouleur;
    }
	
	public int getValeur() {
        return carteValeur;
    }
}
