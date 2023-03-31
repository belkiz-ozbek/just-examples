package methods;

/**
 *
 * @author belkizozbek
 */
public class Circle {

    double radius;

    public double Area() {
        double area = Math.PI * Math.pow(radius, 2);
        return area;
    }

    public double Perimeter() {
        double perimeter = 2.0 * Math.PI * radius;
        return perimeter;
    }

}
