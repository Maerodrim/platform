package com.chmmf.platform.method;

import com.chmmf.platform.dto.InputDataDto;
import com.chmmf.platform.model.Point;
import com.chmmf.platform.repository.PointRepository;

import java.util.ArrayList;
import java.util.List;

public abstract class BaseMethod implements Method {
    protected PointRepository pointRepository;
    protected List<Point> points;
    protected double h;
    protected double r_h;
    protected double length;
    protected double radius;
    protected double lambda;
    protected double n;
    protected Integer numberOfMembers;
    protected final double ksi_0_1 = 2.405;
    protected double u = 0;

    void saveAll(List<Point> points) {
        pointRepository.saveAll(points);
    }
    void init(InputDataDto inputDataDto){
        points = new ArrayList<>();
        h = inputDataDto.getLength() / inputDataDto.getNumberPoint();
        r_h = inputDataDto.getRadius() / inputDataDto.getNumberPoint();
        length = inputDataDto.getLength();
        radius = inputDataDto.getRadius();
        lambda = inputDataDto.getLambda();
        n = inputDataDto.getNRefraction();
        numberOfMembers = inputDataDto.getNumberOfMembers();
        u = 0;
    }
}
