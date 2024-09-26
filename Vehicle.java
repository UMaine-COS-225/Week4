class Vehicle { // Vehicle is a super class

    // Attributes of the Vehicle class that are also inherited by Bike.java and
    // Car.java
    String color;

    String make;
    String model;

    int topSpeed;
    int numberOfWheels;

    // Parameterized constructor
    public Vehicle(String color, String make, String model, int topSpeed, int numberOfWheels) {
        System.out.println("Inside Vehicle.java");
        this.color = color;
        this.make = make;
        this.model = model;
        this.topSpeed = topSpeed;
        this.numberOfWheels = numberOfWheels;
    }

    // Default Constructor
    public Vehicle() {
        this.color = "Red";
        this.make = "Ford";
        this.model = "F-150";
        this.topSpeed = 100;
        this.numberOfWheels = 4;
    }

    // This method is also inherited by Car.java and Bicycle.java since they both
    // extend
    // Vehicle.java
    public void printVehicle() {
        System.out.println("This is a " + make + " " + model);

    }

    // public void printColor() {
    // System.out.println("This vehicle has a color of " + this.color);
    // }

}