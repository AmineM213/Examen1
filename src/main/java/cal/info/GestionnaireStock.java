package cal.info;

import java.util.ArrayList;
import java.util.List;

public class GestionnaireStock {

    private final List<Produit> produits = new ArrayList<>();

    public void ajouterProduit(Produit produit) {
        produits.add(produit);
    }

    public void afficherProduitsEnStock() {
        for (Produit produit : produits) {
            System.out.println(produit);
        }
    }
}
