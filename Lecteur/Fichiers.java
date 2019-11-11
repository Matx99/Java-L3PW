// On hérite de la classe Fichier et on implémante l'interface Lecteur
public class Fichiers extends Fichier implements Lecteur {

	Fichiers(String path) {
    // On appelle le constructeur du parent (Fichier)
		super(path);
	}

}
