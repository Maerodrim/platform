package com.chmmf.platform.model;

import lombok.Data;
import javax.persistence.*;
import java.math.BigInteger;

@Data
@Table(name = "Point")
public class Point {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private BigInteger idPoint;

    @Column(name = "x", unique = false, nullable = true)
    private double x;

    @Column(name = "y", unique = false, nullable = true)
    private double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public Point() {
    }

    public BigInteger getIdPoint() {
        return idPoint;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }
}
