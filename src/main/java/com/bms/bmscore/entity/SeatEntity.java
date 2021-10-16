package com.bms.bmscore.entity;

import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Data
@Entity
@Table(name = "seat", schema = "bms_core")
public class SeatEntity {

    @Id
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    private String id;
    private String number;

    @OneToOne
    @JoinColumn(name = "passenger_fk")
    private PassengerEntity passenger;

    @ManyToOne
    @JoinColumn(name = "bus_fk")
    private BusEntity bus;
}
