package org.exercice.models.building;

import org.exercice.models.ressources.RessourceChoix;

public class Atelier extends AbstractBuilding implements RessourceChoix {
    public Atelier(){
        super("Atelier", 250, 10);
        this.maxRepos = 0;
        this.currentRepos = 0;
        this.maxBois = 10;
        this.currentBois = 5;
        this.maxPierre = 0;
        this.currentPierre = 0;
        this.maxNourriture = 0;
        this.currentNourriture = 0;
        this.maxFer = 20;
        this.currentFer = 8;
        this.maxOutil = 20;
        this.currentOutil = 4;
        this.maxArme = 30;
        this.currentArme = 5;
    }
}
