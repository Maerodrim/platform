package com.chmmf.platform.method;

import com.chmmf.platform.dto.InputDataDto;
import com.chmmf.platform.model.Point;

import java.util.List;

public interface Method {
    List<Point> makeCalculation(InputDataDto inputDataDto);
}
