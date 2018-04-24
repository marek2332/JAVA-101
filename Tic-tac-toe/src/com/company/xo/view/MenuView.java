package com.company.xo.view;

import java.util.Scanner;

public class MenuView {

    public static final int START_CODE = 1;

    public int showMenuWithResult(){
        System.out.println(START_CODE + " - Start");
        System.out.println("2 - Load ");
        System.out.println("3 - Settings");
        System.out.println("4 - Exit");
        System.out.print("> ");

        final Scanner sc = new Scanner(System.in);
        int choise = sc.nextInt();

//        if(choise == START_CODE){
//
//
//            System.out.println("Start");
//
//        }

        switch (choise) {

            case START_CODE:
                System.out.println("Start");
                break;
            case 2:
                System.out.println("Load ");
                break;
            case 3:
                System.out.println("Settings");
                break;
            case 4:
                System.out.println("Exit");
                break;
            default:
                System.out.println("Really?");
                break;
        }

        return 0;
    }

}
