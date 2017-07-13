package com.goit.homework;

public class NumberSequences {
    int number;

    void sayTaskName(){
        System.out.println("\tGetting a sequence of numbers.".toUpperCase());
        askNumber();
    }
    void sayTaskNameR(){
        System.out.println("\tGetting a sequence of numbers. (Recursive)".toUpperCase());
        askNumber();
    }
    void askNumber(){
        System.out.print("Enter any number: ");
        number = Functions.sc.nextInt();
    }
    void countNumbers() {
        int i = 0;
        while (++i <= number) {
            if (i < number)
                System.out.print(i + " ");
            else
                System.out.println(i);
        }
    }
    void countRecursive(int i) {
        if(i == number) {
            System.out.println(i);
        }
        else {
            System.out.print(i + " ");
            countRecursive(++i);
        }
    }
}
