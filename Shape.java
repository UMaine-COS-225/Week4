abstract class Shape {

    String name;
    String color;

    public Shape(String name, String color) {
        this.name = name;
        this.color = color;
    }

    public abstract double calculateArea();

    protected void printNameAndColor() {
        System.out.println("The name of this shape is " + name + " and it is of " + color + " color");
    }
}