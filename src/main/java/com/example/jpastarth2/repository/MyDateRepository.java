package com.example.jpastarth2.repository;

import com.example.jpastarth2.model.MyDate;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MyDateRepository extends JpaRepository<MyDate, Integer> {

}
