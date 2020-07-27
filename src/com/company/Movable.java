package com.company;

public interface Movable {

  void move();

  default void brake() {
    System.out.println("Braking...");
  }


}
