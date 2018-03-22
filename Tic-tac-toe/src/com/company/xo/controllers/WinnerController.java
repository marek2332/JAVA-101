package com.company.xo.controllers;

import com.company.xo.model.*;
import com.company.xo.model.exceptions.InvalidPointException;
import org.jetbrains.annotations.Nullable;


//    private String getWinner(final Field field) {
//
//        final Point p1 = new Point();
//        final Point p2 = new Point();
//        final Point p3 = new Point();
//        p1.x = 0;
//        p2.x = 1;
//        p3.x = 2;
//
//        p1.y = 0;
//        p2.y = 1;
//        p3.y = 2;
//
//        if (field.getFigure(p1) != null &&
//                field.getFigure(p2) != null &&
//                field.getFigure(p3) != null &&
//                field.getFigure(p1).equals(field.getFigure(p2)) &&
//                field.getFigure(p1).equals(field.getFigure(p3))) {
//
//            return field.getFigure(p1);
//        }
//
//        p1.x = 2;
//        p2.x = 1;
//        p3.x = 0;
//
//        p1.y = 0;
//        p2.y = 1;
//        p3.y = 2;
//
//        if (field.getFigure(p1) != null &&
//                field.getFigure(p2) != null
//                && field.getFigure(p3) != null &&
//                field.getFigure(p1).equals(field.getFigure(p2)) &&
//                field.getFigure(p1).equals(field.getFigure(p3))) {
//
//            return field.getFigure(p1);
//        }
//
//        for (int i = 0; i < field.getSize(); i++) {
//            p1.x = 0;
//            p2.x = 1;
//            p3.x = 2;
//
//            p1.y = i;
//            p2.y = i;
//            p3.y = i;
//
//            if (field.getFigure(p1) != null && field.getFigure(p2) != null
//                    && field.getFigure(p3) != null &&
//                    field.getFigure(p1).equals(field.getFigure(p2)) &&
//                    field.getFigure(p1).equals(field.getFigure(p3))) {
//                return field.getFigure(p1);
//            }
//        }
//
//        for (int i = 0; i < field.getSize(); i++) {
//            p1.x = i;
//            p2.x = i;
//            p3.x = i;
//
//            p1.y = 0;
//            p2.y = 1;
//            p3.y = 2;
//
//            if (field.getFigure(p1) != null &&
//                    field.getFigure(p2) != null &&
//                    field.getFigure(p3) != null &&
//                    field.getFigure(p1).equals(field.getFigure(p2)) &&
//                    field.getFigure(p1).equals(field.getFigure(p3))) {
//
//                return field.getFigure(p1);
//            }
//        }
//
//        return null;
//
//    }
//
//       public String getWinner(final Field field) {
//            String winner;
//            for (int i = 0; i < field.getSize(); i++) {
//                winner = checkRow(field, i);
//                if (winner != null) return winner;
//                winner = checkEquals(field, i);
//                if (winner != null) return winner;
//            }
//            winner = checkDiag1(field);
//            if (winner != null) return winner;
//            winner = checkDiag2(field);
//            if (winner != null) return winner;
//
//            return null;
//        }
//
//        private String checkDiag1(final Field field) {
//            final Point p1 = new Point();
//            final Point p2 = new Point();
//            final Point p3 = new Point();
//            p1.x = 0;
//            p2.x = 1;
//            p3.x = 2;
//
//            p1.y = 0;
//            p2.y = 1;
//            p3.y = 2;
//
//            if (field.getFigure(p1) != null && field.getFigure(p2) != null &&
//                    field.getFigure(p3) != null &&
//                    field.getFigure(p1).equals(field.getFigure(p2)) &&
//                    field.getFigure(p1).equals(field.getFigure(p3))) {
//                return field.getFigure(p1);
//            }
//            return null;
//        }
//
//        String checkDiag2(final Field field) {
//            final Point p1 = new Point();
//            final Point p2 = new Point();
//            final Point p3 = new Point();
//            p1.x = 2;
//            p2.x = 1;
//            p3.x = 0;
//
//            p1.y = 0;
//            p2.y = 1;
//            p3.y = 2;
//
//            if (field.getFigure(p1) != null && field.getFigure(p2) != null
//                    && field.getFigure(p3) != null &&
//                    field.getFigure(p1).equals(field.getFigure(p2)) &&
//                    field.getFigure(p1).equals(field.getFigure(p3))) {
//                return field.getFigure(p1);
//            }
//            return null;
//        }
//
//        String checkEquals(final Field field, final Integer i) {
//            final Point p1 = new Point();
//            final Point p2 = new Point();
//            final Point p3 = new Point();
//            p1.x = 0;
//            p2.x = 1;
//            p3.x = 2;
//
//            p1.y = i;
//            p2.y = i;
//            p3.y = i;
//
//            if (field.getFigure(p1) != null && field.getFigure(p2) != null
//                    && field.getFigure(p3) != null &&
//                    field.getFigure(p1).equals(field.getFigure(p2)) &&
//                    field.getFigure(p1).equals(field.getFigure(p3))) {
//                return field.getFigure(p1);
//            }
//            return null;
//        }
//
//        String checkRow(final Field field, final Integer i) {
//            final Point p1 = new Point();
//            final Point p2 = new Point();
//            final Point p3 = new Point();
//            p1.x = i;
//            p2.x = i;
//            p3.x = i;
//
//            p1.y = 0;
//            p2.y = 1;
//            p3.y = 2;
//
//            if (field.getFigure(p1) != null && field.getFigure(p2) != null
//                    && field.getFigure(p3) != null &&
//                    field.getFigure(p1).equals(field.getFigure(p2)) &&
//                    field.getFigure(p1).equals(field.getFigure(p3))) {
//                return field.getFigure(p1);
//            }
//            return null;
//
//TODO:
public class WinnerController {

