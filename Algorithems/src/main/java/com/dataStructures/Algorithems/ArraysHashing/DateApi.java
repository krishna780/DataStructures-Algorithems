package com.dataStructures.Algorithems.ArraysHashing;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class DateApi {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        LocalDateTime localDateTime = LocalDateTime.of(LocalDate.now().plusDays(1), LocalTime.MIN);
        LocalDateTime localDateTime1 = localDateTime.minusHours(24);
        if(now.isAfter(localDateTime1)){
            System.out.println("sent");
        }

    }
}
