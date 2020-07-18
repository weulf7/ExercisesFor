package org.example;
import java.io.*;



public class ForExercises {

    public void start() {
//        numbering(100);
//        numbering1(-100);
//        numbering2(200,250);
//        numbering3(300,350);
//        showEvenNumbers();
//        showNotEvenNumbers();
//        sum(1);
//        arithmeticMean(100);
//             asteriskForm(7);


    }

    public void numbering(int x) {
        for (int i = 0; i <= x; i++) {
            System.out.println(i);
        }
    }

    public void numbering1(int y) {
        for (int i = 0; i >= y; i--) {

            System.out.println(i);
        }
    }

    public void numbering2(int x, int y) {
        for (int i = x; i <= y; i++) {
            System.out.println(i);
        }


    }

    public void numbering3(int x, int y) {

        if (x > y) {
            System.out.println(x + " is the bigger number.");
            for (int i = x; i >= y; i--) {

                System.out.println(i);
            }
        } else {
            System.out.println(y + " is the bigger number.");
            for (int i = y; i >= x; i--) {

                System.out.println(i);
            }
        }

    }

    public void showEvenNumbers() {
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }

    }

    public void showNotEvenNumbers() {
        for (int i = 1; i <= 100; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }
    }


    public void sum(int x) {
        int number=100;
        int sum=0;
        for (int i=x;i<=100;i++){
            sum+=i;
            System.out.println("The total is :"+sum);
        }



    }

    public static void asteriskForm(int number){
        String space="";

        for (int i=0;i<number;i++){
            space+="*";
        }
        for (int i=0;i<space.length();i++){
            System.out.println(space.substring(0,space.length()-i));
        }





    }

    public void arithmeticMean(int x){
        int sum=0;
        int mean;
        for (int i =1;i<=x;i++){
            sum+=i;
            mean=sum/100;
            System.out.println(mean);

        }
















}
    }