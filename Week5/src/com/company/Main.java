package com.company;

import com.company.booking.BookingInterface;
import com.company.booking.BookingFacade;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //get input from the user using scanner
        Scanner input = new Scanner(System.in);
        System.out.println("book hotel or flight ? ");
        String mode = input.nextLine();

        //create a new booking object
        BookingInterface booking = BookingFacade.getBookingFacade(mode);


    }
}
