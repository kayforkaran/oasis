package com.nams.kay.oasis;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping(path = "/payment")
public class PaymentController {
    @Autowired
    PaymentRepository paymentRepository;

    @PostMapping("/new")
    public @ResponseBody String createPayment(@RequestParam float totalAmount, @RequestParam float paidAmount, @RequestParam String creditCardNumber, @RequestParam Integer userId){
        Payment payment = new Payment();
        payment.setBookingType(BookingType.INCENTIVE);
        payment.setCustomerId(1);
        payment.setCreditCardNumber(creditCardNumber);
        payment.setPaidAmount(paidAmount);
        payment.setTotalAmount(totalAmount);
        paymentRepository.save(payment);
        return "OK";
    }

    public Integer makeNewPayment(BookingType bookingType, float totalAmount, float paidAmount, Integer customerId, String creditCardNumber){
        Payment payment = new Payment();
        payment.setId(123);
        payment.setBookingType(BookingType.CONVENTIONAL);
        payment.setTotalAmount(totalAmount);
        payment.setPaidAmount(paidAmount);
        payment.setCustomerId(1);
        payment.setCreditCardNumber(creditCardNumber);

        System.out.println("------------------------------------------");
        System.out.println("total amount = " + Float.toString(totalAmount));
        System.out.println("paid amount = " + Float.toString(paidAmount));
        System.out.println("customerID = " + Integer.toString(customerId));
        System.out.println("credit card number = " + creditCardNumber);
        System.out.println("Booking Type = " + String.valueOf(bookingType));
        System.out.println("------------------------------------------");

        paymentRepository.save(payment);

        return payment.getId();
    }

    @GetMapping("/all")
    public @ResponseBody Iterable<Payment> getAllPayments(){
        return paymentRepository.findAll();
    }
}
