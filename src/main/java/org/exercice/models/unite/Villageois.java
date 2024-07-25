package org.exercice.models.unite;

import org.exercice.models.lieu.LieuxPossibles;
import org.exercice.models.unite.interfaces.*;

public class Villageois extends AbstractUniteMobile implements PeutCollecterDesOutils, PeutCollecterDeLaNourriture, PeutCollecterDesPierres, PeutCollecterDuBois, PeutCollecterDuFer, PeutCollecterDuRepos, PeutAllerDansVillage, PeutAllerDansMaison, PeutAllerDansFerme {

    public Villageois(){
        super("Villageois", 50);
    }

    public void setLieu(LieuxPossibles lieu) {
        switch (lieu) {
            case MAISON:
            case FERME:
            case VILLAGE:
                super.setLieu(lieu);
                break;
            default:
                System.out.println("Villageois ne peut pas aller là : " + lieu);
        }
    }

    public Villageois(String name, int health) {
        super(name, health);
    }

    @Override
    public String getName() {
        return name != null ? name : "Villageois";
    }
}
