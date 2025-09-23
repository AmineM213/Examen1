package cal.info;

public class ApplicationStock {
    public static void main(String[] args) {
        GestionnaireStock gestionnaire = new GestionnaireStock();
        Produit laptop = new Produit("Laptop", 5);
        Produit smartphone = new Produit("Smartphone", 10);

        gestionnaire.ajouterProduit(laptop);
        gestionnaire.ajouterProduit(laptop);
        gestionnaire.ajouterProduit(smartphone);

        gestionnaire.afficherProduitsEnStock();

        gestionnaire.ajouterProduit(getProduitInutilise());
        gestionnaire.afficherProduitsEnStock();
    }

    public static Produit getProduitInutilise() {
        return new Produit("Tablette", 0);
    }

}