class Car extends Vehicle { // Sub class of Vehicle

    String horn;

    // Parameterized Constructor
    public Car(String color, String horn, String make, String model, int topSpeed, int numberOfWheels) {
        // I am calling the parameterized constructor of Vehicle.java ensuring the
        // necessary attributes are instantiated
        super(color, make, model, topSpeed, numberOfWheels);
        System.out.println("Inside Car.java");
        this.horn = horn;
    }

    // Default Constructor
    public Car() {
        super();
        this.horn = "Beep";
    }

    // Constructor with two parameters
    public Car(String color, String horn) {
        // this.color = color;
        this.horn = horn;
        this.make = "Ford";
        this.model = "F-150";
        this.topSpeed = 100;
        this.numberOfWheels = 4;
    }

    // Method
    public void printColor() {
        System.out.println("The color of the car is " + this.color);
    }

    // Method
    public void setTopSpeed(int topSpeed) {
        if (topSpeed < 100) {
            this.topSpeed = topSpeed;
        } else {
            System.out.println("This is too much speed");
        }
    }

}