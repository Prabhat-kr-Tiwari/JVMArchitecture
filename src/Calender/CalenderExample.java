package Calender;

//import java.time.LocalDate;
//import java.time.LocalDateTime;
//import java.time.LocalTime;
//import java.time.Month;
import java.time.*;

public class CalenderExample {
    public static void main(String[] args) {
        //date
        LocalDate date=LocalDate.now();
        System.out.println("Current Date: "+date);

        //time
        LocalTime time=LocalTime.now();
        System.out.println("Current time: "+time);

        //LocalDateTimeObject
        LocalDateTime dateTime=LocalDateTime.now();
        System.out.println("Current Date and Time: "+dateTime);

        //specified date and time
        LocalDate specificDate=LocalDate.of(2023, Month.JUNE,10);
        System.out.println("specifiedDate: "+specificDate);

        // Manipulating date
        LocalDate modifiedDate = specificDate.plusDays(7);
        System.out.println("Modified Date: " + modifiedDate);

        // Checking if two dates are equal
        boolean isEqual = specificDate.isEqual(modifiedDate);
        System.out.println("Are the dates equal? " + isEqual);

        // Comparing two dates
        int comparisonResult = specificDate.compareTo(modifiedDate);
        System.out.println("Comparison Result: " + comparisonResult);

    }
}
