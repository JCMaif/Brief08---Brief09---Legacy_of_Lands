package org.exercice.models.unite;

import org.exercice.models.lieu.LieuxPossibles;
import org.exercice.models.unite.interfaces.PeutAllerALExterieur;
import org.exercice.models.unite.interfaces.PeutAllerDansCaserne;
import org.exercice.models.unite.interfaces.PeutAllerSurMuraille;
import org.exercice.models.unite.interfaces.PeutCollecterDesArmes;

public class Chef extends AbstractUniteMobile implements   PeutCollecterDesArmes, PeutAllerALExterieur, PeutAllerDansCaserne, PeutAllerSurMuraille {

    public Chef(){
        super("Chef", 200);
    }

    public void setLieu(LieuxPossibles lieu) {
        switch (lieu) {
            case CASERNE:
            case MURAILLE:
            case EXTERIEUR:
                super.setLieu(lieu);
                break;
            default:
                System.out.println("Chef ne peut pas aller là : " + lieu);
        }
    }
}
