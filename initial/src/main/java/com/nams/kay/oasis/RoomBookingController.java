package com.nams.kay.oasis;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.nams.kay.oasis.RoomBooking;
import com.nams.kay.oasis.RoomBookingRepository;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

@Controller
@RequestMapping(path = "/roombooking")
public class RoomBookingController {
    @Autowired
    private RoomBookingRepository roomBookingRepository;

    @GetMapping("/new")
    public @ResponseBody String bookNewRoom(@RequestParam Integer roomNumber){
        Booking booking = new Booking();
        booking.setBookingType(BookingType.CONVENTIONAL);
        Date checkinDate, checkoutDate, bookingDate;
//        booking.setCheckinDate();
        return "OK";
    }
}
