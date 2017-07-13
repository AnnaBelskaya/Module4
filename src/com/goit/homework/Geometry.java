package com.goit.homework;

public class Geometry {
    int width;
    int height;

    void sayRectangName(){
        System.out.println("\n\tDrawing a rectangle.".toUpperCase());
    }

    void saySquareName(){
        System.out.println("\n\tDrawing a square.".toUpperCase());
    }

    void sayNameRecursive(){
        System.out.println("\n\tDrawing a rectangle. (Recursive)".toUpperCase());
    }

    void askRectangleParams(){
        System.out.println("Enter the width: ");
        width = Functions.sc.nextInt();
        System.out.println("Enter the height: ");
        height = Functions.sc.nextInt();
    }

    void askSquareParams(){
        System.out.print("Enter the length: ");
        width = Functions.sc.nextInt();
        drawFigure(width);
    }
    void drawFigure(){
        for (int i = 1; i <= height*width; i++){
            if (i % width == 0){
                System.out.println("+");
            } else {
                System.out.print("+ ");
            }
        }
    }

    void drawFigure(int l){
        for (int i = 1; i <= l*l; i++){
            if (i % l == 0){
                System.out.println("+");
            } else {
                System.out.print("+ ");
            }
        }
    }

    void drawRecursive(int c) {
        if (--c != -1) {
            if (c % width == 0) {
                System.out.println("+");
                drawRecursive(c);
            } else {
                System.out.print("+ ");
                drawRecursive(c);
            }
        }
    }
}
