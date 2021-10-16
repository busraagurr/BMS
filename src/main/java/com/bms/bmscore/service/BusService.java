package com.bms.bmscore.service;

import com.bms.bmscore.entity.BusEntity;
import com.bms.bmscore.repository.BusRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class BusService {

    @Autowired
    private BusRepository busRepository;

    public BusEntity create(BusEntity busEntity){
        return busRepository.save(busEntity);
    }

    public BusEntity update(BusEntity busEntity){
        return busRepository.save(busEntity);
    }

    public void delete(BusEntity busEntity){
        busRepository.delete(busEntity);
    }

    public Optional<BusEntity> findById(String id){ //findById should return optional
      return busRepository.findById(id);
    }
}
