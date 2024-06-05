export class Foodtransaction {
    s_number:any;
    c_id: any;
    f_type: any;
    f_menu: any;
    amount: any;
    date: any;

    constructor(s_number:any, c_id: any, f_type: any, f_menu: any, amount: any, date: any) {
        this.s_number=s_number;
        this.c_id = c_id;
        this.f_type = f_type;
        this.f_menu = f_menu;
        this.amount = amount;
        this.date = date;
    }
}