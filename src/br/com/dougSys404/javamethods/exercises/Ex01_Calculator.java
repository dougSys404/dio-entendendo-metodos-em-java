package br.com.dougSys404.javamethods.exercises;

import java.util.Scanner;

public final class Ex01_Calculator {

    public static void call(){
        Scanner sc = new Scanner(System.in);
        System.out.println("\nClass Calculator");
        System.out.println("Choose the operation");
        System.out.println("1 - Addition");
        System.out.println("1 - Substraction");
        System.out.println("1 - Multiplication");
        System.out.println("1 - Division");
        int option = sc.nextInt();
        System.out.println();
        System.out.println();
        System.out.print("Now, enter the first number: ");
        double numberOne = sc.nextDouble();
        System.out.print("Enter the Second number: ");
        double numberTwo = sc.nextDouble();

        switch (option){
            case 1 -> System.out.println("Result: " + add(numberOne, numberTwo));
            case 2 -> System.out.println("Result: " + substract(numberOne, numberTwo));
            case 3 -> System.out.println("Result: " + multiplication(numberOne, numberTwo));
            case 4 -> System.out.println("Result: " + division(numberOne, numberTwo));
        }

    }

    public static double add(double numberOne, double numberTwo){

        return numberOne + numberTwo;
    }

    public static double substract(double numberOne, double numberTwo){

        return numberOne - numberTwo;
    }

    public static double multiplication(double numberOne, double numberTwo){

        return numberOne * numberTwo;
    }

    public static double division(double numberOne, double numberTwo){

        return numberOne / numberTwo;
    }
}
