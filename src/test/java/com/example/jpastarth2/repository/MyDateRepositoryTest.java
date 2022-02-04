package com.example.jpastarth2.repository;

import com.example.jpastarth2.model.MyDate;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDate;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class MyDateRepositoryTest {

  @Autowired
  MyDateRepository myDateRepository;
//alt f1
  @BeforeEach
  void setUp() {
    MyDate md1 = new MyDate();
    md1.setBorn(LocalDate.now());
    myDateRepository.save(md1);
  }

  @Test
  void name() {
    var obj =myDateRepository.findAll();
    List<MyDate> lst =  myDateRepository.findAll();
    assertEquals(1,lst.size());
  }
}