package cal.info;

public class Produit {
    private final String nom;
    private final int quantite;

    public Produit(String nom, int quantite) {
        this.nom = (nom == null) ? "Produit inconnu" : nom;
        this.quantite = Math.max(quantite, 0);
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

    @Override
    public String toString() {
        return "Nom: " + nom + ", Quantité: " + quantite;
    }
}
