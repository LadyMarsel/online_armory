import { Caliber } from "../caliber/caliber";
import { Company } from "../company/company";

export class Ammunition {
    id: number;
    name: string;
    company: Company;
    caliber: Caliber;
    description: string;
    img: string;

}