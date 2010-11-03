import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by IntelliJ IDEA.
 * User: gluglad
 * Date: Sep 8, 2010
 * Time: 9:52:28 AM
 * To change this template use File | Settings | File Templates.
 */
@Test
public class RectangleTest {
    static public void getAreaTest45()
    {
        Rectangle r = new Rectangle(4.0, 5.0);
        Assert.assertEquals(r.getArea(), 20.0);
    }
    static public void getAreaTestNeg()
    {
        Rectangle r = new Rectangle(-2.0,-4.0);
        Assert.assertEquals(r.getArea(), 8.0);
    }
    static public void getAreaTest0()
    {
        Rectangle r = new Rectangle(0.0, 0.0);
        Assert.assertEquals(r.getArea(), 0.0);
    }
    static public void getPerimeterTest45()
    {
        Rectangle r = new Rectangle(4.0, 5.0);
        Assert.assertEquals(r.getPerimeter(), 18.0);
    }
    static public void getPerimeterTest0()
    {
        Rectangle r = new Rectangle(0.0, 0.0);
        Assert.assertEquals(r.getPerimeter(), 0.0);
    }
}
