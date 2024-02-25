package com.Function;

//Base class
//add honk for car
//bicycle add ringbell method
//modify motorcycle add startride instedad of ride
//truck metho loadcargo to unload cargo
//
class Vehicle {
  protected String brand;
  public Vehicle(String brand) {
      this.brand = brand;
  }
  public void start() {
      System.out.println("The vehicle is starting.");
  }

  public void stop() {
      System.out.println("The vehicle is stopping.");
  }
}
//Derived class 1
class Car extends Vehicle {
  private int numDoors;
  public Car(String brand, int numDoors) {
      super(brand);
      this.numDoors = numDoors;
  }
  public void drive() {
      System.out.println("The car is moving.");
  }
  public void honk() {
      System.out.println("car honk");
  }
}
//Derived class 2
class Bicycle extends Vehicle {
  private int numWheels;
  public Bicycle(String brand, int numWheels) {
      super(brand);
      this.numWheels = numWheels;
  }
  public void pedal() {
      System.out.println("The bicycle is pedaling.");
  }

  public void ringBell() {
      System.out.println("bicycle bell");
  }
}
//Derived class 3
class Motorcycle extends Vehicle {
  private boolean hasSidecar;
  public Motorcycle(String brand, boolean hasSidecar) {
      super(brand);
      this.hasSidecar = hasSidecar;
  }
  public void startRide() {
      System.out.println("The motorcycle is riding.");
  }
}
//Derived class 4
class Truck extends Vehicle {
  private double cargoCapacity;
  public Truck(String brand, double cargoCapacity) {
      super(brand);
      this.cargoCapacity = cargoCapacity;
  }
  public void unloadCargo() {
      System.out.println("The truck is un  loading cargo.");
  }
}
//Main class
class InheritanceExample {
  public static void main(String[] args) {
      Car myCar = new Car("Toyota", 4);
      Bicycle myBicycle = new Bicycle("Schwinn", 2);
      Motorcycle myMotorcycle = new Motorcycle("Harley-Davidson", false);
      Truck myTruck = new Truck("Ford", 5000.0);
      System.out.println("Car Brand: " + myCar.brand);
      myCar.start();
      myCar.drive();
      myCar.stop();
      myCar.honk();
      System.out.println("\nBicycle Brand: " + myBicycle.brand);
      myBicycle.start();
      myBicycle.pedal();
      myBicycle.stop();
      myBicycle.ringBell();
      System.out.println("\nMotorcycle Brand: " + myMotorcycle.brand);
     // myMotorcycle.start();
      myMotorcycle.startRide();
      myMotorcycle.stop();
      System.out.println("\nTruck Brand: " + myTruck.brand);
      myTruck.start();
      myTruck.unloadCargo();
      myTruck.stop();
  }
}
//add honk for car
//bicycle add ringbell method
//modify motorcycle add startride instedad of ride
//truck metho loadcargo to unload cargo
//
//declare interface for stop & start
//create abstract common class ; assgin this keyword to fetch brandname'
//