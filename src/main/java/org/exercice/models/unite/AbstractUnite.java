package org.exercice.models.unite;

import org.exercice.models.unite.interfaces.Unite;

public class AbstractUnite implements Unite {
    protected String name;
    protected int health;

    public AbstractUnite(String name, int health) {
        this.name = name;
        this.health = health;
    }

    public String getName() {
        return name;
    }

    @Override
    public void performAction() {

    }


    @Override
    public String getDescription() {
        return "Unit: " + name + ", Health: " + health;
    }
}
