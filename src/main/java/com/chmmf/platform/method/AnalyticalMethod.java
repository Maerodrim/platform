package com.chmmf.platform.method;

import com.chmmf.platform.dto.InputDataDto;
import com.chmmf.platform.model.Point;
import org.apache.commons.math3.special.BesselJ;

import java.util.ArrayList;
import java.util.List;

public class AnalyticalMethod extends BaseMethod implements Method {

    @Override
    public List<Point> makeCalculation(InputDataDto inputDataDto) {
        List<Point> points = new ArrayList<>();
        double h = inputDataDto.getLength() / inputDataDto.getNumberPoint();
        double r_h = inputDataDto.getRadius() / inputDataDto.getNumberPoint();
        double length = inputDataDto.getLength();
        double radius = inputDataDto.getRadius();
        double lambda = inputDataDto.getLambda();
        double n = inputDataDto.getNRefraction();
        Integer numberOfMembers = inputDataDto.getNumberOfMembers();
        double ksi_0_1 = 2.405;
        double u = 0;
        for (double x = 0; x < (length + h); x += h) {
            double J_0 = BesselJ.value(0, x);
            for (double y = 0; y < (radius + r_h); y += r_h) {
                u += J_0*(ksi_0_1 * y / radius) * ((ksi_0_1 / radius) * ((x * lambda) / (4 * Math.PI * n)));//Todo add right calculation
                //calculation
                points.add(new Point(x, y, u));
            }
        }
        saveAll(points);
        return null;
    }
}
