package cal.info;

public class ApplicationBibliotheque {
    public static void main(String[] args) {
        GestionnaireBibliotheque gestionnaire = new GestionnaireBibliotheque();

        Livre livre1 = new Livre("1984", "George Orwell");
        gestionnaire.ajouterLivre(livre1);

        Livre livre2 = new Livre("Le Petit Prince", "Antoine de Saint-Exupéry");
        gestionnaire.ajouterLivre(livre2);

        gestionnaire.afficherDetailsLivres();
        gestionnaire.afficherTitreEtAuteurLivres();
    }
}