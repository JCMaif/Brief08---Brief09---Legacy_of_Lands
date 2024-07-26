package org.exercice.models.unite;

import org.exercice.models.lieu.LieuxPossibles;
import org.exercice.models.unite.interfaces.*;

import java.util.EnumSet;
import java.util.Set;

public class Soldat extends AbstractUniteMobile implements   PeutCollecterDesArmes, PeutAllerALExterieur, PeutAllerDansCaserne, PeutAllerSurMuraille {

    private static final Set<LieuxPossibles> LIEUX_AUTORISES = EnumSet.of(
            LieuxPossibles.CASERNE,
            LieuxPossibles.MURAILLE
    );

    public Soldat(){
        super("Soldat", 100, LIEUX_AUTORISES);
    }

}
