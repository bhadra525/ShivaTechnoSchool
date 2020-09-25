package com.rts.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rts.Entity.MarksEntity;

public interface MarkRepository extends JpaRepository<MarksEntity, Integer>{

}
