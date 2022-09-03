package com.api.parkingcontrol.dtos;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import lombok.Data;

@Data
public class ParkingSpotDto {
    
    @NotBlank
    private String parkingSpotNumber;

    @NotBlank
    @Size(max = 7)
    private String licensePlate;

    @NotBlank
    private String carModel;

    @NotBlank
    private String apartment;
    
    @NotBlank
    private String block;

    @NotBlank
    private String responsibleName;

}
