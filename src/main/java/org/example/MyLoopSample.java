package org.example;

public class MyLoopSample {

    public static void main(String... args){

//        for(int i = 0, j = 10; i < j; i++, j--){
//            System.out.println(" i = " + i + " j = " + j);
//
//        }

//        int x= 1;
//        while(x < 10){
//            System.out.println(x);
//            if(x == 7){
//                break;
//            }
//            x++;
//        }

        int x= 1;
        while(x < 10){
            x++;
            if(x % 2 != 0){
                continue;
            }
            System.out.println(x);

        }
    }
}
