package com.example.demo;

import java.util.ArrayList;
import java.sql.Date;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "http://localhost:4200/")
public class Controller extends TempData {
	private final RoomRepo roomRepo;
	private final CustomarRepo customarRepo;
	private final PaymentRepo paymentRepo;
	private final BookingRepo bookingRepo;
	private final UserRepo userRepo;
	private final RoomreantRepo roomreantRepo;

	public Controller(RoomRepo roomRepo, CustomarRepo customarRepo, PaymentRepo paymentRepo, BookingRepo bookingRepo,
			UserRepo userRepo, RoomreantRepo roomreantRepo) {
		this.roomRepo = roomRepo;
		this.customarRepo = customarRepo;
		this.paymentRepo = paymentRepo;
		this.bookingRepo = bookingRepo;
		this.userRepo = userRepo;
		this.roomreantRepo = roomreantRepo;
	}

//	room data show----------------------------------------------
	List<Room> slist = new ArrayList<>();

	@GetMapping("/allroom")
	public List<Room> show() {
		slist = (List<Room>) roomRepo.findAll();
		return slist;
	}

//	customar data show----------------------------------------------
	List<Customar> alllist = new ArrayList<>();

	@GetMapping("/bookingshow")
	public List<Customar> customar() {
		alllist = (List<Customar>) customarRepo.findAll();
		return alllist;
	}
	
	
	
//	Booking-checkin-out data show----------------------------------------------
	List<Booking> alist = new ArrayList<>();

	@GetMapping("/checkinout")
	public List<Booking> booking1() {
		alist = (List<Booking>) bookingRepo.findAll();
		return alist;
	}
	
	
	
//	payment- data show----------------------------------------------
	List<Payment> alist2 = new ArrayList<>();

	@GetMapping("/paymentshow")
	public List<Payment> paymentshow() {
		alist2 = (List<Payment>) paymentRepo.findAll();
		return alist2;
	}
	
	
	
	
	
	

//	customar data show----------------------------------------------
	List<Booking> allist = new ArrayList<>();

	@GetMapping("/bookingTableShow")
	public List<Booking> booking() {
		allist = (List<Booking>) bookingRepo.findAll();
		return allist;
	}

//		roome-show------------------------------
	@GetMapping("/{id}")
	public Room rrr(@PathVariable int id) {
		RoomDA da = new RoomDA();
		Room data = da.roomById(id);

		return data;
	}

//customar form
	@PostMapping("/booking")
	public Customar dosave(@RequestBody Customar s) {
		CustomarDA da = new CustomarDA();
		Customar st = da.book(s);

		return st;
	}

	// ------------------check room available-----------------------
	List<Room> availableRoom = new ArrayList<>();

	@GetMapping("/checking/{checkin}/{checkout}")
	public List<Room> check(@PathVariable Date checkin, @PathVariable Date checkout) {

		RoomDA da = new RoomDA();
		availableRoom = da.findAvailableRooms(checkin, checkout);
		return availableRoom;
	}

	// Payment--------------------------------------------------
	@PostMapping("/payment")
	public Payment pay(@RequestBody Payment p) {
//					CustomarDA da = new CustomarDA();
		Payment st = new Payment();
		st = paymentRepo.save(p);

		return st;
	}

	// Booking----------------------------------------
	@PostMapping("/bookingtable")
	public Booking newBooking(@RequestBody Booking q) {
		Booking ct = new Booking();
		ct = bookingRepo.save(q);

		return ct;
	}

	// User Table----------------------------------------
//				@PostMapping("/singUp" )
//				public User createUser(@RequestBody User r) {
//					User dt=new User();
//					dt=userRepo.save(r);
//
//					return dt;
//				}	

	// Customar Table----------------------------------------
	@PostMapping("/customar")
	public Customar newCustomar(@RequestBody Customar m) {
		Customar et = new Customar();
		et = customarRepo.save(m);

		return et;
	}

	// Customar Table----------------------------------------

	@PostMapping("/addorder")
	public Foodtransaction addorder(@RequestBody Foodtransaction s) {
		CustomarDA da = new CustomarDA();
		Foodtransaction data = da.addorder(s);

		return data;
	}

