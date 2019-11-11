package fr.mat.bataille;
import java.util.*;

public class Joueur {
	// Déclaration des variables
	private ArrayList<Carte> paquet;
	private int score;
	
	// Constructeur par défaut
	Joueur(){
		// tableau de cartes et compteur de pts
		paquet = new ArrayList<Carte>();
		score = 0;
	}
	
	// methode pioche une carte
	public Carte pickCarte() {
		Carte cartePicked = paquet.get(0);// on prend la carte sur le haut du paquet
		paquet.remove(0);// puis on la supprime pour ne pas la repiocher
		return cartePicked;//on la retourne
	}
	
	// methode incrementation points
	public void gagnePoint() {
		score++;
	}
	
	// methode decrementation points
//	public void perdPoint() {
//		score--;
//	}
	// on ne peut que gagner des pts à la bataille??
	
	// methode ajoute une carte
	public void addCarte(Carte carte) {
		paquet.add(carte);
	}
	
	// methodes accesseurs
	public ArrayList<Carte> getPaquet() {
        return paquet;
    }
	
	public int getScore() {
        return score;
    }
}
