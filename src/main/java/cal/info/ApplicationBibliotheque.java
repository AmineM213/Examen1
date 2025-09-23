package cal.info;

public class ApplicationBibliotheque {
    public static void main(String[] args) {
        GestionnaireBibliotheque gestionnaire = new GestionnaireBibliotheque();

        gestionnaire.ajouterLivre(new Livre("1984", "George Orwell"));
        gestionnaire.ajouterLivre(new Livre("Le Petit Prince", "Antoine de Saint-Exupéry"));

        gestionnaire.afficherDetailsLivres();
        gestionnaire.afficherTitreEtAuteurLivres();
    }
}
