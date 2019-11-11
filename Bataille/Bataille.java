package fr.mat.bataille;
import java.util.*;

public class Bataille {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// on créé les deux joueurs
		Joueur joueur1 = new Joueur();
		Joueur joueur2 = new Joueur();
		
		//on créé toutes les cartes possibles
		ArrayList<Carte> bataille = new ArrayList<Carte>();
        for(int i = 0; i < Carte.couleurs.length; i++){// tant que i est plus petit que le nombre de couleurs, on l'incremente
            for(int j = 0; j < Carte.valeurs.length; j++){// tant que j est plus petit que le nombre de couleurs, on l'incremente
                Carte carte = new Carte (i,j);// puis on créé une carte à chaque tour de la boucle for
                bataille.add(carte);// et on l'ajoute à la bataille
            }
        }
        
        // mélange du jeu
        Collections.shuffle(bataille); // la consigne indique math.random mais j'utilise https://www.geeksforgeeks.org/collections-shuffle-java-examples/
        
        // initialisation des paquets
        for(int i = 0; i < bataille.size() ; i++) { // tant qu'il reste des cartes, on continue la boucle
            if(i % 2 == 0) // i % 2 permet d'avoir un résultat impair (1) une fois sur deux (sinon c'est 0...) et donc de distribuer les cartes 1 fois sur 2 à chaque joueur
                joueur1.addCarte(bataille.get(i)); // si 1 % 2 == 0 alors on ajoute au paquet du joueur1 la carte qui se trouve à l'index i (https://www.geeksforgeeks.org/arraylist-get-method-java-examples/) 
            else 
                joueur2.addCarte(bataille.get(i)); // sinon on ajoute la carte au paquet du joueur2
        }
        
        // deroulement d'une partie
        while(joueur1.getPaquet().size() != 0 && joueur2.getPaquet().size() != 0){// tant que les deux joueurs ont encore des cartes, la partie continue
            // initialisation des paquets
        	Carte carteJoueur1 = joueur1.pickCarte();
            Carte carteJoueur2 = joueur2.pickCarte();
            
            if(carteJoueur1.comparateur(carteJoueur2) > 0) { // si la valeur de la carte du j1 et > à celle du j2
                joueur1.gagnePoint(); // alors j1 gagne un pt
                joueur1.addCarte(carteJoueur1); // puis il recupere les cartes
            }
            else { // sinon
                joueur2.gagnePoint(); // j2 gagne un pt
                joueur2.addCarte(carteJoueur2); // puis il recupere les cartes
            }
            
            System.out.println("Nombre de cartes du Joueur 1 " + joueur1.getPaquet().size() + ", score :" + joueur1.getScore()); 
            System.out.println("Nombre de cartes du Joueur 2 : " + joueur2.getPaquet().size() + ", score :" + joueur2.getScore()); 
            System.out.println("-----------------------------");
        }
        
        if(joueur1.getScore() > joueur2.getScore()){
            System.out.println("Le gagnant est le Joueur 1");
        }
        else {
            System.out.println("Le gagnant est le Joueur 2");
        }
	}
}

