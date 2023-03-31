package methods;

/**
 *
 * @author belkizozbek
 */
public class CircleTest {
    public static void main(String[] args) {
        
        Circle circle1 = new Circle();
        Circle circle2 = new Circle();
        
        circle1.radius = 1;
        circle2.radius = 3;
        
        System.out.println("Yarıçapı " + circle1.radius + " olan dairenin alanı " +  circle1.Area() + " çevresi " + circle1.Perimeter() );
        System.out.println("Yarıçapı " + circle2.radius + " olan dairenin alanı " +  circle2.Area() + " çevresi " + circle2.Perimeter() );
        
    }
}
