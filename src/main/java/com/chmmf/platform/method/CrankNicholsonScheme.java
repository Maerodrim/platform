package com.chmmf.platform.method;

import com.chmmf.platform.dto.InputDataDto;
import com.chmmf.platform.model.Point;

import java.util.List;

public class CrankNicholsonScheme extends BaseMethod implements Method{
    @Override
    public List<Point> makeCalculation(InputDataDto inputDataDto) {
        init(inputDataDto);
        //calculation
        saveAll(points);
        return points;
    }
}
