package com.company.xo.view;

import com.company.xo.model.Field;
import com.company.xo.model.Point;
import com.company.xo.model.exceptions.InvalidPointException;

import java.util.Random;

public class RandomCoordinateGetter implements ICoordinateGetter {
    public static final int FIELD_SIZE = 3;
    private Random rand = new Random();
    @Override
    public Point getMoveCoordinate(Field field) throws InvalidPointException{
        Point point = getRandomPoints();
        while (field.getFigure(point) != null){
            point = getRandomPoints();
        }
        return point;

    }
    private Point getRandomPoints(){
        return new Point(getRandomInt(),getRandomInt());
    }

    private int getRandomInt(){
        return rand.nextInt(FIELD_SIZE);
    }
















//    public Point getMoveCoordinate(final Field field) {
//        Point result = getRandomPoint();
//        while (field.getFigure(result) != null) {
//            result = getRandomPoint();
//        }
//        return result;
//    }
//
//    private Point getRandomPoint() {
//        return new Point(
//                getRandomInt(),
//                getRandomInt()
//        );
//    }
//
//    private int getRandomInt() {
//        return Math.abs(RANDOM.nextInt() % 3);
//    }
//
//}
}
