export class User {
    id: number;
    firstName: string;
    lastName: string;
    username: string;
    role: string;
    email: string;
    password: string;

    constructor(
        firstName: string = "",
        lastName: string = "",
        username: string = "",
        role: string = "",
        email: string = "",
        password: string = "",
    ){
        this.firstName = firstName;
        this.lastName = lastName;
        this.username = username;
        this.role = role;
        this.email = email;
        this.password = password;
    }

}