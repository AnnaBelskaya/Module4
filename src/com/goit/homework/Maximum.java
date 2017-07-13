package com.goit.homework;

public class Maximum {
    int a;
    int b;
    double a1;
    double b1;

    void sayTaskName(){
        System.out.println("\tGetting maximum number.".toUpperCase());
        askNumbers();
    }

    void askNumbers(){
        System.out.print("Enter two numbers: ");
        a = Functions.sc.nextInt();
        b = Functions.sc.nextInt();
        getIntMaximum();
        System.out.print("Enter two numbers with floating point: ");
        a1 = Functions.sc.nextDouble();
        b1 = Functions.sc.nextDouble();
        getDoubleMaximum();
    }

    void getIntMaximum(){
        System.out.println("Maximum: " + Math.max(a,b));
    }
    void getDoubleMaximum(){
        System.out.println("Maximum: " + Math.max(a1,b1));
    }

}
