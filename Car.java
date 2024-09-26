class Car extends Vehicle { // Sub class of Vehicle

    private String horn;

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
    // public Car(String color, String horn) {
    // // this.color = color;
    // this.horn = horn;
    // this.make = "Ford";
    // this.model = "F-150";
    // this.topSpeed = 100;
    // this.numberOfWheels = 4;
    // }

    public void printDetails() {
        System.out.println(make);
        System.out.println(model);
        System.out.println(color);
        System.out.println(horn);
        System.out.println(topSpeed);
        System.out.println(numberOfWheels);
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

    // Getter for horn
    public String getHorn() {
        return horn;
        // return this.horn;
    }

    // Setter for horn
    public void setHorn(String horn) {
        this.horn = horn;
    }

}