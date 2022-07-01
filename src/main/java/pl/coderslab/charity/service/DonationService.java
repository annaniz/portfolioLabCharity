package pl.coderslab.charity.service;

import org.springframework.stereotype.Service;
import pl.coderslab.charity.model.Donation;
import pl.coderslab.charity.repository.DonationRepository;

import java.util.List;

@Service
public class DonationService {

    private final DonationRepository donationRepository;

    public DonationService(DonationRepository donationRepository) {
        this.donationRepository = donationRepository;
    }

    public Integer sumQuantity(){
        return donationRepository.sumQuantity();
    }

    public Long sumDonation(){
         return donationRepository.count();
    }

    public void save(Donation donation) {
        donationRepository.save(donation);
    }
}
