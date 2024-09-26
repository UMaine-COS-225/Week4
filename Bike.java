class Bike extends Vehicle {
    // This class inherits all the attributes from Vehicle.java
    String bell;

    public Bike() {
        super(); // Using super, we are calling the constructor of Vehicle class.
                 // Since we are not providing any parameters, we are calling its default
                 // constructor
        this.bell = "Ring";
    }

    // A settter methods allows to control the behavior of the attributes ensuring
    // control of the behavior of the program
    public void setTopSpeed(int topSpeed) {
        if (topSpeed <= 30) {
            this.topSpeed = topSpeed;
        } else {
            System.out.println("This is too much speed");
        }

    }

}