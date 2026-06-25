package com.razorpay.demo.controller;

import java.util.List;

import org.springframework.web.bind.annotation.*;

import com.razorpay.demo.entity.Campaign;
import com.razorpay.demo.repository.CampaignRepository;

@RestController
@RequestMapping("/campaigns")
public class CampaignController {

    private final CampaignRepository campaignRepository;

    public CampaignController(CampaignRepository campaignRepository) {
        this.campaignRepository = campaignRepository;
    }

//    @PostMapping
//    public Campaign createCampaign(
//            @RequestBody Campaign campaign) {
//
//        return campaignRepository.save(campaign);
//    }
    @PostMapping
    public Campaign createCampaign(@RequestBody Campaign campaign) {

        return campaignRepository.save(campaign);
    }
    
    @GetMapping
    public List<Campaign> getAllCampaigns() {

        return campaignRepository.findAll();
    }
}