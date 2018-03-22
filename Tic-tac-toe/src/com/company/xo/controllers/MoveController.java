package com.company.xo.controllers;

import com.company.xo.model.Field;
import com.company.xo.model.Figure;
import com.company.xo.model.Point;
import com.company.xo.model.exceptions.AlreadyOccupiedException;
import com.company.xo.model.exceptions.InvalidPointException;

public class MoveController {

    public static void applyFigure(final Field field,
                               final Point point,
                               final Figure figure)
            throws InvalidPointException,AlreadyOccupiedException

    {

        if (field.getFigure(point) != null){
            throw new AlreadyOccupiedException();
        }

        field.setFigure(point, figure);

    }

}
