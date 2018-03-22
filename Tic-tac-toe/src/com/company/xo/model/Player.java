package com.company.xo.model;

public class Player {

    private final String name ;
    private final Figure figure;

    public String getName() {
        return name;
    }

    public Figure getFigure() {
        return figure;
    }

    public Player(String name, Figure figure) {

        this.name = name;
        this.figure = figure;
    }

//
//    public String getName() {
//        return name;
//    }
//
//    public Figure getFigure() {
//        return figure;
//    }
//
////    Player(final PlayerBuilder playerBuilder) {
////        this.name = playerBuilder.getName();
////        this.figure = playerBuilder.getFigure();
////    }
//
//
//    public Player(String name, Figure figure) {
//        this.name = name;
//        this.figure = figure;
//    }
}
