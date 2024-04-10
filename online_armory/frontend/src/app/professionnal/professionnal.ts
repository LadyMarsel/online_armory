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

}