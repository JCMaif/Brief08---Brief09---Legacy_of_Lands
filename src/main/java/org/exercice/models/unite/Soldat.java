package org.exercice.models.unite;

import org.exercice.models.lieu.LieuxPossibles;
import org.exercice.models.unite.interfaces.*;

public class Soldat extends AbstractUniteMobile implements   PeutCollecterDesArmes, PeutAllerALExterieur, PeutAllerDansCaserne, PeutAllerSurMuraille {

    public Soldat(){
        super("Soldat", 100);
    }

    public void setLieu(LieuxPossibles lieu) {
        switch (lieu) {
            case CASERNE:
            case MURAILLE:
            case EXTERIEUR:
                super.setLieu(lieu);
                break;
            default:
                System.out.println("Soldat ne peut pas aller là : " + lieu);
        }
    }
}
