package com.razorpay.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.razorpay.demo.entity.Campaign;

public interface CampaignRepository
        extends JpaRepository<Campaign, Long> {
}