package org.exercice.models.building;

import org.exercice.models.unite.interfaces.Unite;

import java.util.ArrayList;
import java.util.List;

public abstract class AbstractBuilding implements Building {
    protected String name;
    protected int health;
    protected int capacity;
    protected int maxRepos;
    protected int currentRepos;
    protected int maxBois;
    protected int currentBois;
    protected int maxPierre;
    protected int currentPierre;
    protected int maxNourriture;
    protected int currentNourriture;
    protected int maxFer;
    protected int currentFer;
    protected int maxOutil;
    protected int currentOutil;
    protected int maxArme;
    protected int currentArme;

    protected List<Unite> unites;
    protected List<Building> buildings;


    public AbstractBuilding(String name, int health, int capacity) {
        this.name = name;
        this.health = health;
        this.capacity = capacity;
        this.unites = new ArrayList<>();
        this.buildings = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public int getMaxRepos() {
        return maxRepos;
    }

    public void setMaxRepos(int maxRepos) {
        this.maxRepos = maxRepos;
    }

    public int getCurrentRepos() {
        return currentRepos;
    }

    public void setCurrentRepos(int currentRepos) {
        this.currentRepos = currentRepos;
    }

    public int getMaxBois() {
        return maxBois;
    }

    public void setMaxBois(int maxBois) {
        this.maxBois = maxBois;
    }

    public int getCurrentBois() {
        return currentBois;
    }

    public void setCurrentBois(int currentBois) {
        this.currentBois = currentBois;
    }

    public int getMaxPierre() {
        return maxPierre;
    }

    public void setMaxPierre(int maxPierre) {
        this.maxPierre = maxPierre;
    }

    public int getCurrentPierre() {
        return currentPierre;
    }

    public void setCurrentPierre(int currentPierre) {
        this.currentPierre = currentPierre;
    }

    public int getMaxNourriture() {
        return maxNourriture;
    }

    public void setMaxNourriture(int maxNourriture) {
        this.maxNourriture = maxNourriture;
    }

    public int getCurrentNourriture() {
        return currentNourriture;
    }

    public void setCurrentNourriture(int currentNourriture) {
        this.currentNourriture = currentNourriture;
    }

    public int getMaxFer() {
        return maxFer;
    }

    public void setMaxFer(int maxFer) {
        this.maxFer = maxFer;
    }

    public int getCurrentFer() {
        return currentFer;
    }

    public void setCurrentFer(int currentFer) {
        this.currentFer = currentFer;
    }

    public int getMaxOutil() {
        return maxOutil;
    }

    public void setMaxOutil(int maxOutil) {
        this.maxOutil = maxOutil;
    }

    public int getCurrentOutil() {
        return currentOutil;
    }

    public void setCurrentOutil(int currentOutil) {
        this.currentOutil = currentOutil;
    }

    public int getMaxArme() {
        return maxArme;
    }

    public void setMaxArme(int maxArme) {
        this.maxArme = maxArme;
    }

    public int getCurrentArme() {
        return currentArme;
    }

    public void setCurrentArme(int currentArme) {
        this.currentArme = currentArme;
    }

    @Override
    public void build() {
        System.out.println(name + " est en construction.");
    }

    public void addUnite(Unite unite) {
        unites.add(unite);
    }

    public void addBuilding(Building building) {
        buildings.add(building);
    }

    public List<Unite> getUnites() {
        return unites;
    }

    public List<Building> getBuildings() {
        return buildings;
    }
    @Override
    public String getDescription() {
        StringBuilder description = new StringBuilder("Building: " + name + ", Health: " + health + ", Capacity: " + capacity + "\n"
                + "Ressources : \n"
                + " Repos : " + currentRepos + "/" + maxRepos + "\n"
                + " Bois : " + currentBois + "/" + maxBois + "\n"
                + " Pierre : " + currentPierre + "/" + maxPierre + "\n"
                + " Nourriture : " + currentNourriture + "/" + maxNourriture + "\n"
                + " Fer : " + currentFer + "/" + maxFer + "\n"
                + " Outil : " + currentOutil + "/" + maxOutil + "\n"
                + "--------------------------------------\n"
                + "Population : \n");

//        for (Unite unite : unites) {
//            description.append(unite.getDescription()).append("\n");
//        }

        description.append("Bâtiments : \n");
        for (Building building : buildings) {
            description.append(building.getDescription()).append("\n");
        }

        return description.toString();
    }


}