import { ProfessionnalType } from "../professionnal-type/professionnal-type";

export class Professionnal {
    id: number;
    name: string;
    country: string;
    year: string;
    description: string;
    adress: string;
    email: string;
    phone: number;
    webSite: string;
    professionnalType: ProfessionnalType;
    img: string;

    constructor(
        name: string = "",
        country: string = "",
        year: string = "",
        description: string = "",
        adress: string = "",
        email: string = "",
        phone: number = 0,
        webSite: string = "",
        professionnalType : ProfessionnalType = null,
        img: string = "",
    ){
        this.name = name;
        this.country = country;
        this.year = year;
        this.description = description;
        this.adress = adress;
        this.email = email;
        this.phone = phone;
        this.webSite = webSite;
        this.professionnalType = professionnalType;
        this.img = img;
    }

}