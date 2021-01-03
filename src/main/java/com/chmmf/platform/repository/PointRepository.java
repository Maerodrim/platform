package com.chmmf.platform.repository;

import com.chmmf.platform.model.Point;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.persistence.Table;

@Repository
@Table(name = "Point")
public interface PointRepository extends CrudRepository<Point, Long> {
}
