package com.company.xo.controllers;

import com.company.xo.model.Field;

import com.company.xo.model.Figure;
import com.company.xo.model.Point;
// BEGIN (write your solution here)

// END
import com.company.xo.model.exceptions.InvalidPointException;

public class CurrentMoveController {


        // BEGIN (write your solution here)

        // END
    public Figure currentMove(final Field field) {
        int countFigure = 0;
        for (int x = 0; x < field.getSize(); x++) {
            countFigure += countFiguresInTheRow(field, x);
        }

        if (countFigure == field.getSize() * field.getSize())
            return null;

        if (countFigure % 2 == 0)

            return Figure.X;


        // return "O";
        // BEGIN (write your solution here)
        return Figure.O;
        // END
    }

    private int countFiguresInTheRow(final Field field, final Integer row) {
        int countFigure = 0;
        for (int x = 0; x < field.getSize(); x++) {
            final Point p = new Point(x, row);
            try {
                if (field.getFigure(p) != null)
                    countFigure++;
            } catch (InvalidPointException e) {
                e.printStackTrace();
            }
        }
        return countFigure;
    }
}