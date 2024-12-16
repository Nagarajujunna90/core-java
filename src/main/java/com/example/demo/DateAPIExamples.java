package com.example.demo;

import java.time.*;
import java.time.temporal.TemporalAdjusters;

public class DateAPIExamples {
    public static void main(String[] args) {
        LocalDate currentDate = LocalDate.now();
        currentDate.atTime(LocalTime.MIDNIGHT);
       // System.out.println(currentDate);
        int dayOfMonth1 = currentDate.getDayOfMonth();
        int monthValue = currentDate.getMonthValue();
        int year = currentDate.getYear();
        int dayOfYear = currentDate.getDayOfYear();
        Month month = currentDate.getMonth();
        LocalDate date = currentDate.plusWeeks(2).with(TemporalAdjusters.next(DayOfWeek.FRIDAY));
        System.out.println(date);
       // System.out.println(year);



        LocalDate with = LocalDate.now().plusMonths(1).with(TemporalAdjusters.dayOfWeekInMonth(1,DayOfWeek.FRIDAY));
        System.out.println(with);


//
//
//        LocalTime currentTime = LocalTime.now();
//
//        System.out.println(currentTime);
//
//        LocalDateTime currentDateTime = LocalDateTime.now();
//
//        System.out.println(currentDateTime);
//
//        LocalDate manualDate = LocalDate.of(2024, Month.APRIL, 12);
//        System.out.println(manualDate);
//
//        LocalTime manualTime = LocalTime.of(23, 23, 23);
//        System.out.println(manualTime);
//
//        LocalDateTime manualDateTime = LocalDateTime.of(2024, Month.APRIL, 12, 23, 23, 23);
//        System.out.println(manualDateTime);
//
//        LocalTime withZoneId1 = LocalTime.now(ZoneId.of("Asia/Kolkata"));
//        LocalTime withZoneId = LocalTime.now(ZoneId.of("America/Los_Angeles"));
//        System.out.println("withZoneId1 :"+withZoneId1);
//        System.out.println("withzone :"+withZoneId);
//

    }
}
