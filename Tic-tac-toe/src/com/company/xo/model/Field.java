package com.company.xo.model;

public class Field {

    public String[][] figures = new String[3][3];

    public int getSize() {

        return figures.length;

    }

    public String getFigure(final Point point) {

        return figures[point.x][point.y];

    }

    public void setFigure(final Point point, final String figure) {

        figures[point.x][point.y] = figure;

    }

}
