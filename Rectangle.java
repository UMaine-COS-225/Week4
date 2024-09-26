class Rectangle extends Shape {

    protected double width, height;

    public Rectangle(String name, String color, double width, double height) {
        super(name, color);
        this.width = width;
        this.height = height;
    }

    public double calculateArea() {
        return width * height;
    }

    public void printArea() {
        System.out.println("The area of this shape is " + calculateArea());
    }

}