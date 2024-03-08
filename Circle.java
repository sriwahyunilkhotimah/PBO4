public class Circle extends Shape {
    protected double radius;

    public Circle(String name, double radius) {
        super(name);
        this.radius = radius;
    }

    public void calculatePerimeter() {
        perimeter = 2 * Math.PI * radius;
    }

    public void calculateArea() {
        area = Math.PI * Math.pow(radius, 2);
    }

    public static void main(String[] args) {
        Circle Lingkaran = new Circle("Lingkaran", 14.0);
        Lingkaran.calculateArea();
        Lingkaran.calculatePerimeter();
        Lingkaran.getInfo();
    }
}