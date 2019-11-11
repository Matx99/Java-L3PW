import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.io.IOException;

public abstract class Fichier {
	public Path chemin;

  // On utilise le constructeur afin d'instancier la propriété chemin
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
    // On récupère le texte à partir de la méthode lire()
    String texte = this.lire();
    // On instancie un objet de type stringBuilder afin de manipuler
    // la chaine de caractère
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append(texte); 
    // On inverse le texte
    stringBuilder = stringBuilder.reverse();
    // On converti l'objet stringBuilder en chaine de caractères
    return stringBuilder.toString();
  }

}
