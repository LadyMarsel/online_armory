import { Caliber } from "../caliber/caliber";
import { Company } from "../company/company";

export class Ammunition {
    id: number;
    name: string;
    company: Company;
    caliber: Caliber;
    description: string;
    img: string;

    constructor(
        name: string = "",
        company: Company = null,
        caliber: Caliber = null,
        description: string = "",
        img: string = "",
    ){
        this.name = name;
        this.company = company;
        this.caliber = caliber;
        this.description = description;
        this.img = img;
    }

}