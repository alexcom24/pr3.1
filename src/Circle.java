public class Circle extends Shape {
    protected double radius;
    public Circle() {
        radius=0;
    }
    public Circle(double radius) {
        this.radius=radius;
    }
    public Circle(double radius, String color, boolean filled) {
        this.radius=radius;
        this.color=color;
        this.filled=filled;
    }
    public void setRadius(double radius) {
        this.radius=radius;
    }
    public double getRadius() {
        return radius;
    }
    @Override
    public double getArea() {
        return Math.PI*radius*radius;
    }
    @Override
    public double getPerimeter() {
        return Math.PI*radius*2;
    }
    @Override
    public String toString() {
        return "Radius: "+this.radius+", color: "+this.color+", filled: "+this.filled;
    }
}
