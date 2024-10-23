package com.pluralsight;

import javax.sound.midi.Soundbank;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");


        Employee e1 = new Employee(1, "Matt", "Tech", 10, 41);
        double totalPay = e1.getTotalPay();
        System.out.println(totalPay);
        System.out.println(e1.getRegularHours());
        System.out.println(e1.getOvertimeHours());



        Reservation r = new Reservation("king", 2, true);

        r.setNumberOfNights(3);

        Reservation[] myReservations = r.getReservationsOnDate();

    }



}