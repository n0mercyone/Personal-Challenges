package com.fjs.api2dextra.repository;

import com.fjs.api2dextra.model.Teacher;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ITeacherRepository extends JpaRepository<Teacher, Long>{
    
}
