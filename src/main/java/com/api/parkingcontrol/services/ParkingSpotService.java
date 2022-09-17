package com.api.parkingcontrol.services;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.api.parkingcontrol.models.ParkingSpotModel;
import com.api.parkingcontrol.repositories.ParkingSpotRepository;

@Service
public class ParkingSpotService {
    
    // Autowired pode ser substituído por um contrutor da classe
    @Autowired
    ParkingSpotRepository parkingSpotRepository;

    // Transacional garante o rollback caso algo dê errado na hora da construção
    @Transactional
    public ParkingSpotModel create(ParkingSpotModel parkingSpotModel){
        return parkingSpotRepository.save(parkingSpotModel);
    }
    
    public List<ParkingSpotModel> findAll(){
        return parkingSpotRepository.findAll();
    }

    

}
