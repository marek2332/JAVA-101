package com.company.xo.controllers;

import com.company.xo.model.Field;
import com.company.xo.model.Figure;
import com.company.xo.model.Point;
import com.company.xo.model.exceptions.AlreadyOccupiedException;
import com.company.xo.model.exceptions.InvalidPointException;

public class MoveController {

    public boolean applyFigure(final Field field,
                               final Point point,
                               final Figure figure)
            throws InvalidPointException

    {

        if (field.getFigure(point) != null){
            return false;
        }

        field.setFigure(point, figure);

        return true;
    }

}
