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

    @Column(name = "u", unique = false, nullable = true)
    private double u;

    public Point(double x, double y, double u) {
        this.x = x;
        this.y = y;
        this.u = u;
    }

    public Point() {
    }

    public BigInteger getIdPoint() {
        return idPoint;
    }

    public void setIdPoint(BigInteger idPoint) {
        this.idPoint = idPoint;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getU() {
        return u;
    }

    public void setU(double u) {
        this.u = u;
    }
}
