package cal.info;

import java.util.ArrayList;
import java.util.List;

public class GestionnaireStock {

    private List<Produit> produits;

    public GestionnaireStock() {
        produits = new ArrayList<>();
    }

    public void ajouterProduit(Produit produit, boolean logAjout) {
        produits.add(produit);
        if (logAjout) {
            System.out.println("Un produit a été ajouté : " + produit.getNom());
        }
    }

    public void ajouterProduit(Produit produit) {
        ajouterProduit(produit, false);
    }

    public void afficherStock() {
        for (Produit produit : produits) {
            System.out.println(produit);
        }
    }

    public void afficherProduitsEnStock() {
        afficherStock();
        afficherStock();
        System.out.println("Affichage terminé.");
    }

}
