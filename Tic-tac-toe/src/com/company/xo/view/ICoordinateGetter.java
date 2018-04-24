package com.company.xo.view;

import com.company.xo.model.Field;
import com.company.xo.model.Point;
import com.company.xo.model.exceptions.InvalidPointException;

public interface ICoordinateGetter {
    Point getMoveCoordinate(Field field) throws InvalidPointException;
}
