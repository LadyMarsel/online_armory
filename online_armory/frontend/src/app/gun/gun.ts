import { Caliber } from "../caliber/caliber";
import { Company } from "../company/company";
import { GunType } from "../gyn-type/gun-type";
import { InternalMechanic } from "../internal-mechanic/internal-mechanic";
import { RearmingMode } from "../rearming-mode/rearming-mode";

export class Gun {
    id: number;
    company: Company;
    gunType: GunType;
    caliber: Caliber;
    rearmingMode: RearmingMode;
    internalMechanic: InternalMechanic;
    name: string;
    year: number;
    description: string;
    img: string;
    forbidden: boolean;
    free: boolean;
    barelSize: number;
    totalSize: number;

    constructor(
        company: Company = null,
        gunType: GunType = null,
        caliber: Caliber = null,
        rearmingMode: RearmingMode = null,
        internalMechanic: InternalMechanic = null,
        name: string = "",
        year: number = 0,
        description: string = "",
        img: string = "",
        forbidden: boolean = false,
        free: boolean = false,
        barelSize: number = 0,
        totalSize: number = 0,
    ){
        this.company = company;
        this.gunType = gunType;
        this.caliber = caliber;
        this.rearmingMode = rearmingMode;
        this.internalMechanic = internalMechanic;
        this.name = name;
        this.year = year;
        this.description = description;
        this.img = img;
        this.forbidden = forbidden;
        this.free = free;
        this.barelSize = barelSize;
        this.totalSize = totalSize;
    }
}