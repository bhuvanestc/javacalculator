package org.example;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class TimeExercise {
    public static void main(String[] args){
        LocalDate today = LocalDate.now();
        System.out.println("today : " + today);
        LocalDateTime dTF = LocalDateTime.now();
        DateTimeFormatter dTForm = DateTimeFormatter.ofPattern("EEEE dd MMM ");
        String formattedDate = dTF.format(dTForm);
        System.out.println(formattedDate);

    }
    
}
