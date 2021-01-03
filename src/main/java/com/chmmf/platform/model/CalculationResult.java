package com.chmmf.platform.model;

import lombok.*;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@Getter
@Setter
@Data
@Table(name = "CalculationResult")
public class CalculationResult {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer idCalculationResult;

    @Column(name = "name", unique = true, nullable = true)
    private String name;

    @Column(name = "date", unique = false, nullable = true)
    private Date date;

    @Column(name = "numberPoint", unique = false, nullable = true)
    private Integer numberPoint;

    @Column(name = "lambda", unique = false, nullable = true)
    private double lambda;

    @Column(name = "nRefraction", unique = false, nullable = true)
    private double nRefraction;

    @Column(name = "length", unique = false, nullable = true)
    private double length;

    @Column(name = "radius", unique = false, nullable = true)
    private double radius;

    @OneToMany
    @Column(name = "analyticalSolution", unique = false, nullable = true)
    private List<Point> analyticalSolution;

    @OneToMany
    @Column(name = "implicitSchemaSolution", unique = false, nullable = true)
    private List<Point> implicitSchemaSolution;

    @OneToMany
    @Column(name = "solutionByTheCrankNicholsonScheme", unique = false, nullable = true)
    private List<Point> solutionByTheCrankNicholsonScheme;


}
