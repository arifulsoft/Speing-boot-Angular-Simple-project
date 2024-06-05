export class Room {
    room_id: any;
    room_number: any;
    service_type: any;
    facility_id: any;
    img: any;
    s_disscriptions: any;
    l_disscriptions: any;
    constructor(room_id: any, room_number: any, service_type: any, facility_id: any, img: any, s_disscriptions: any, l_disscriptions: any) {
        this.room_number = room_number;
        this.service_type = service_type;
        this.facility_id = facility_id;
        this.img = img;
        this.room_id = room_id;
        this.s_disscriptions = s_disscriptions;
        this.l_disscriptions = l_disscriptions;
    }
}
