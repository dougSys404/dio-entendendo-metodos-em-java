package br.com.dougSys404.javamethods.exercises;

import java.util.Scanner;

public final class Ex04_MathShape {

    public static void caller(){

        Scanner sc = new Scanner(System.in);

        System.out.println("Choose: ");
        System.out.println("\n1 - Trapezoid");
        System.out.println("2 - Rectangle");
        System.out.println("3 - Square");
        System.out.println();
        System.out.print("Option: ");
        int option = sc.nextInt();

        switch (option){
            case 1: {
                System.out.print("Enter base large: ");
                double baseLarge = sc.nextDouble();
                System.out.print("Enter base small: ");
                double baseSmall = sc.nextDouble();
                System.out.print("Enter height: ");
                double height = sc.nextDouble();
                System.out.println(calculateArea(baseLarge, baseSmall, height));
                break;
            }
            case 2: {
                System.out.print("Enter width: ");
                double width = sc.nextDouble();
                System.out.print("Enter base height: ");
                double height = sc.nextDouble();
                System.out.println(calculateArea(width, height));
                break;
            }

            case 3: {
                System.out.print("Enter side: ");
                double side = sc.nextDouble();
                System.out.println(calculateArea(side));
                break;
            }
        }
    }
    // trapézio
    public static String calculateArea(double baseLarge, double baseSmall, double height){

        double area = (baseLarge + baseSmall) * height / 2;

        String message = "Area of Trapezoid: " + area;

        return message;
    }

    //retangulo
    public static String calculateArea(double width, double height){

        double area  = width * height;

        String message = "Area of Rectangle: " + area;

        return message;
    }

    //quadrado
    public static String calculateArea(double side){

        double area = side * side;

        String message = "Area of Sqare: " + area;

        return message;
    }
}
