package com.company.xo.model;

import com.company.xo.model.exceptions.InvalidPointException;



public class Field {

    private static final int MIN_COORDINATE = 0;

    private Figure[][] field;

    private final int fieledSize;

    public Field(int filedSize)
    {
        this.fieledSize = filedSize;
        field = new Figure[filedSize][filedSize];
    }

    public int getSize()
    {

        return fieledSize;

    }

    public Figure getFigure(final Point point)
            throws InvalidPointException
    {
        if(!checkCoordinate(point.getX(), fieledSize) || !checkCoordinate(point.getY(), fieledSize))
        {
            throw new InvalidPointException();
        }
        return field[point.getX()][point.getY()];

    }

    public void setFigure(final Point point, final Figure figure)
            throws InvalidPointException

    {
        if(!checkCoordinate(point.getX(), fieledSize) || !checkCoordinate(point.getY(), fieledSize))
        {
            throw new InvalidPointException();
        }
        field[point.getX()][point.getY()] = figure;
    }

    private static boolean checkCoordinate(final int coordinate, final int maxSize)
    {
            return coordinate >= 0 &&  coordinate < maxSize;
    }

}