    public Figure getWinner(final Field field) throws InvalidPointException{
        Figure winner;
        for (int i = 0; i < field.getSize(); i++) {
            winner = checkEquals(field, i, false);
            if (winner != null) return winner;
            winner = checkEquals(field, i, true);
            if (winner != null) return winner;
        }
        winner = checkDiag1(field);
        if (winner != null) return winner;
        winner = checkDiag2(field);
        if (winner != null) return winner;

        return null;
    }

    @Nullable
    private Figure checkDiag1(final Field field) throws InvalidPointException {
        final Point p1 = new Point(0, 0);
        final Point p2 = new Point(1, 1);
        final Point p3 = new Point(2, 2);

        if (field.getFigure(p1) != null && field.getFigure(p2) != null &&
                field.getFigure(p3) != null &&
                field.getFigure(p1).equals(field.getFigure(p2)) &&
                field.getFigure(p1).equals(field.getFigure(p3))) {
            return field.getFigure(p1);
        }
        return null;
    }

    @Nullable
    private Figure checkDiag2(final Field field) throws InvalidPointException {

        final Point p1 = new Point(2, 0);
        final Point p2 = new Point(1, 1);
        final Point p3 = new Point(0, 2);

        if (field.getFigure(p1) != null && field.getFigure(p2) != null
                && field.getFigure(p3) != null &&
                field.getFigure(p1).equals(field.getFigure(p2)) &&
                field.getFigure(p1).equals(field.getFigure(p3))) {
            return field.getFigure(p1);
        }
        return null;
    }

    @Nullable
    private Figure checkEquals(final Field field, final Integer i, Boolean column) throws InvalidPointException {
        final Point p1;
        final Point p2;
        final Point p3;
        if (column) {
            p1 = new Point(0, i);
            p2 = new Point(1, i);
            p3 = new Point(2, i);
        } else {
            p1 = new Point(i, 0);
            p2 = new Point(i, 1);
            p3 = new Point(i, 2);
        }

        if (field.getFigure(p1) != null && field.getFigure(p2) != null
                && field.getFigure(p3) != null &&
                field.getFigure(p1).equals(field.getFigure(p2)) &&
                field.getFigure(p1).equals(field.getFigure(p3))) {
            return field.getFigure(p1);
        }
        return null;
    }
}