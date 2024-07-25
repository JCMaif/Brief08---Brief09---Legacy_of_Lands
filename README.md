# Legacy_of_Lands
 
## Présentation
Cette application répond aux briefs 08 et 09 de la formation.
Le brief 08 a pour objectif de créer une simulation de jeux RTS (gestion de village et construction).
Il doit être réalisé en utilisant les pratiques de POO (héritage, interface, polymorphisme, abstraction).

## Prérequis

Avant de commencer, assurez-vous d'avoir les éléments suivants installés :

- **Java 17** ou version ultérieure
- **Maven** pour la gestion des dépendances et la construction du projet

## Installation

### Cloner le Dépôt

Clonez le dépôt Git du projet :

```bash
git clone https://github.com/JCMaif/Brief08---Brief09---Legacy_of_Lands
```
Positionnez vous dans le dossier créé.

### Construisez le projet

```bash
mvn clean install
```

## Démarrage et utilisation

Le plugin exec-maven-plugin est installé, donc pour lancer l'application la commande suivant suffit ;) :
```bash
mvn exec:java
```
### Comportement par défaut

La commande précédente appelle la classe Main, qui va successivement appeler deux méthodes:
- VillageInitializer() :  
  - construit un nouveau village appelé "Tatouin"
  - construit des bâtiments (tels que Maisons, Fermes, Caserne...). Chaque bâtiment a ses caractéristiques en terme de capacités et de santé, ainsi que dans les ressources qui y sont disponibles.
  - crée des personnages, chaque type ayant ses caractéristiques propres (lieux accessibles, capacités à récolter des types de ressources différents, santé,...)
  - déplace un personnage Villageois dans un autre lieu que celui de sa création, affiche les ressources disponibles pour lui dans ce nouveau lieu.
- Affiche les résultats de création du village.

Il est possible de modifier la localisation d'un personnage (en modifiant l'argument de la méthode setLieu()). Les arguments possibles sont des ENUM, parmis lesquels chaque type de personnage a des droits différents. Une gestion des endroits interdits est réalisée.

### Diagrammes (Brief 09)

Un diagramme de classe est visible ici : [classDiagram](src/main/resources/ClassDiagramm.mmd)

Un diagramme de séquence de l'application est visible ici : [sequenceDiagram](src/main/resources/SequenceDiagramm.mmd)

Un diagramme de séquence d'un scénario proposé par le brief 09 est en cours; fictif, car ne correspond pas à l'application développée ici.
[DiagrammeBrief09](src/main/resources/DiagramBrief09.mmd).

Enoncé : 

>Un villageois part récolter des ressources. Il ramène ces ressources au village, ce qui permet de terminer la construction d'un nouveau mur de défense. Ensuite, le villageois va se reposer dans sa maison. Pendant la nuit, un groupe de soldats ennemis attaque le village. Par chance, ils ne parviennent à détruire que le nouveau mur de défense.


