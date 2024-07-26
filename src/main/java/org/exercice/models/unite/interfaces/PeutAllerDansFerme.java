package org.exercice.models.unite.interfaces;

import org.exercice.models.lieu.LieuChoix;
import org.exercice.models.lieu.LieuxPossibles;

public interface PeutAllerDansFerme extends LieuChoix {
    default LieuxPossibles getLieu() {
        return LieuxPossibles.FERME;
    }
}
