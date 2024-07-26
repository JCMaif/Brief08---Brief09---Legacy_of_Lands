package org.exercice.models.unite;

import org.exercice.models.lieu.LieuxPossibles;
import org.exercice.models.unite.interfaces.*;

import java.util.EnumSet;
import java.util.Set;

public class Villageois extends AbstractUniteMobile implements
        PeutCollecterDesOutils,
        PeutCollecterDeLaNourriture,
        PeutCollecterDesPierres,
        PeutCollecterDuBois,
        PeutCollecterDuFer,
        PeutCollecterDuRepos,
        PeutAllerDansVillage,
        PeutAllerDansMaison,
        PeutAllerDansFerme {

    private static final Set<LieuxPossibles> LIEUX_AUTORISES = EnumSet.of(
            LieuxPossibles.MAISON,
            LieuxPossibles.FERME,
            LieuxPossibles.VILLAGE
    );
    public Villageois() {
        super("Villageois", 50, LIEUX_AUTORISES);
    }

    public Villageois(String name, int health) {
        super(name, health, LIEUX_AUTORISES);
    }

    @Override
    public String getDescription() {
        return name != null ? name : "Villageois";
    }
}
