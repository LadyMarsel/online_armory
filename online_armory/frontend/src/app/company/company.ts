import { Country } from "../country";

export class Company {
    id: number;
    name: string;
    year: number;
    country: Country;
    description: string;
    logo: string;

    constructor(
        name: string = "",
        year: number = 0,
        country: Country = null,
        description: string = "",
        logo: string = "",
    ){
        this.name = name;
        this.year = year;
        this.country = country;
        this.description = description;
        this.logo = logo;
    }

}