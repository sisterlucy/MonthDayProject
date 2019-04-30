package com.LickingHeights;

import java.time.DayOfWeek;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //create a method for determining  month day they were born
        //create a method for determining the day of the week they wee born
        //create a method for determining the line of the poem
        //wrap the code in a loop
        Scanner keyboard;

        System.out.println("There is an old nursery rhyme that that goes like this...");
        System.out.println("Monday's child is fair of face,\n" +
                "Tuesday's child is full of grace,\n" +
                "Wednesday's child is full of woe,\n" +
                "Thursday's child has far to go.\n" +
                "Friday's child is loving and giving,\n" +
                "Saturday's child works hard for a living,\n" +
                "But the child born on the Sabbath Day,\n" +
                "Is fair and wise and good in every way.\n");
        System.out.println("Let's see what day of the of the week you were born on");
        keyboard = new Scanner(System.in);
        System.out.println("What month were you born in? (enter as number)");
        String month = (keyboard.nextLine());
        System.out.println("What was the date you were born on?");
        String date = (keyboard.nextLine());
        System.out.println("What year were you born in?");
        String year = (keyboard.nextLine());
        System.out.println(month);
        System.out.println(date);
        System.out.println(year);
        switch (month) {

            case "1":
            case "3":
            case "5":
            case "7":
            case "8":
            case "10":
            case "12":
                month = String.valueOf(31);


        }

    }}
