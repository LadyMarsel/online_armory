export class Member {
    id: number;
    firstName: string;
    lastName: string;
    email: string;
    pswd: string;

    constructor(
        firstName: string = "",
        lastName: string = "",
        email: string = "",
        pswd: string = "",
    ){
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.pswd = pswd;
    }

}