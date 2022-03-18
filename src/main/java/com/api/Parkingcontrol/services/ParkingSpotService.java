package com.api.Parkingcontrol.services;

import com.api.Parkingcontrol.repositories.ParkingSpotRepository;
import org.springframework.stereotype.Service;

@Service
public class ParkingSpotService {

   final ParkingSpotRepository parkingSpotRepository;

    public ParkingSpotService(ParkingSpotRepository parkingSpotRepository) {
        this.parkingSpotRepository = parkingSpotRepository;
    }
}