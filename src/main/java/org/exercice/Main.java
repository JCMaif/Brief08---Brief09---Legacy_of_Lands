package org.exercice;

import org.exercice.models.building.Village;
import org.exercice.models.lieu.LieuxPossibles;
import org.exercice.models.unite.Villageois;
import org.exercice.utils.DisplayUtil;
import org.exercice.utils.VillageInitializer;
import org.exercice.utils.VillageUtils;

public class Main {
    public static void main(String[] args) {
        Village tatouin = VillageInitializer.initializeVillage();

        Villageois villageois = (Villageois) tatouin.getUnite("Villageois");
        villageois.setLieu(LieuxPossibles.MAISON);
        villageois.showUnite(villageois.getName());

        //DisplayUtil displayVillage(tatouin);
        System.out.println(villageois.getDescription());
        System.out.println("-------------Village----------------");
        System.out.println(VillageUtils.getSummary(tatouin));
    }
}
