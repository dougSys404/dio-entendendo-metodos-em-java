package br.com.dougSys404.javamethods.exercises;

import java.util.Scanner;

public final class Ex03_Loan {

    public static void getLoan(){

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the loan value: ");
        double loanValue = sc.nextDouble();
        System.out.print("Enter installments quantity: ");
        int installments = sc.nextInt();

        System.out.println(calculateFee(loanValue, installments));
    }



    public static String calculateFee(double loanValue, int installments){


        double finalLoanValue;
        String message;

        if (installments < 1 || installments > 12) {
            message = "Installments now allowed!";
            return message;
        }

        finalLoanValue = loanValue + (loanValue * installments);

        message = "Loan value required: " + loanValue + " | final loan value: " +
                finalLoanValue + " | Installments: " + installments;

        return message;

    }
}
