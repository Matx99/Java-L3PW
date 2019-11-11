// On hÃ©rite de la classe Fichier et on implÃ©mante l'interface Lecteur
public class Fichiers extends Fichier implements Lecteur {

	Fichiers(String path) {
    // On appelle le constructeur du parent (Fichier)
		super(path);
	}

}
