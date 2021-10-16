package com.bms.bmscore.entity;

import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Data
@Table(name = "passenger", schema = "bms_core")
public class PassengerEntity {

    @Id
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    private String id;
    private String name;
}
