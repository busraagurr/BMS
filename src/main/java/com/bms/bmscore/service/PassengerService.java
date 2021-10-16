package com.bms.bmscore.service;

import com.bms.bmscore.entity.PassengerEntity;
import com.bms.bmscore.repository.PassengerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class PassengerService {

    @Autowired
    private PassengerRepository passengerRepository;

    public PassengerEntity create(PassengerEntity passengerEntity){
        return passengerRepository.save(passengerEntity);
    }

    public PassengerEntity update(PassengerEntity passengerEntity){
        return passengerRepository.save(passengerEntity);
    }

    public void delete(PassengerEntity passengerEntity){
        passengerRepository.delete(passengerEntity);
    }

    public Optional<PassengerEntity> findById(String id){ //findById should return optional
      return passengerRepository.findById(id);
    }
}
