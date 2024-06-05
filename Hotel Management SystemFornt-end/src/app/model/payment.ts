export class Payment {
    id:any;
    room_number:any;
    customar_id:any;
    total_bill:any;
    pay:any;
    due:any;
    status:any;
    payment_type:any;
    transaction_id:any;

    constructor(id:any,room_number:any,customar_id:any,total_bill:any, pay:any,due:any,status:any,payment_type:any,transaction_id:any){
        this.id=id;
        this.room_number=room_number;
        this.customar_id=customar_id;
        this.total_bill=total_bill;
        this.pay=pay;
        this.due=due;
        this.status=status;
        this.payment_type=payment_type;
        this.transaction_id=transaction_id;
    }
}