package com.goit.homework;
import java.util.Scanner;

public class Functions {
    static Scanner sc = new Scanner(System.in);

    public static void greatMethod(){
        System.out.print("Which task do you want to solve? Enter the number [1-6]:\t");
        int task = sc.nextInt();
        if (task == 1){
            System.out.print("I. Enter any number to get a sequence:\t");
            countNumbers(sc.nextInt());
        } else {
            if (task == 2){
                System.out.print("II. Drawing a rectangle.\nEnter the height: ");
                int height = sc.nextInt();
                System.out.print("Enter the width: ");
                int width = sc.nextInt();
                drawRectangle(height,width);
            } else {
                if (task == 3){
                    System.out.print("III. Drawing a square.\nEnter the length: ");
                    drawRectangle(sc.nextInt());
                } else {
                    if (task == 4){
                        System.out.println("IV. Enter two numbers: ");
                        System.out.println(getMax(sc.nextInt(),sc.nextInt()));

                        System.out.println("\nV. Enter two numbers " +
                                "with floating point: ");
                        System.out.println(getMax(sc.nextDouble(),sc.nextDouble()));

                    } else {
                        if (task == 5) {
                            System.out.println("VI. Enter a number to get a sequence: ");
                            countRecursive(1, sc.nextInt());

                        } else {
                            if (task == 6){
                                System.out.print("VII. Drawing a rectangle.\nEnter the width: ");
                                int width = sc.nextInt();
                                System.out.print("Enter the height: ");
                                int height = sc.nextInt();
                                drawRecursive(width,width*height);
                            } else {
                                System.out.println("Enter only numbers [1-6]!");
                                greatMethod();
                            }
                        }
                    }
                }
            }
        }
        System.out.println("Do you want to continue?");
        String answer = sc.next().toUpperCase();
        if (!answer.toLowerCase().equals("yes")) {
            greatMethod();
        }
    }

    public static void main(String[] args) {
       greatMethod();
    }

    public static void countNumbers(int x) {
        int i = 0;
        while (++i <= x) {
            if (i < x)
                System.out.print(i + " ");
            else
                System.out.println(i);
        }
    }
    public static void drawRectangle(int h, int w) {
        for (int i = 1; i <= h*w; i++){
            if (i % w == 0){
                System.out.println("+");
            } else {
                System.out.print("+ ");
            }
        }
    }
    public static void drawRectangle(int a) {
        for (int i = 1; i <= a*a; i++){
            if (i % a == 0){
                System.out.println("+");
            } else {
                System.out.print("+ ");
            }
        }
    }
    public static int getMax(int a, int  b) {
        System.out.print("Maximum: ");
        return Math.max(a,b);
    }
    public static double getMax(double a, double  b) {
        System.out.print("Maximum: ");
        return Math.max(a,b);
    }
    public static void countRecursive(int i, int x) {
        if(i == x) {
            System.out.println(i);
        }
        else {
            System.out.print(i + " ");
            countRecursive(++i, x);
        }
    }
    public static void drawRecursive(int w, int counter) {
        if (--counter!=-1){
            if (counter%w == 0){
                System.out.println("+");
                drawRecursive(w,counter);
            } else {
                System.out.print("+ ");
                drawRecursive(w,counter);
            }
        }
    }
}
