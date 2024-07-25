package org.exercice.models.building;

import org.exercice.models.unite.AbstractUnite;
import org.exercice.models.unite.interfaces.Unite;

public class Village extends AbstractBuilding {
    public Village(String name) {
        super(name, 100000, 10000);
        this.maxRepos = 0;
        this.currentRepos = 0;
        this.maxBois = 500;
        this.currentBois = 500;
        this.maxPierre = 500;
        this.currentPierre = 500;
        this.maxNourriture = 1000;
        this.currentNourriture = 1000;
        this.maxFer = 500;
        this.currentFer = 500;
        this.maxOutil = 0;
        this.currentOutil = 0;
        this.maxArme = 0;
        this.currentArme = 0;
    }

    @Override
    public String getDescription() {
        StringBuilder description = new StringBuilder(name + ", Health: " + health + ", Capacity: " + capacity + "\n"
                + "Ressources : \n"
                + " Repos : " + currentRepos + "/" + maxRepos + "\n"
                + " Bois : " + currentBois + "/" + maxBois + "\n"
                + " Pierre : " + currentPierre + "/" + maxPierre + "\n"
                + " Nourriture : " + currentNourriture + "/" + maxNourriture + "\n"
                + " Fer : " + currentFer + "/" + maxFer + "\n"
                + " Outil : " + currentOutil + "/" + maxOutil + "\n"
                + "--------------------------------------\n"
                + "Population : \n");

        for (Unite unite : getUnites()) {
            description.append(unite.getDescription()).append("\n");
        }

        description.append("Bâtiments : \n");
        for (Building building : getBuildings()) {
            description.append(building.getDescription()).append("\n");
        }

        return description.toString();
    }
    public Unite getUnite(String name) {
        for (Unite unite : unites) {
            if (unite instanceof AbstractUnite) {
                String uniteName = ((AbstractUnite) unite).getName();
                if (uniteName != null && uniteName.equals(name)) {
                    return unite;
                }
            }
        }
        return null;
    }
}
