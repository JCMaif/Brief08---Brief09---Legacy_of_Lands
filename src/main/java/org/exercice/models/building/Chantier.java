package org.exercice.models.building;

import org.exercice.models.ressources.RessourceChoix;

public class Chantier extends AbstractBuilding implements RessourceChoix {
    public Chantier(){
        super("Chantier", 20, 4);
        this.maxRepos = 0;
        this.currentRepos = 0;
        this.maxBois = 5;
        this.currentBois = 3;
        this.maxPierre = 0;
        this.currentPierre = 0;
        this.maxNourriture = 0;
        this.currentNourriture = 0;
        this.maxFer = 5;
        this.currentFer = 2;
        this.maxOutil = 8;
        this.currentOutil = 2;
        this.maxArme = 0;
        this.currentArme = 0;
    }
}
