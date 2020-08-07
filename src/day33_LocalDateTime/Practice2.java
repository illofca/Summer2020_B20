package day33_LocalDateTime;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Practice2 {
    public static void main(String[] args) {

        String[] students = {"Kalbinur", "Virginia", "Odina", "Ernis", "Isa"};
        LocalDate[] birthDays = {
                LocalDate.of(1982,12,26),
                LocalDate.of(1993, 11,25),
                LocalDate.of(1980,5,23),
                LocalDate.of(1990, 2,21),
                LocalDate.of(1982,11,28)
        };

        // Odina : May/23/80 Monday

        DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("MMMM/dd/yyyy EEEE");

        for(int i = 0; i <= students.length-1; i++){
            System.out.println(students[i]+ " : "+ birthDays[i].format(dateFormat));
    }



    }


}
