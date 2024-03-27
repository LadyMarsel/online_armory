import { Company } from "../company/company";

export class Gun {
    id: number;
    company: Company;
    gunType: string;
    firingMode: string;
    caliber: number;
    name: string;
    country: string;
    year: number;
    description: string;
    img: string;
    isForbidden: boolean;
    isFree: boolean;
    barelSize: number;
    totalSize: number;

    constructor(
        company: Company = null,
        gunType: string = "",
        firingMode: string = "",
        caliber: number = 0,
        name: string = "",
        country: string = "",
        year: number = 0,
        description: string = "",
        img: string = "",
        isForbidden: boolean = false,
        isFree: boolean = false,
        barelSize: number = 0,
        totalSize: number = 0,
    ){
        this.company = company;
        this.gunType = gunType;
        this.firingMode = firingMode;
        this.caliber = caliber;
        this.name = name;
        this.country = country;
        this.year = year;
        this.description = description;
        this.img = img;
        this.isForbidden = isForbidden;
        this.isFree = isFree;
        this.barelSize = barelSize;
        this.totalSize = totalSize;
    }
}