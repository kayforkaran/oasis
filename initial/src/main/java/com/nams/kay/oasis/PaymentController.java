package com.nams.kay.oasis;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.nams.kay.oasis.Payment;
import com.nams.kay.oasis.PaymentRepository;

@Controller
@RequestMapping(path = "/user")
public class PaymentController {
}
