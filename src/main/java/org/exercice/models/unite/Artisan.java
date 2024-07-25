package org.exercice.models.unite;

import org.exercice.models.lieu.LieuxPossibles;
import org.exercice.models.unite.interfaces.*;

public class Artisan extends AbstractUniteMobile implements PeutCollecterDesOutils, PeutCollecterDuBois, PeutCollecterDuFer, PeutCollecterDuRepos, PeutAllerDansVillage, PeutAllerDansMaison, PeutAllerDansAtelier, PeutAllerSurChantier {

    public Artisan(){
        super("Artisan", 70);
    }

    @Override
    public void setLieu(LieuxPossibles lieu) {
        switch (lieu) {
            case MAISON:
            case ATELIER:
            case CHANTIER:
            case VILLAGE:
                super.setLieu(lieu);
                break;
            default:
                System.out.println("Artisan ne peut pas aller là : " + lieu);
        }
    }
}
