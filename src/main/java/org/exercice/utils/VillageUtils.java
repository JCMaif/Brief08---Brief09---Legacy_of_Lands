package org.exercice.utils;

import org.exercice.models.building.Building;
import org.exercice.models.building.Village;
import org.exercice.models.unite.interfaces.Unite;

import java.util.HashMap;
import java.util.Map;

public class VillageUtils {

    public static String getSummary(Village village) {
        Map<String, Integer> buildingCount = new HashMap<>();
        for (Building building : village.getBuildings()) {
            buildingCount.put(building.getDescription(), buildingCount.getOrDefault(building.getDescription(), 0) + 1);
        }

        Map<String, Integer> uniteCount = new HashMap<>();
        for (Unite unite : village.getUnites()) {
            uniteCount.put(unite.getDescription(), uniteCount.getOrDefault(unite.getDescription(), 0) + 1);
        }

        StringBuilder summary = new StringBuilder();
        summary.append("Village ").append(village.getName()).append(" créé avec:\n");
        for (Map.Entry<String, Integer> entry : buildingCount.entrySet()) {
            summary.append("    ").append(entry.getKey()).append(" : ").append(entry.getValue()).append("\n");
        }
        for (Map.Entry<String, Integer> entry : uniteCount.entrySet()) {
            summary.append("    ").append(entry.getKey()).append(" : ").append(entry.getValue()).append("\n");
        }
        return summary.toString();
    }
}
