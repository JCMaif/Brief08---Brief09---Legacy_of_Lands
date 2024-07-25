package org.exercice.models.unite;

import org.exercice.models.lieu.LieuxPossibles;
import org.exercice.models.unite.interfaces.PeutAllerALExterieur;
import org.exercice.models.unite.interfaces.PeutAllerDansMaison;
import org.exercice.models.unite.interfaces.PeutCollecterDuRepos;

public class Eclaireur extends AbstractUniteMobile implements PeutCollecterDuRepos, PeutAllerALExterieur, PeutAllerDansMaison {
    public Eclaireur() {
        super("Eclaireur", 70);
    }

    @Override
    public void setLieu(LieuxPossibles lieu) {
        switch (lieu) {
            case MAISON:
            case EXTERIEUR:
                super.setLieu(lieu);
                break;
            default:
                System.out.println("Eclaireur ne peut pas aller là : " + lieu);
        }
    }

}
