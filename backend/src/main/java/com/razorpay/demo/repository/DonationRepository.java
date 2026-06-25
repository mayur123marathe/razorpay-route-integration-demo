package com.razorpay.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.razorpay.demo.entity.Donation;

public interface DonationRepository
        extends JpaRepository<Donation, Long> {

}