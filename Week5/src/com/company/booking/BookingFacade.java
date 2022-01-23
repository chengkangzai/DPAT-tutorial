package com.company.booking;

class FlightBooker implements BookingInterface {
    String bookingNumber;

    @Override
    public void book() {
        System.out.println("Booking Flight");
        this.bookingNumber = Double.valueOf(Math.random()).toString();
        System.out.println("Your Booking Number is " + this.bookingNumber);
    }
}

class HotelBooker implements BookingInterface {
    String bookingNumber;

    @Override
    public void book() {
        System.out.println("Booking hotel");
        this.bookingNumber = Double.valueOf(Math.random()).toString();
        System.out.println("Your Booking Number is " + this.bookingNumber);
    }
}


public class BookingFacade {
    public static BookingInterface getBookingFacade(String mode) {
        if (mode.equals("flight")) {
            return new FlightBooker();
        } else if (mode.equals("hotel")) {
            return new HotelBooker();
        } else {
            return null;
        }

    }
}
