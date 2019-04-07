# M2107-PT : Jeu d’échecs

![](https://www.latoutmaitre.com/wp-content/uploads/2017/11/bandeau-6000x1830.jpg)

**IMPORTANT :** Ce projet n'est pas qu'un projet de programmation : c'est un projet de programmation, de conception en UML et de gestion de projets. Les trois aspects seront évalués et seul un projet satisfaisant aux critères de qualité des trois disciplines pourra prétendre à une évaluation favorable.

## Roundtrip engineering

Pour avoir des modèles et du code toujours en cohérence, nous employons des outils de développements adaptés et ce pour plus de commodité. Nous utilisons :

-   Modelio pour la modélisation en UML
- Git pour le versionning et le partage du code
-   ~~Eclipse pour la programmation en Java~~

# LE PROJET
Le projet consiste à produire un logiciel de jeu d'échecs. Les règles du jeu sont disponibles sur [Wikipedia](https://fr.wikipedia.org/wiki/R%C3%A8gles_du_jeu_d'%C3%A9checs "https://fr.wikipedia.org/wiki/R%C3%A8gles_du_jeu_d'%C3%A9checs"). La Fédération Française d'Échecs propose une [synthèse en PDF](http://www.echecs.asso.fr/Reglements/PresentationRegles.pdf "http://www.echecs.asso.fr/Reglements/PresentationRegles.pdf") qui résume les grandes lignes du jeu.

## Production minimale[](https://www-info.iutv.univ-paris13.fr/dokuwiki/doku.php?id=m2107:start-echecs#production-minimale)

#### Interface utilisateur[](https://www-info.iutv.univ-paris13.fr/dokuwiki/doku.php?id=m2107:start-echecs#interface-utilisateur)

L'interface sera très simple, en mode texte. Il existe des caractères [Unicode](https://fr.wikipedia.org/wiki/Symboles_d%27%C3%A9checs_en_Unicode "https://fr.wikipedia.org/wiki/Symboles_d%27%C3%A9checs_en_Unicode") pour les pièces d'échecs . Vous pouvez également employer des lettres éventuellement colorées. La grille d'échecs sera dessinée en mode texte après chaque coup, avec une indication des indices de colonnes (lettres A-H) et de rangées (nombres 1-8). L'historique des coups devra également être indiqué en dessous de la grille. Vous pourrez par exemple employer la [notation internationale](https://fr.wikipedia.org/wiki/Notation_internationale "https://fr.wikipedia.org/wiki/Notation_internationale"). L'interrogation de l'utilisateur se fera également en mode texte, au clavier.

## Fonctionnalités requises[](https://www-info.iutv.univ-paris13.fr/dokuwiki/doku.php?id=m2107:start-echecs#fonctionnalites-requises)

-   Jouer un coup avec vérification automatique de sa validité

-   Alternance des joueurs blancs et noirs
    
-   Vérification automatique PAT/MAT
    
-   Sauvegarde et restauration d'une partie
    

## Fonctionnalités optionnelles[](https://www-info.iutv.univ-paris13.fr/dokuwiki/doku.php?id=m2107:start-echecs#developpements-optionnels)

**_Les developpements optionnels ne doivent être effectués seulement lorsque les développements requis sont opérationnels._**

Les points suivants ne sont que des exemples. On peut avoir d'autres idées.

-   Jeu sur plusieurs ordinateurs (un par joueur) avec prise en charge réseau ou, plus simplement, de fichiers d'échange éventuellement synchronisés par un service quelconque
    
-   Interface graphique
    
-   Possibilité de retour automatique en arrière (undo/redo) pour explorer des possibilités dans un but pédagogique. Il serait intéressant de pouvoir revenir en arrière également sur une partie restaurée à partir d'une sauvegarde
    
-   **Difficile** : joueur automatique (soit par parcours d'arbre brutal, soit par une fonction d'évaluation de positions)

# Documents

- [Cliquer ici pour accéder au tableau d'avancement](https://docs.google.com/spreadsheets/d/1D1yxiP5UPTljg5wq9t52uJw_tpuwUMoVy2T8b9GGKnY/edit?usp=sharing)

- [Cliquer ici pour accéder à la documentation du projet](https://docs.google.com/document/d/1BRTDQyLqhfcoPSnIb89-K3VTj4ZN3NCbzjfEzyMGcQ4/edit?usp=sharing)

  




