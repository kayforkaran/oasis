package com.nams.kay.oasis;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.nams.kay.oasis.Booking;
import com.nams.kay.oasis.BookingRepository;

@Controller
@RequestMapping(path = "/booking")
public class BookingController {
}
