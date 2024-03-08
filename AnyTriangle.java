public class AnyTriangle extends Triangle {
    public AnyTriangle(String name, double side1, double side2, double side3) {
        super(name, side1, side2, side3);
    }

    public void calculatePerimeter() {
        perimeter = side1 + side2 + side3;
    }

    public void calculateArea() {
        double s = 0.5 * perimeter;
        area = Math.abs(Math.sqrt(s * (s - side1) * (s - side2) * (s - side3)));
    }

    public static void main(String[] args) {
        AnyTriangle sembarangTriangle = new AnyTriangle("Segitiga Sembarang", 6.0, 4.0, 4.0);
        sembarangTriangle.calculatePerimeter();
        sembarangTriangle.calculateArea();
        sembarangTriangle.getInfo();
    }    
}