package org.exercice.models.unite;

import org.exercice.models.lieu.LieuxPossibles;
import org.exercice.models.ressources.RessourcesPossibles;

import java.util.EnumSet;
import java.util.Set;

public class AbstractUniteMobile extends AbstractUnite{
    protected LieuxPossibles lieu;
    protected Set<RessourcesPossibles> ressources;

    public AbstractUniteMobile(String name, int health) {
        super(name, health);
        this.lieu = null;
        this.ressources = EnumSet.noneOf(RessourcesPossibles.class);
    }

    public void setLieu(LieuxPossibles lieu) {
        this.lieu = lieu;
        switch (lieu) {
            case MAISON:
                ressources = EnumSet.of(RessourcesPossibles.REPOS);
                break;
            case FERME:
                ressources = EnumSet.of(RessourcesPossibles.NOURRITURE, RessourcesPossibles.BOIS, RessourcesPossibles.PIERRE);
                break;
            case VILLAGE:
                ressources = EnumSet.of(RessourcesPossibles.BOIS, RessourcesPossibles.PIERRE, RessourcesPossibles.FER);
                break;
            case EXTERIEUR, MURAILLE, CHANTIER, CASERNE:
                ressources = EnumSet.noneOf(RessourcesPossibles.class);
                break;
            case ATELIER:
                ressources = EnumSet.of(RessourcesPossibles.OUTIL, RessourcesPossibles.ARME);
                break;
            default:
                System.out.println(name + " ne peut pas aller là : " + lieu);
                ressources = EnumSet.noneOf(RessourcesPossibles.class);
        }
    }

    public LieuxPossibles getLieu() {
        return lieu;
    }

    public Set<RessourcesPossibles> getRessources() {
        return ressources;
    }

    public void showUnite(String name) {
        System.out.println(name + " a " + health + " points de vie");
        if (getLieu() != null) {
            System.out.println(name + " est dans : " + getLieu());
            System.out.println("Et il a accès à : " + getRessources());
        }
    }
}