	List<Roomreant> pp = new ArrayList<>();

	@GetMapping("/reant")
	public List<Roomreant> reant() {
		RoomreantDA da = new RoomreantDA();
		pp = da.reant();

		return pp;
	}

//------------------reant-data-show   ----------------------------------
	@GetMapping("/roomRentById/{id}")
	public Roomreant rr3(@PathVariable int id) {
		RoomreantDA da = new RoomreantDA();
		System.out.println(id);
		Roomreant rentById = da.rentById(id);
		return rentById;
	}
	
			//	Feedback-data-show   --------------------------------------
	
		List<FeedBack> sList= new ArrayList<>();	
		@GetMapping("/ac/feedbackshow")
		public List<FeedBack> feedBack(){
			FeedBackDA da=new FeedBackDA();
			sList=da.feedBack();		
			return sList;
		}
	
	

//------------	payment update -------------
	
	@GetMapping("/addamount/{c_id}/{amount}")
	public Payment addamount(@PathVariable int c_id, @PathVariable double amount) {
		PaymentDA da = new PaymentDA();
		Payment data = da.addamount(c_id, amount);
		return data;
	}
	
//	//------------	get 3 tables data  -------------
	 List<ShowData> allDatatable=new ArrayList<>();
	 
		@GetMapping("/getalltabledata/{c_id}")
		public List<ShowData> gettabledata(@PathVariable int c_id) {
			PaymentDA da = new PaymentDA();
			allDatatable=da.gettabledata(c_id);	
			return allDatatable;
		}

//-------------------------booking-single-data-show-----------------------------------

	@GetMapping("/bookingsingleId/{id}")
	public Customar rr5(@PathVariable int id) {
		CustomarDA da = new CustomarDA();

		Customar rentById = da.booksingle(id);
		return rentById;
	}

	// Admin-costomar-login---------------------------------------
//				

	@GetMapping("/{username}/{password}")
	public User rr6(@PathVariable String username, @PathVariable String password) {
		UserDA da = new UserDA();

		User rentById = da.adminLogin(username, password);
		return rentById;
	}

	// Admin-costomar-register---------------------------------------

	@PostMapping("/singUp/new")
	public User usernew(@RequestBody User s) {
		UserDA da = new UserDA();
		User st = da.newUser(s);
		System.out.println("abc");
		return st;
	}

	@GetMapping("/days/{checkin}/{checkout}")
	public void dateCalculation(@PathVariable Date checkin, @PathVariable Date checkout) {
		checkIn = checkin;
		checkOut = checkout;
		dayCalculation();
	}

	@GetMapping("/totaldays")
	public long days() {
		System.out.println("Total days = " + totaldays);
		return totaldays;
	}

//				customer-passport-nid-query-----------------------------
	@GetMapping("/passNid/{passport}/{nid}")
	public Customar rt(@PathVariable String passport, @PathVariable String nid) {
		System.out.println("customer-passport-nid-query");
		CustomarDA da = new CustomarDA();
		Customar data = da.passNid(passport, nid);
		System.out.println(data.getCustomar_id());
		return data;
	}
	
	
//	feedBack------------------------------------------
	@PostMapping("/feedback")
	public FeedBack feedback(@RequestBody FeedBack s) {
		FeedBackDA da = new FeedBackDA();
		FeedBack st = da.feedback(s);
		return st;
	}
	
	
	
	
//	booking table secarch by c_id-------------------------------------------------------------------
	@GetMapping("/gettabledata/{c_id}")
	public Booking tot(@PathVariable int c_id) {
		BookingDA da= new BookingDA();
		Booking dat = da.searchdata(c_id);
		
		return dat;
	}
	
	
	
//	Food order table secarch by c_id-------------------------------------------------------------------
	@GetMapping("/orderManu/{c_id}")
	public Foodtransaction order(@PathVariable int c_id) {
		BookingDA da= new BookingDA();
		Foodtransaction dat = da.ordersearchdata(c_id);
		
		return dat;
}
}