import { LicenseType } from "../license-type/license-type";
import { User } from "../user/user";


export class License {
    id: number;
    user: User;
    dateOfValidity: Date;
    licenseType: LicenseType;

    constructor(
        user: User = null,
        dateOfValidity: Date = null,
        licenseType: LicenseType = null,
    ){
        this.user = user;
        this.dateOfValidity = dateOfValidity;
        this.licenseType = licenseType;
    }
}

/*-----License-----
 * C'est un document.
 * Il lie un membre à une arme ou à une catégorie d'armes,
 * En fonction du calibre (Lien avec LicenseType),
 * Et de catégories (Lien avec GunType).
 * Il possède une date de validité.
 * 
 * Un Membre peut posséder plusieurs licenses, mais une license n'a qu'un seul propriétaire
 * 
 * Par exemlpe : 
 * J'ai un modèle 4, 
 * j'ai donc accès à une liste d'arme prédéfinie 
 * 
 * J'ai également un modèle 9 sport, avec uniquement la catégorie A dessus, 
 * j'ai accès à une autre liste d'arme, de catégorie A uniquement et calibre 22'
 */