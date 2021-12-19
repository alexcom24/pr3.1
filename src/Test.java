public class Test {
    public static void main(String[] args) {
        Circle c1=new Circle();
        Circle c2=new Circle(3);
        Circle c3=new Circle(3,"red",true);
        Circle c4=new Circle();
        Rectangle r1=new Rectangle();
        Square s1=new Square();
        c4.setRadius(4);
        c4.setColor("yellow");
        c4.setFilled(true);
        r1.setWidth(3);
        r1.setLength(5);
        r1.setColor("green");
        r1.setFilled(true);
        s1.setSide(5);
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
        System.out.println(c4);
        System.out.println(c4.getArea());
        System.out.println(c4.getPerimeter());
        System.out.println(r1);
        System.out.println(r1.getArea());
        System.out.println(r1.getPerimeter());
        System.out.println(s1);
        System.out.println(s1.getArea());
        System.out.println(s1.getPerimeter());

    }
}
