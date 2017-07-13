package com.goit.homework;

public class MainMenu {
    int taskNumber;
    String answer;

    void askUser(){
        System.out.print("\nWhich task do you want to solve? Enter the number [1-6]: ");
        chooseTask();
    }

    void chooseTask(){
        Geometry g = new Geometry();
        NumberSequences n = new NumberSequences();
        try {
            taskNumber = Functions.sc.nextInt();
        } catch (Exception e){
            System.out.println("Enter only numbers [1-6]!");
        }
        switch (taskNumber) {
            case 1:                 //easy sequence [1...n]
                n.sayTaskName();
                n.countNumbers();
                break;
            case 2:                 //drawing a rectangle
                g.sayRectangName();
                g.askRectangleParams();
                g.drawFigure();
                break;
            case 3:                 //drawing a square
                g.saySquareName();
                g.askSquareParams();
                break;
            case 4:                 //get maximum
                Maximum max = new Maximum();
                max.askNumbers();
                break;
            case 5:                 //recursive sequence
                n.sayTaskNameR();
                n.countRecursive(1);
                break;
            case 6:                 //recursive sequence
                g.sayNameRecursive();
                g.askRectangleParams();
                g.drawRecursive(g.width*g.height);
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
        if (answer.equals("yes")){
            askUser();
        }
    }
}
