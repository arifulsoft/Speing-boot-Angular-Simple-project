export class ShowData {

    checkin: any;
    checkout: any;
    name: any;
    phone: any;
    total_bill: any;
    pay: any;
    due: any;

    constructor(checkin: any, checkout: any, name: any, phone: any, total_bill: any, pay: any, due: any) {
        this.checkin = checkin;
        this.checkout = checkout;
        this.name = name;
        this.phone = phone;
        this.total_bill = total_bill;
        this.pay = pay;
        this.due = due;
    }
}
