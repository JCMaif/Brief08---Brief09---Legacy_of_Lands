package org.exercice.utils;

import org.exercice.models.building.*;
import org.exercice.models.lieu.LieuxPossibles;
import org.exercice.models.unite.*;
public class VillageInitializer {
    public static Village initializeVillage() {
        Village village = new Village("Tatouin");

        // Ajout du chef
        Chef chef = new Chef();
        village.addUnite(chef);
        //chef.showUnite("Chef créé");

        // Ajout de 10 villageois
        for (int i = 0; i < 10; i++) {
            Villageois villageois = new Villageois();
            villageois.setLieu(LieuxPossibles.VILLAGE); // Par défaut, tous les villageois sont dans le village
            village.addUnite(villageois);
           // villageois.showUnite("Villageois créé");
        }

        // Ajout de 10 soldats
        for (int i = 0; i < 10; i++) {
            Soldat soldat = new Soldat();
            soldat.setLieu(LieuxPossibles.CASERNE); // Par défaut, tous les soldats sont dans la caserne
            village.addUnite(soldat);
            //soldat.showUnite("Soldat créé");
        }

        // Ajout de 2 éclaireurs
        for (int i = 0; i < 2; i++) {
            Eclaireur eclaireur = new Eclaireur();
            eclaireur.setLieu(LieuxPossibles.EXTERIEUR); // Par défaut, tous les éclaireurs sont à l'extérieur
            village.addUnite(eclaireur);
            //eclaireur.showUnite("Eclaireur créé");
        }

        // Ajout de 4 artisans
        for (int i = 0; i < 4; i++) {
            Artisan artisan = new Artisan();
            artisan.setLieu(LieuxPossibles.ATELIER); // Par défaut, tous les artisans sont à l'atelier
            village.addUnite(artisan);
            //artisan.showUnite("Artisan créé");
        }

        // Ajout de 10 maisons
        for (int i = 0; i < 10; i++) {
            Maison maison = new Maison();
            village.addBuilding(maison);
        }

        // Ajout d'un atelier
        Atelier atelier = new Atelier();
        village.addBuilding(atelier);

        // Ajout d'une caserne
        Caserne caserne = new Caserne();
        village.addBuilding(caserne);

        // Ajout d'une muraille
        Muraille muraille = new Muraille();
        village.addBuilding(muraille);

        // Ajout d'un chantier
        Chantier chantier = new Chantier();
        village.addBuilding(chantier);

        // Ajout de 2 fermes
        for (int i = 0; i < 2; i++) {
            Ferme ferme = new Ferme();
            village.addBuilding(ferme);
        }

        return village;
    }
}
