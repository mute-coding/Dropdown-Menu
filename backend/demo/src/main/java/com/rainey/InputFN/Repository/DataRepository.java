package com.rainey.InputFN.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rainey.InputFN.Model.InputData;

public interface DataRepository extends JpaRepository<InputData,Integer> {

}
