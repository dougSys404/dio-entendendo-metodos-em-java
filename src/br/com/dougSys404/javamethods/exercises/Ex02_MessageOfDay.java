package br.com.dougSys404.javamethods.exercises;


import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public final class Ex02_MessageOfDay {

    public static String getTime(){

        LocalTime now = LocalTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
        int hour = now.getHour();

        String message;

        if (hour < 12) {
            message = "Bom dia!";
        } else if (hour < 18) {
            message = "Boa tarde!";
        } else {
            message = "Boa noite!";
        }

        return message + ", a hora é: " + now.format(formatter)+"h";
    }
}
