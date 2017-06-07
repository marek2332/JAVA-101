package com.company.xo.controllers;

import com.company.xo.model.Field;
import com.company.xo.model.Point;

public class MoveController {

    public boolean applyFigure(final Field field,
                               final Point point,
                               final String figure) {
        
        final int maxSize = field.getSize();
        if (checkCoordinate(point.x, maxSize) && checkCoordinate(point.y, maxSize) && field.getFigure(point) == null){

            field.setFigure(point, figure);
            return true;
        }
        return false;

        
    }

    
    private  boolean checkCoordinate(final int coordinate, final int maxSize) {
        if (coordinate >= 0 &&  coordinate < maxSize) {
            return true;
        }
        return false;
    }
    
}
