package com.company.xo.model;

public class Strings {

    /** invert the string
     * 	example:
     *	- input: "input string"
     *	- output: "gnirts tupni"
     **/
    public String task1(final String in) {
        // BEGIN (write your solution here)
        StringBuilder builder = new StringBuilder(in).reverse();
        return builder.toString();
        // END
    }

    /** invert the tokens int the string
     * 	example:
     *	- input: "input string to the method test2"
     *	- output: "tupni gnirts ot eht dohtem 2tset"
     **/
    public String task2(final String in) {
        // BEGIN (write your solution here)
        StringBuilder sb = new StringBuilder();
        String arr[] = in.split(" ");

        for (String a : arr){
            sb.append(this.task1(a));
            sb.append(" ");
        }

        return sb.toString();

    }
        // END


//    /** count the target character in the String
//     * 	example:
//     *	- input: "input string to the method test2", 't'
//     *	- output: 7
//     **/
    public int task3(final String in, final char target) {
        // BEGIN (write your solution here)

        int counter = 0;
        for(int i = 0; i < in.length(); i++){


            if(in.charAt(i) == target){
                counter++;
            }
        }

        return counter;
        // END
    }

    public int task4(final String in){
        String arr[] = in.split(" ");
        return arr.length;
    }

    public void task5(final String in){
        int maxLenght = 0;
        int count = 0;
        String longestString = null;
        String arr[] = in.split(" ");
        for(int i = 0; i < this.task4(in); i ++){

            count = count + arr[i].length();

            if(arr[i].length() > maxLenght){
                maxLenght = arr[i].length();
                longestString = arr[i];
            }
        }

        System.out.println("The longest String is: " + longestString);
        System.out.println("Total number of charaters is: " + count);



    }

    public int getResult(final int[] toSumm){
        int result = 0;
        for(int i = 0; i<toSumm.length; i++){
         result = toSumm[i] + result;
        }
        return result;
    }



}