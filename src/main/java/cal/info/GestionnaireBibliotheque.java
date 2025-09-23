package cal.info;

import java.util.ArrayList;
import java.util.List;

public class GestionnaireBibliotheque {
    private List<Livre> livres;
    private int totalLivres;

    public GestionnaireBibliotheque() {
        livres = new ArrayList<>();
        totalLivres = 0;
    }

    public void ajouterLivre(Livre livre) {
        if (livre != null) {
            livres.add(livre);
            totalLivres++;
        }
    }

    public void afficherDetailsLivres() {
        for (Livre livre : livres) {
            System.out.println(livre.livreDetails());
        }
    }

    public void afficherTitreEtAuteurLivres() {
        for (Livre livre : livres) {
            System.out.println("-> Livre: " + livre.getTitre() + " par " + livre.getAuteur());
        }
    }
}
