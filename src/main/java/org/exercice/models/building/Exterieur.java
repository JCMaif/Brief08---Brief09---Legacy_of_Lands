package org.exercice.models.building;

import org.exercice.models.ressources.RessourceChoix;

public class Exterieur extends AbstractBuilding implements RessourceChoix {
    public Exterieur(){
        super("Exterieur", 100000000,100000000);
        this.maxRepos = 0;
        this.currentRepos = 0;
        this.maxBois = 0;
        this.currentBois = 0;
        this.maxPierre = 0;
        this.currentPierre = 0;
        this.maxNourriture = 0;
        this.currentNourriture = 0;
        this.maxFer = 0;
        this.currentFer = 0;
        this.maxOutil = 0;
        this.currentOutil = 0;
        this.maxArme = 0;
        this.currentArme = 0;
    }
}
