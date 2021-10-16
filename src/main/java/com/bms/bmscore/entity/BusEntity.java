package com.bms.bmscore.entity;

import lombok.Data;
import org.hibernate.annotations.GenericGenerator;
import org.springframework.lang.Nullable;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@Table(name = "bus", schema = "bms_core")
public class BusEntity {

    @Id
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    @Column(nullable = false)
    private String id;

    @OneToMany(mappedBy = "bus")
    private List<SeatEntity> listOfSeats= new ArrayList<>();
}
