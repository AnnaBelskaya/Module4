package com.goit.homework;

public class MainMenu {
    int taskNumber;
    String answer;

    void askUser(){
        System.out.print("\nWhich task do you want to solve? Enter the number [1-6]: ");
        chooseTask();
    }

    void chooseTask(){
        try {
            taskNumber = Functions.sc.nextInt();
        } catch (Exception e){
            System.out.println("Enter only numbers [1-6]!");
        }
        switch (taskNumber) {
            case 1:                 //easy sequence [1...n]
                NumberSequences n = new NumberSequences();
                n.sayTaskName();
                n.countNumbers();
                break;
            case 2:                 //drawing a rectangle
                Geometry g1 = new Geometry();
                g1.sayRectangName();
                g1.askRectangleParams();
                g1.drawFigure();
                break;
            case 3:                 //drawing a square
                Geometry g2 = new Geometry();
                g2.saySquareName();
                g2.askSquareParams();
                break;
            case 4:                 //get maximum
                Maximum max = new Maximum();
                max.askNumbers();
                break;
            case 5:                 //recursive sequence
                NumberSequences n1 = new NumberSequences();
                n1.sayTaskNameR();
                n1.countRecursive(1);
                break;
            case 6:                 //recursive sequence
                Geometry g3 = new Geometry();
                g3.sayNameRecursive();
                g3.askRectangleParams();
                g3.drawRecursive(g3.width*g3.height);
                break;
            default:
                System.out.println("You entered the wrong number. Try again");
                chooseTask();
        }
        askIfContinue();
    }
    void askIfContinue(){
        System.out.println("Do you want to continue? (yes/no)");
        answer = Functions.sc.next().toLowerCase();
        switch (answer){
            case "yes":
                askUser();
                break;
        }
    }
}
