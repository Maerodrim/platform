package com.chmmf.platform.repository;

import com.chmmf.platform.model.CalculationResult;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.persistence.Table;

@Repository
@Table(name = "CalculationResult")
public interface CalculationResultRepository extends CrudRepository<CalculationResult, Long> {
}
