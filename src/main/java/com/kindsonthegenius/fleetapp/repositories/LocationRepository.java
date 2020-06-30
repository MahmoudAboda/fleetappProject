package com.kindsonthegenius.fleetapp.repositories;

import com.kindsonthegenius.fleetapp.models.Location;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface LocationRepository extends CrudRepository<Location, Integer> {

}
