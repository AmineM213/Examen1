package cal.info;

public class Livre {
    private String titre;
    private String auteur;
    private String codeISBN;

    public Livre(String titre, String auteur) {
        this.titre = titre;
        this.auteur = auteur;
        this.codeISBN = "Inconnu";
    }

    public String getTitre() {
        return titre;
    }

    public String getAuteur() {
        return auteur;
    }

    public String getCodeISBN() {
        return codeISBN;
    }

    public String livreDetails() {
        return "Titre: " + titre + ", Auteur: " + auteur + ", ISBN: " + codeISBN;
    }
}