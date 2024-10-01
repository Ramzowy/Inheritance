import java.awt.*;

public class BigRectangleFilter implements Filter{
    @Override
    public boolean accept(Object x) {
        Rectangle r = (Rectangle) x;
        boolean b = false;

        if (((2 * r.width) + (2 * r.height)) > 10)
            b = true;
        else
        {
            ;
        }
        return  b;
    }
}
