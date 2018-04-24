package com.company.xo.view;

import com.company.xo.model.Field;
import com.company.xo.model.Figure;
import com.company.xo.model.Point;
import com.company.xo.model.exceptions.InvalidPointException;

import java.util.ArrayList;
import java.util.HashMap;

import java.util.List;
import java.util.Map;

// version 1 10 rounds against random 8 wins 2 rows
public class AICoordinateGetter implements ICoordinateGetter {
    private RandomCoordinateGetter randomCoordinateGetter = new RandomCoordinateGetter();
    private Map<Integer,Point> points = new HashMap<>();
    private List<Point> arrayList = new ArrayList<>();
    @Override
    public Point getMoveCoordinate(Field field) throws InvalidPointException{
        return analyzeField(field);

    }

    private boolean checkNull(Field field, int index) throws InvalidPointException {

        return field.getFigure(points.get(index)) == null;

    }
    private void makePointArray() {

        Point p1 = new Point(0,0);
        Point p2 = new Point(0,1);
        Point p3 = new Point(0,2);

        Point p4 = new Point(1,2);
        Point p5 = new Point(2,2);
        Point p6 = new Point(2,1);

        Point p7 = new Point(2,0);
        Point p8 = new Point(1,0);
        Point p0 = new Point(1,1);

        points.put(1,p1);
        points.put(2,p2);
        points.put(3,p3);

        points.put(4,p4);
        points.put(5,p5);
        points.put(6,p6);

        points.put(7,p7);
        points.put(8,p8);
        points.put(0,p0);

    }
    private int checkField(Field field) throws InvalidPointException {
        for (int i = 0; i < 9; i++) {

            if ((!checkNull(field,i)) && (field.getFigure(points.get(i))== Figure.O)) {
                points.remove(i);
                return i;
            }

        }
        return 0;
    }

    private Point analyzeField(Field field) throws InvalidPointException{
        makePointArray();
        int index = checkField(field);

        if(index == 0 && checkNull(field,0))return points.get(0);
        if(index == 1 && checkNull(field,3))return points.get(3);
        if(index == 2 && checkNull(field,7))return points.get(7);
        if(index == 3 && checkNull(field,1))return points.get(1);

        if(index == 4 && checkNull(field,2))return points.get(2);
        if(index == 6 && checkNull(field,4))return points.get(4);
        if(index == 7 && checkNull(field,8))return points.get(8);
        if(index == 8 && checkNull(field,7))return points.get(7);

        return randomCoordinateGetter.getMoveCoordinate(field);

    }

    private void checkEquals(Field field) throws InvalidPointException{
        for (int i = 0; i < arrayList.size(); i++) {
            for (int j = i+1; j < arrayList.size(); j++) {
                // compare list.get(i) and list.get(j)
                if (field.getFigure(arrayList.get(i)).equals(field.getFigure(arrayList.get(j)))){

                }
            }
        }
    }



    }


