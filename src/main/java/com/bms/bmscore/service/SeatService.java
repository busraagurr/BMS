package com.bms.bmscore.service;

import com.bms.bmscore.entity.SeatEntity;
import com.bms.bmscore.repository.SeatRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class SeatService {

    @Autowired
    private SeatRepository seatRepository;

    public SeatEntity create(SeatEntity seatEntity){
        return seatRepository.save(seatEntity);
    }

    public SeatEntity update(SeatEntity seatEntity){
        return seatRepository.save(seatEntity);
    }

    public void delete(SeatEntity seatEntity){
        seatRepository.delete(seatEntity);
    }

    public Optional<SeatEntity> findById(String id){ //findById should return optional
      return seatRepository.findById(id);
    }
}
