package com.api.parkingcontrol.repository;

import com.api.parkingcontrol.models.ParkingSpotModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface ParkingSpotRepository extends JpaRepository<ParkingSpotModel, UUID> {

    boolean existsByLicensePlatecar(String licensePlatecar);
    boolean existsByParkingSpotNumber(String parkingSpotNumber);

    boolean existsByApartamentAndBlock(String apartament, String block);


}
