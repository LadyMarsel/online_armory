import { LicenseType } from "../license-type/license-type";
import { Member } from "../member/member";

export class License {
    id: number;
    member: Member;
    dateOfValidity: Date;
    licenseType: LicenseType;

}