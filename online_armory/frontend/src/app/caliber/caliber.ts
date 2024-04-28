export class Caliber {
    id: number;
    inch: string;
    metric: string;

    constructor(
        inch: string = "",
        metric: string = "",
    ){
        this.inch = inch;
        this.metric = metric;
    }
}