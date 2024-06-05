export class Booking {

    checkin: any;
    checkout: any;
    room_number: any;
    customar_id: any;
    adulat: any;
    child: any;
    status:any;
    constructor(checkin: any, checkout: any, room_number: any, customar_id: any, adulat: any, child: any, status:any) {

        this.checkin = checkin;
        this.checkout = checkout;
        this.room_number = room_number;
        this.customar_id = customar_id;
        this.adulat = adulat;
        this.child = child;
        this.status=status;

    }
}
