import com.tw.bootcamp.problem1.domain.Rectangle;
import com.tw.bootcamp.problem1.domain.Square;

public class App {
    static void main() {

        Rectangle rectangle = new Rectangle(2,5);
        Square square = new Square(5);

        System.out.println(rectangle.area());
        System.out.println(rectangle.perimeter());
        System.out.println(square.area());
        System.out.println(square.perimeter());
    }
}
