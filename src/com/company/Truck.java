package com.company;

import java.util.Date;

public class Truck extends Car {

  private Driver[] drivers = new Driver[2];
  private int loadCapacity;
  private boolean isCargoTrailer;
  private String exhaustStandard;


  public Truck() {

  }

  public Truck(String name, int licensePlate, String color, Date yearOfManufacture,
      CarBrand carBrand, boolean isMoving, byte numberOfWheels, int loadCapacity,
      boolean isCargoTrailer, String exhaustStandard) {
    super(name, licensePlate, color, yearOfManufacture, carBrand, isMoving, numberOfWheels);
    this.loadCapacity = loadCapacity;
    this.isCargoTrailer = isCargoTrailer;
    this.exhaustStandard = exhaustStandard;
  }

  public void addCargoTrailer(int TrailerLoadCapacity) {
    if (isCargoTrailer) {
      System.out.println(name + " is already with the trailer");
    } else {
      isCargoTrailer = true;
      loadCapacity += TrailerLoadCapacity;
    }
  }

  public void addDriver(Driver driver) {
    if (!driver.isTruckLicence()) {
      System.out.println("У водителя нет прав для управления грузовиком");
      return;
    }
    if (drivers[0] == null) {
      drivers[0] = driver;
    } else if (drivers[1] == null) {
      drivers[1] = driver;
    } else {
      System.out.println("У грузовика уже 2 водителя!");
    }
  }

  public double fillUpPrice(int numberOfLiters) {
    return numberOfLiters * 1.78;
  }

  @Override
  public void move() {
    if (isMoving) {
      System.out.println("Truck " + name + " is already moving...");
    } else {
      System.out.println("Truck " + name + " starts moving...");
      isMoving = true;
    }
  }

  public void move(int distanceInKilometers) {
    if (isMoving) {
      System.out.println("Truck " + name + " is already moving...");
    } else {
      System.out.println("Truck " + name + " starts moving...");
      isMoving = true;
      brake();
      System.out.println("Truck " + name + " passed " + distanceInKilometers + " kilometres");
    }
  }

  @Override
  public void brake() {
    if (isMoving) {
      System.out.println("Truck " + name + " started braking...");
      isMoving = false;
    } else {
      System.out.println("Truck " + name + " has already been stopped");
    }
  }

  public int getLoadCapacity() {
    return loadCapacity;
  }

  public void setLoadCapacity(int loadCapacity) {
    this.loadCapacity = loadCapacity;
  }

  public boolean isCargoTrailer() {
    return isCargoTrailer;
  }

  public void setCargoTrailer(boolean cargoTrailer) {
    isCargoTrailer = cargoTrailer;
  }

  public String getExhaustStandard() {
    return exhaustStandard;
  }

  public Driver[] getDrivers() {
    return drivers;
  }

  public void setExhaustStandard(String exhaustStandard) {
    this.exhaustStandard = exhaustStandard;

  }
}
