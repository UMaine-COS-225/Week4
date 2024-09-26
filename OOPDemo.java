class OOPDemo {

    public static void main(String[] args) {

        // Old way of doing things.
        String carOneColor = "red";
        int carOneTopSpeed = 120; // MPH
        int carOneNumberOfWheels = 4;
        String carOneHorn = "Beeps";
        String carOneModel = "Mercedes S";

        System.out.println("Car One is " + carOneColor + " has a top speed of " +
                carOneTopSpeed);
        System.out.println(
                "Car One is a " + carOneModel + " it has " + carOneNumberOfWheels + " wheels and it " + carOneHorn);

        // To create one car, I need to have 5 different variables and 2 different
        // string methods!
        // To create 100 cars, I would need to have 700 variables and print statements.
        // All doing the same thing.
        // And in case I had to modify either the print statement or the behavior of the
        // attribute, I would have to make
        // at the very least 100 changes - which is extremely error prone

        // Using the parameterized constructor to create a Car object makes things
        // easier than before.
        Car myFirstCar = new Car("Blue", "Honks", "Toyota", "Corolla", 65, 4);

        // To verify that the attributes are instantiated with the parameters we
        // provided in the above line, we print them.
        System.out.println(myFirstCar.color);
        System.out.println(myFirstCar.horn);
        System.out.println(myFirstCar.make);
        System.out.println(myFirstCar.model);
        System.out.println(myFirstCar.topSpeed);
        System.out.println(myFirstCar.numberOfWheels);

        // We can also use the default constructor to create a Car object
        Car mySecondCar = new Car();

        // Let's check what are the attributes of this class when created using the
        // default constructor
        System.out.println(mySecondCar.color);
        System.out.println(mySecondCar.horn);
        System.out.println(mySecondCar.make);
        System.out.println(mySecondCar.model);
        System.out.println(mySecondCar.topSpeed);
        System.out.println(mySecondCar.numberOfWheels);

        // Uncomment the following lines to check if we were able to create a new car or
        // not

        // Car thirdCar = new Car("Purple", "Yell");
        // System.out.println(thirdCar.color);
        // System.out.println(thirdCar.horn);
        // System.out.println(thirdCar.make);
        // System.out.println(thirdCar.model);
        // System.out.println(thirdCar.topSpeed);
        // System.out.println(thirdCar.numberOfWheels);

        // The method printVehicle only exists in Vehicle.java but because Car.java
        // extends from Vehicle.java, Car objects also have those methods available.
        mySecondCar.printVehicle();
        myFirstCar.printVehicle();

        Vehicle myNewVehicle = new Vehicle("Brown", "Volvo", "BarFooBar", 150, 8);
        System.out.println(myNewVehicle.color);
        System.out.println(myNewVehicle.make);
        System.out.println(myNewVehicle.model);
        System.out.println(myNewVehicle.topSpeed);
        System.out.println(myNewVehicle.numberOfWheels);

        Car fifthCar = new Car();
        fifthCar.printColor();
        // A setter method ensures that we control the behavior of the attribute
        fifthCar.setTopSpeed(101);

        Bike myNewBike = new Bike();
        myNewBike.printVehicle();

        System.out.println(myNewBike.horn);
        System.out.println(myNewBike.make);
        System.out.println(myNewBike.model);
        System.out.println(myNewBike.topSpeed);
        System.out.println(myNewBike.numberOfWheels);

    }

}