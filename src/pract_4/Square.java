package pract_4;

class Square extends Rectangle {

    public Square(double side, String color, boolean filled) {
        super(side, side, color, filled);
    }

    public double getSide() {
        return width;
    }

    public void setSide(double side) {
        this.width = side;
        this.length = side;
    }

    @Override
    public void setWidth(double side) {
        setSide(side);
    }

    @Override
    public void setLength(double side) {
        setSide(side);
    }

    // ПЕРЕОПРЕДЕЛЯЕМ МЕТОД getType()
    @Override
    public String getType() {
        return "Square";
    }

    @Override
    public String toString() {
        return "Square[" + super.toString() + "]";
    }
}
