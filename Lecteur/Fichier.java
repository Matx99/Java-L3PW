import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.io.IOException;

public abstract class Fichier {
	public Path chemin;

  // On utilise le constructeur afin d'instancier la propriÃ©tÃ© chemin
	Fichier(String path) {
		chemin = Paths.get(path);
	}

	public String lire() {
    // On créé une variable temporaire pour stocker le texte
    String texte = "";
    // On gère l'erreur et on affiche un message
    try {
      // Pour toutes les lignes dans le fichier
      for(String line : Files.readAllLines(this.chemin)) {
        // On ajoute la ligne a chaque passage de la boucle
        texte += line; 
      }
    } catch (IOException e) {
      System.out.println("Impossible de lire le fichier.");
    }
    // On retourne le texte
    return texte;
	}

  public String lireInverse() {
    // On rÃ©cupÃ¨re le texte Ã  partir de la mÃ©thode lire()
    String texte = this.lire();
    // On instancie un objet de type stringBuilder afin de manipuler
    // la chaine de caractÃ¨re
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append(texte); 
    // On inverse le texte
    stringBuilder = stringBuilder.reverse();
    // On converti l'objet stringBuilder en chaine de caractÃ¨res
    return stringBuilder.toString();
  }

}
