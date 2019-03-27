package com.company;
import java.util.Scanner;


//  create class calculator
public class Calculator {

// declare variables
    double num1;
    double num2;
    boolean quit = false;
    String userChoice;

// instantiate scanner object
    Scanner in = new Scanner (System.in);

    public static void clearScreen(){
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

//  create showMenu method
//  declare variables
    public void showMenu() {
        Boolean running = true;
        String userChoice;
//  start do/while with menu option
        do {
            System.out.println("Please enter operation type");
            System.out.println("Press + for Addition");
            System.out.println("Press - for Subtraction");
            System.out.println("Press * for Multiplication");
            System.out.println("Press / for Division");
            System.out.println("Your choice, 0 to quit: ");

//  accepts scanner input
            userChoice = in.nextLine();

//  if choice equal character call matching method
            if (userChoice.equals("+")) {
                add();
            } else if (userChoice.equals("-")) {
                subtract();
            } else if (userChoice.equals("*")) {
                multiply();
            } else if (userChoice.equals("/")) {
                divide();
            } else if (userChoice.equals("0")) {
                quit = true;
            // default for incorrect input
            }  else {
                System.out.println("Wrong Answer, try again");
            }

        } while (!quit);
    }

//  create method to input number values
    public void inputs(){

//  instantiate scanner object
        Scanner input = new Scanner(System.in);

//  output message to console
//  receive input for first number in  scanner object
        System.out.println("please enter the first number");
        num1 = input.nextDouble();

//  output message to console
//  receive input for second number in  scanner object
        System.out.println("please enter the second number");
        num2 = input.nextFloat();
    }

//  create add method
//  call input method
//  perform calculation and output answer

    public  void add(){
        inputs();
        System.out.println(" Your answer is " + (String.format("%.02f",num1 + num2)));
    }

//  create subtract method
//  call input method
//  perform calculation and output answer

    public void subtract(){
        inputs();
        System.out.println(" Your answer is " + (String.format("%.02f",num1 - num2)));
    }

//  create multiply method
//  call input method
//  perform calculation and output answer

    public void multiply(){
        inputs();
        System.out.println(" Your answer is " + (String.format("%.02f",num1 * num2)));
    }

//  create divide method
//  call input method
//  perform calculation and output answer

    public void divide(){
        inputs();
        System.out.println(" Your answer is " + (String.format("%.02f",num1 / num2)));
    }

}
