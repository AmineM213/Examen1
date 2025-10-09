package cal.info;

public class ApplicationStock {
    public static void main(String[] args) {
        GestionnaireStock gestionnaire = new GestionnaireStock();
        gestionnaire.ajouterProduit(new Produit("Laptop", 5));
        gestionnaire.ajouterProduit(new Produit("Laptop", 5));
        gestionnaire.ajouterProduit(new Produit("Smartphone", 10));
        gestionnaire.ajouterProduit(new Produit("Tablette", 0));
        gestionnaire.afficherProduitsEnStock();
    }
}
