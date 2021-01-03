package com.chmmf.platform.method;

import com.chmmf.platform.model.Point;
import com.chmmf.platform.repository.PointRepository;

import java.util.List;

public abstract class BaseMethod implements Method {
    protected PointRepository pointRepository;
    protected Math math;

    void saveAll(List<Point> points) {
        pointRepository.saveAll(points);
    }
}
