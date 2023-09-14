 package com.demo4.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo4.entity.Student;



public interface StudentRepository extends JpaRepository<Student, Long>{

}
