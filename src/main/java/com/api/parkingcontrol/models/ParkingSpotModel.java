package com.api.parkingcontrol.models;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "tb_parking_spot")
public class ParkingSpotModel implements Serializable{
    
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    @Column(nullable = false, unique = true, length = 10)
    private String parkingSpotNumber;

    @Column(nullable = false, unique = true, length = 7)
    private String licensePlate;

    @Column(nullable = false, length = 30)
    private String carModel;

    @Column(nullable = false, length = 30)
    private String apartment;
    
    @Column(nullable = false, length = 30)
    private String block;

    @Column(nullable = false, length = 100)
    private String responsibleName;

    @Column(nullable = false)
    private LocalDateTime registrationDate;

}
