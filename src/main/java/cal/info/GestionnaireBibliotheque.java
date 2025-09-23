package cal.info;

import java.util.ArrayList;
import java.util.List;

public class GestionnaireBibliotheque {
    private final List<Livre> livres = new ArrayList<>();

    public void ajouterLivre(Livre livre) {
        if (livre != null) livres.add(livre);
    }

    public void afficherDetailsLivres() {
        livres.forEach(livre -> System.out.println(livre.livreDetails()));
    }

    public void afficherTitreEtAuteurLivres() {
        livres.forEach(livre -> System.out.println(formatTitreEtAuteur(livre)));
    }

    private String formatTitreEtAuteur(Livre livre) {
        return "-> Livre: " + livre.getTitre() + " par " + livre.getAuteur();
    }
}
