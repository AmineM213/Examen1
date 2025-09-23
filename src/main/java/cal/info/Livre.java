package cal.info;

public class Livre {
    private final String titre;
    private final String auteur;
    private final String codeISBN;

    public Livre(String titre, String auteur) {
        this(titre, auteur, "Inconnu");
    }

    public Livre(String titre, String auteur, String codeISBN) {
        this.titre = titre;
        this.auteur = auteur;
        this.codeISBN = codeISBN;
    }

    public String getTitre() { return titre; }
    public String getAuteur() { return auteur; }
    public String getCodeISBN() { return codeISBN; }

    public String livreDetails() {
        return String.format("Titre: %s, Auteur: %s, ISBN: %s", titre, auteur, codeISBN);
    }
}
