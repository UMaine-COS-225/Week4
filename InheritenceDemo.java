class InheritenceDemo {

    public static void main(String[] args) {

        Rectangle r1 = new Rectangle("Steve", "Blue", 15.0, 10.0);
        r1.printNameAndColor();
        r1.printArea();

        Triangle t1 = new Triangle("Jim", "Black", 10, 20.0);
        t1.printNameAndColor();

        Square sq = new Square("Pam", "Purple", 12);
        System.out.println("The area of the square is " + sq.calculateArea());

    }
}