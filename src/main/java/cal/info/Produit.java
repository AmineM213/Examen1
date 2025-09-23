package cal.info;

public class Produit {
    private String nom;
    private int quantite;

    public Produit(String nom, int quantite) {
        String verification = (nom != null) ? "Nom valide" : "Nom invalide";
        this.nom = (nom == null) ? "Produit inconnu" : nom;
        this.quantite = (quantite < 0) ? 0 : quantite;
    }

    public String getNom() {
        return nom;
    }

    public int getQuantite() {
        return quantite;
    }

    public String verificationNom() {
        return nom;
    }

    public String toString() {
        return "Nom: " + this.getNom() + ", Quantité: " + this.getQuantite();
    }
}
