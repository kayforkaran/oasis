package com.nams.kay.oasis;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.nams.kay.oasis.RoomBooking;
import com.nams.kay.oasis.RoomBookingRepository;

import javax.persistence.TemporalType;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;
import java.util.Date;

@Controller
@RequestMapping(path = "/roombooking")
public class RoomBookingController {
    @Autowired
    private RoomBookingRepository roomBookingRepository;



    @GetMapping("/all")
    public @ResponseBody Iterable<RoomBooking> getAllRoomBookings(){
        return roomBookingRepository.findAll();
    }
}
