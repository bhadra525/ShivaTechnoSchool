package com.rts.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rts.Entity.StudentMarksEntity;

public interface StudentMarksRepository extends JpaRepository<StudentMarksEntity, Integer> {

}
