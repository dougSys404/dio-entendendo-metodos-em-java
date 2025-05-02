package br.com.dougSys404.javamethods.auxiliaryclass;

import br.com.dougSys404.javamethods.exercises.Ex01_Calculator;
import br.com.dougSys404.javamethods.exercises.Ex02_MessageOfDay;
import br.com.dougSys404.javamethods.exercises.Ex03_Loan;
import br.com.dougSys404.javamethods.exercises.Ex04_MathShape;

import java.util.Scanner;

public final class AuxiliaryCaller {

    public static void callExercises(){
        Scanner sc = new Scanner(System.in);

        System.out.println("\nChoose the exercise:");
        System.out.println("1 - Ex 1 - Calculator");
        System.out.println("2 - Ex 1 - Message");
        System.out.println("3 - Ex 1 - Loan");
        System.out.println("4 - Ex 4 - Mathmatics Shape calculator");
        System.out.print("\nOption: ");
        int option = sc.nextInt();

        switch (option) {
            case 1 -> Ex01_Calculator.call();
            case 2 -> Ex02_MessageOfDay.getTime();
            case 3 -> Ex03_Loan.getLoan();
            case 4 -> Ex04_MathShape.caller();
        }
    }

}
