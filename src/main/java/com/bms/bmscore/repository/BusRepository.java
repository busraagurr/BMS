package com.bms.bmscore.repository;

import com.bms.bmscore.entity.BusEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BusRepository extends JpaRepository<BusEntity, String> {
}
