package com.company.xo.model;

public enum Figure {
    X("X"),O("O");

    private final String figure;

    Figure(String figure) {
        this.figure = figure;
    }

    public String getFigure() {
        return figure;
    }
}
