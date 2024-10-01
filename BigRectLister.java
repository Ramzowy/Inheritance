import java.awt.*;
import java.util.ArrayList;

public class BigRectLister {

    public static void main(String[] args) {

        BigRectangleFilter filter = new BigRectangleFilter();
                // Create an ArrayList of 10 rectangles
               ArrayList<Rectangle> rectangles = new ArrayList<>();

                // Add rectangles with different sizes
                rectangles.add(new Rectangle(2, 1));
                rectangles.add(new Rectangle(2, 2));
                rectangles.add(new Rectangle(3, 3));
                rectangles.add(new Rectangle(4, 5));
                rectangles.add(new Rectangle(5, 2));
                rectangles.add(new Rectangle(2, 4));
                rectangles.add(new Rectangle(3, 1));
                rectangles.add(new Rectangle(3, 5));
                rectangles.add(new Rectangle(3, 4));
                rectangles.add(new Rectangle(1, 1));

                System.out.println("The rectangles with perimeter greater 10 than are as follows ");

        for(Rectangle x: rectangles){
                   if (filter.accept(x))
                       System.out.println("The perimeter is: " + ((2 * x.width) + (2 * x.height)));
                 }
    }
}
