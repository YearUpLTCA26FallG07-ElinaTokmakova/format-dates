package com.pluralsight;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {

        //get date and time right now
        LocalDateTime currentDateAndTime = LocalDateTime.now();

        //create formatter objects
        DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        DateTimeFormatter formatter3 = DateTimeFormatter.ofPattern("EEEE, MMMM dd, yyyy");
        DateTimeFormatter formatter4 = DateTimeFormatter.ofPattern("EEEE, MMM dd, yyyy HH:mm");
        DateTimeFormatter formattertime5 = DateTimeFormatter.ofPattern("H:mm");         // 5:02 on 22-Apr-2026
        DateTimeFormatter formatterdate5 = DateTimeFormatter.ofPattern("dd-MMM-yyyy");

        //use formatter
        String formattedDate1 = currentDateAndTime.format(formatter1);
        String formattedDate2 = currentDateAndTime.format(formatter2);
        String formattedDate3 = currentDateAndTime.format(formatter3);
        String formattedDate4 = currentDateAndTime.format(formatter4);
        String formattedDate5 = currentDateAndTime.format(formattertime5) + " on " + currentDateAndTime.format(formatterdate5);

        //print
        System.out.println(formattedDate1);
        System.out.println((formattedDate2));
        System.out.println(formattedDate3);
        System.out.println(formattedDate4);
        System.out.println(formattedDate5);
    }
}
