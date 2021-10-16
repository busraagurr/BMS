package com.bms.bmscore.repository;

import com.bms.bmscore.entity.PassengerEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PassengerRepository extends JpaRepository<PassengerEntity, String> {
}
