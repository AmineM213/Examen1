package cal.info;

import java.util.ArrayList;
import java.util.List;

public class GestionnaireStock {

    private final List<Produit> produits = new ArrayList<>();

    public void ajouterProduit(Produit produit, boolean logAjout) {
        produits.add(produit);
    }

    public void ajouterProduit(Produit produit) {
        ajouterProduit(produit, false);
    }

    private void afficherStockUneFois() {
        for (Produit produit : produits) {
            System.out.println(produit);
        }
    }

    public void afficherProduitsEnStock() {
        afficherStockUneFois();
        afficherStockUneFois();
    }
}
