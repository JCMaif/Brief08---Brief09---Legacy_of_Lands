package org.exercice.models.unite;

import org.exercice.models.lieu.LieuxPossibles;
import org.exercice.models.unite.interfaces.*;

import java.util.EnumSet;
import java.util.Set;

public class Artisan extends AbstractUniteMobile implements PeutCollecterDesOutils, PeutCollecterDuBois, PeutCollecterDuFer, PeutCollecterDuRepos, PeutAllerDansVillage, PeutAllerDansMaison, PeutAllerDansAtelier, PeutAllerSurChantier {

    private static final Set<LieuxPossibles> LIEUX_AUTORISES = EnumSet.of(
            LieuxPossibles.MAISON,
            LieuxPossibles.ATELIER,
            LieuxPossibles.VILLAGE,
            LieuxPossibles.CHANTIER
    );
    public Artisan(){
        super("Artisan", 70, LIEUX_AUTORISES);
    }

    @Override
    public String getDescription() {
        return name != null ? name : "Artisan";
    }

}
