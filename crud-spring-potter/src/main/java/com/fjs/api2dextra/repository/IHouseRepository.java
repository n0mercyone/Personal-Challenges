package com.fjs.api2dextra.repository;

import com.fjs.api2dextra.model.House;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IHouseRepository extends JpaRepository<House, String> {

    
}
