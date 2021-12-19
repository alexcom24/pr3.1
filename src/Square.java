public class Square extends Rectangle {
    public Square() {
        width=0;
        length=0;
    }
    public Square(double side) {
        width=side;
        length=side;
    }
    public Square(double side, String color, boolean filled) {
        width=side;
        length=side;
        this.color=color;
        this.filled=filled;
    }
    public void setSide(double side) {
        width=side;
        length=side;
    }
    public void setWidth(double side) {
        width=side;
        length=side;
    }
    public void setLength(double side) {
        length=side;
        width=side;
    }
    public double getSide() {
        return width;
    }
    @Override
    public String toString() {
        return "Side: "+this.width+", color: "+this.color+", filled: "+this.filled;
    }
}
