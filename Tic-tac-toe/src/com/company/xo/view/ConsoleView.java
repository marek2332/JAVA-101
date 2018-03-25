package com.company.xo.view;

import com.company.xo.model.Field;
import com.company.xo.model.Figure;
import com.company.xo.model.Game;
import com.company.xo.model.Point;
import com.company.xo.model.exceptions.InvalidPointException;

public class ConsoleView implements ICoordinateGetter{



    public Point getMoveCoordinate(final Field field) {
        return new Point(0, 0);
    }

    public void show(final Field field)
            throws InvalidPointException
    {
        final StringBuilder fieldBuilder = new StringBuilder();
        for (int x = 0; x < 3; x++) {
            if (x != 0)
                generateSeparator(fieldBuilder);
            generateLine(field, x, fieldBuilder);
        }
        System.out.println(fieldBuilder.toString());
    }

    void generateLine(final Field field,
                      final int x,
                      final StringBuilder sb)
            throws InvalidPointException {
        for (int y = 0; y < field.getSize(); y++) {
            if (y != 0 && y <= 2)
                sb.append("|");
            sb.append(" ");
            final Figure figure;
            figure = field.getFigure(new Point(y, x));
            sb.append(figure != null ? figure : " ");
            sb.append(" ");
        }
        sb.append("\n");
    }

    void generateSeparator(final StringBuilder sb) {
        sb.append("~~~~~~~~~~~\n");
    }



}
