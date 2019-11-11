class Main {
  public static void main(String[] args) {
    // CrÃ©e un objet de type Txt
    Fichiers txt = new Fichiers("toRead.txt");
    System.out.println(txt.lire());
    System.out.println(txt.lireInverse());

    // CrÃ©e un objet de type CSV
    Fichiers csv = new Fichiers("test.csv");
    System.out.println(csv.lire());
    System.out.println(csv.lireInverse());
  }
}
