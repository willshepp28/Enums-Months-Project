package com.example;

import com.example.common.Month;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {



	// In Main ask the user (using Scanner) to choose one of the months (show the month using the English name)
    Scanner scanner = new Scanner(System.in);

        List<Month> year =new ArrayList<Month>();


        // ask the user (using Scanner) to choose one of the months
        System.out.println("Choose one of these months");


        // input user choice
        String userChoice = scanner.next().toUpperCase();

        System.out.println(Month.valueOf(userChoice));


        switch (userChoice) {
            case "JANUARY":  year.add(Month.JANUARY);
            case "FEBRUARY":  year.add(Month.FEBRUARY);
            case "MARCH":  year.add(Month.MARCH);
            case "APRIL":  year.add(Month.APRIL);
            case "MAY":  year.add(Month.MAY);
            case "JUNE":  year.add(Month.JUNE);
            case "JULY":  year.add(Month.JULY);
            case "AUGUST":  year.add(Month.AUGUST);
            case "SEPTEMBER":  year.add(Month.SEPTEMBER);
            case "OCTOBER": year.add(Month.OCTOBER);
            case "NOVEMBER": year.add(Month.NOVEMBER);
            case "DECEMBER": year.add(Month.DECEMBER);
                break;
            default: break;
        }

        if (userChoice.isEmpty()) {
            System.out.println("Pleeeaaasse pick a month");
        } else {
            for (Month theyear : year) {
                System.out.println(theyear);
            }
        }
    }






    }

