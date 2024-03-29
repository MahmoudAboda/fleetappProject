package com.kindsonthegenius.fleetapp.repositories;

import com.kindsonthegenius.fleetapp.models.VehicleHire;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface VehicleHireRepository extends JpaRepository<VehicleHire, Integer> {

}
