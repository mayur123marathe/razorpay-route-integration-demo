package com.razorpay.demo.controller;

import java.util.List;

import org.springframework.web.bind.annotation.*;

import com.razorpay.demo.entity.Donation;
import com.razorpay.demo.repository.DonationRepository;

@RestController
@RequestMapping("/donations")
public class DonationController {

    private final DonationRepository donationRepository;

    public DonationController(
            DonationRepository donationRepository) {

        this.donationRepository = donationRepository;
    }

//    @PostMapping
//    public Donation createDonation(
//            @RequestBody Donation donation) {
//
//        return donationRepository.save(donation);
//    }
    
    @PostMapping
    public Donation createDonation(@RequestBody Donation donation) {

        return donationRepository.save(donation);
    }
    

    @GetMapping
    public List<Donation> getAllDonations() {

        return donationRepository.findAll();
    }
}