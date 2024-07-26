package org.exercice.models.unite;

import org.exercice.models.lieu.LieuxPossibles;
import org.exercice.models.unite.interfaces.PeutAllerALExterieur;
import org.exercice.models.unite.interfaces.PeutAllerDansMaison;
import org.exercice.models.unite.interfaces.PeutCollecterDuRepos;

import java.util.EnumSet;
import java.util.Set;

public class Eclaireur extends AbstractUniteMobile implements PeutCollecterDuRepos, PeutAllerALExterieur, PeutAllerDansMaison {
    private static final Set<LieuxPossibles> LIEUX_AUTORISES = EnumSet.of(
            LieuxPossibles.EXTERIEUR,
            LieuxPossibles.MAISON

    );
    public Eclaireur() {
        super("Eclaireur", 70, LIEUX_AUTORISES);
    }


}
