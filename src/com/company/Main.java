package com.company;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

public class Main {

  public static void main(String[] args) throws ParseException {
    Car mazTruck = new Truck("МАЗ-555025", 1236, "Red",
        new Date("18 December 2019 15:36"), CarBrand.MAZ, true, (byte) 4,
        10300, false, "EURO 5");
    System.out.println(mazTruck.getDateOfManufacture());
    mazTruck.move();
    mazTruck.brake();
    mazTruck.brake();
    mazTruck.move();
    mazTruck.move();
    Truck mercedesTruck = new Truck("Mercedes-Benz Acros", 5426, "White",
        new Date("25 September 2015 10:03"), CarBrand.MERCEDES, false, (byte) 8,
        15200, false, "EURO 6");

    mercedesTruck.addCargoTrailer(8000);
    System.out.println(mercedesTruck.getLoadCapacity());
    mercedesTruck.addCargoTrailer(5000);
    System.out.println(mercedesTruck);
    mercedesTruck.addDriver(new Driver("Boris", 26, false));
    mercedesTruck.addDriver(new Driver("Petr", 34, true));
    System.out.println(Arrays.toString(mercedesTruck.getDrivers()));

    Minivan mercedesMinivan = new Minivan("Mercedes-Benz V Class", 2635,
        "Black", new Date("2 August 2016 15:15"), CarBrand.MERCEDES, false,
        (byte) 4, 7, 800, false);
    mercedesMinivan.move();
    while (mercedesMinivan.getPassengerCounter() < mercedesMinivan.getNumberOfSeats()) {
      mercedesMinivan.addPassenger();
    }
    mercedesMinivan.move();
    mercedesMinivan.dropOff(7);

    Suv suv = new Suv("Toyota Land Cruiser Prado", 5698, "Brown",
        new Date("14 November 2016 08:36"), CarBrand.TOYOTA, false, (byte) 4,
        215, true, 90);
    suv.setLitresInTank(25);
    suv.fillUp(25);
    mercedesTruck.move(150);
    Movable tractor = new Tractor("MTZ", 5432, false, true,
        5000);
    tractor.move();

    Movable suv1 = new Suv("BMW X5", 0202, "Black", new Date("1 November"
        + " 2016 08:36"), CarBrand.BMW, false, (byte) 4, 200,
        false, 90);
    suv1.move();
    suv1.brake();
    Car car1 = new Minivan("Mercedes-Benz V Class", 2635, "Black",
        new Date("19 August 2016 15:15"), CarBrand.MERCEDES, false, (byte) 4,
        7, 800, false);
    Movable scooter = new Scooter("Peugeot Django", 5268,
        true, true);
    Movable car2 = new Truck("SCANIA P410", 8745, "Red",
        new Date("18 September 2019 15:36"), CarBrand.SCANIA, true, (byte) 4,
        10300, false, "EURO 6");


  }
}
