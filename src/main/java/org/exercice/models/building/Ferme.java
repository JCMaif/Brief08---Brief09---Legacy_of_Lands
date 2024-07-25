package org.exercice.models.building;

public class Ferme extends AbstractBuilding{
    public Ferme() {
        super("Ferme", 80, 6);
        this.maxRepos = 0;
        this.currentRepos = 0;
        this.maxBois = 50;
        this.currentBois = 30;
        this.maxPierre = 50;
        this.currentPierre = 20;
        this.maxNourriture = 100;
        this.currentNourriture = 80;
        this.maxFer = 0;
        this.currentFer = 0;
        this.maxOutil = 0;
        this.currentOutil = 0;
        this.maxArme = 0;
        this.currentArme = 0;
    }

}
