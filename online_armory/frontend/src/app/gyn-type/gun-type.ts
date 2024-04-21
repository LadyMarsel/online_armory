export class GunType {
    id: number;
    name: string;
    barelType: string;
    gunFamily: string;
    belgianCategory: string;
}

/* -----Gun Type-----
* Il existe 4 grands types d'armes : Pistolet, Revolver, Fusil, Carabine.
* Ces types découlent de 2 familles : "Arme de poing" et "Canon long".
* Ces types ont des particularités techniques au niveau de leur canon : ilk peut être rayé ou lisse
* Enfin, ces 4 types sont catégorisé, en Belgique, à l'aide de lettres : A, B, C, D et E pour la poudre noire
* 
* ---------- Les 4 objets de la classes devraient être : 
* 
* "Revolver", "Canon rayé", "Arme de Poing", "A"
* "Pistolet", "Canon rayé", "Arme de Poing", "B"
* "Fusil", "Canon lisse", "Canon Long", "C"
* "Carabine", "Canon rayé", "Canon Long", "D"
* 
* Probème : Tous peuvent être de catégorie E aussi...
*/