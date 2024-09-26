class Square extends Rectangle {

    public Square(String name, String color, double side) {
        super(name, color, side, side);
    }

    public double getSide() {
        return width;
    }

}