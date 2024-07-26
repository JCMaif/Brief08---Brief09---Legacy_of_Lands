package org.exercice.models.unite;

import org.exercice.models.lieu.LieuxPossibles;
import org.exercice.models.unite.interfaces.PeutAllerALExterieur;
import org.exercice.models.unite.interfaces.PeutAllerDansCaserne;
import org.exercice.models.unite.interfaces.PeutAllerSurMuraille;
import org.exercice.models.unite.interfaces.PeutCollecterDesArmes;

import java.util.EnumSet;
import java.util.Set;

public class Chef extends AbstractUniteMobile implements   PeutCollecterDesArmes, PeutAllerALExterieur, PeutAllerDansCaserne, PeutAllerSurMuraille {

    private static final Set<LieuxPossibles> LIEUX_AUTORISES = EnumSet.of(
            LieuxPossibles.CASERNE,
            LieuxPossibles.MURAILLE
    );

    public Chef(){
        super("Chef", 200, LIEUX_AUTORISES);
    }
}
