package com.chmmf.platform.model;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Data
@Table(name = "CalculationResult")
public class CalculationResult {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer idCalculationResult;

    @Column(name = "name", unique = false, nullable = true)
    private String name;

    @Column(name = "date", unique = false, nullable = true)
    private Date date;

    @Column(name = "lambda", unique = false, nullable = true)
    private double lambda;

    @Column(name = "nRefraction", unique = false, nullable = true)
    private double nRefraction;

    @Column(name = "length", unique = false, nullable = true)
    private double length;

    @Column(name = "radius", unique = false, nullable = true)
    private double radius;

    @Column(name = "points", unique = false, nullable = true)
    private List<Point> points;


}
