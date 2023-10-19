package com.example.WebAppTopEducation.repositories;

import com.example.WebAppTopEducation.entities.ExamenEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExamenRepository extends CrudRepository<ExamenEntity, Long> {
}
