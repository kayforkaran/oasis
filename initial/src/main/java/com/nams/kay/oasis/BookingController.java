package com.nams.kay.oasis;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import com.nams.kay.oasis.Booking;
import com.nams.kay.oasis.BookingRepository;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

@Controller
@RequestMapping(path = "/booking")
public class BookingController {

    @Autowired
    BookingRepository bookingRepository;

    @Autowired
    PaymentRepository paymentRepository;

    @PostMapping("/new")
    public @ResponseBody String bookNewRoom(@RequestParam Integer numberOfRooms){
        Booking booking = new Booking();
        LocalDate checkinDate, checkoutDate, bookingDate;

        /*
        TODO: 1. ASK FOR BOOKING_TYPE; 2. TAKE USER_ID FROM AUTH; 3. IMPLEMENT AVAILABILITY_CHECK; 4. ALLOT ROOMS.
         */

        checkinDate = LocalDate.of(2020, 1, 23);
        checkoutDate = LocalDate.of(2020, 1, 27);
        bookingDate = LocalDate.now();
        long numberOfDays = ChronoUnit.DAYS.between(checkinDate, checkoutDate);

        //payment procedure
        float totalAmount = numberOfDays*Booking.roomCost;
//        PaymentController paymentController = new PaymentController();
//        paymentController.createPayment(totalAmount, totalAmount, "12345", 1);
//        Integer paymentId = paymentController.makeNewPayment(BookingType.CONVENTIONAL, totalAmount, totalAmount, 12, "11209876543");
//        System.out.println("------------------------------------------");
//        System.out.println("total amount = " + Float.toString(totalAmount));
//        System.out.println("total amount = " + Float.toString(totalAmount/2));
//        System.out.println("------------------------------------------");



        Payment payment = new Payment();
        payment.setBookingType(BookingType.INCENTIVE);
        payment.setCustomerId(1);
        payment.setCreditCardNumber("1234862");
        payment.setPaidAmount(totalAmount);
        payment.setTotalAmount(totalAmount);
        paymentRepository.save(payment);




        booking.setBookingType(BookingType.CONVENTIONAL);
        booking.setCheckinDate(checkinDate);
        booking.setCheckoutDate(checkoutDate);
        booking.setDateOfBooking(bookingDate);
        booking.setNumberOfRooms(numberOfRooms);
        booking.setPaymentId(1);
        booking.setCustomerId(1);

        bookingRepository.save(booking);

        return "OK";
    }

    @GetMapping("/all")
    public @ResponseBody Iterable<Booking> getAllBookings(){
        return bookingRepository.findAll();
    }
}
