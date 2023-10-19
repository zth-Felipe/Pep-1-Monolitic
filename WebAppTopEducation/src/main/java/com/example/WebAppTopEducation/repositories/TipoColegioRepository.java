package com.example.WebAppTopEducation.repositories;


import com.example.WebAppTopEducation.entities.TipoColegioEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TipoColegioRepository extends CrudRepository<TipoColegioEntity, Long> {
}
