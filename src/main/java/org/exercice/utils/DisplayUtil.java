package org.exercice.utils;

import org.exercice.models.building.Village;

public class DisplayUtil {
    public static void displayVillage(Village village) {
        System.out.println("-------------Village----------------");
        System.out.println(village.getDescription());
    }
}
