import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by IntelliJ IDEA.
 * User: gluglad
 * Date: Sep 8, 2010
 * Time: 10:07:44 AM
 * To change this template use File | Settings | File Templates.
 */
@Test
public class CircleTest {
    public static void getAreaTest0(){
        Circle c = new Circle(0.0);
        Assert.assertEquals(c.getArea(), 0.0);
    }
    public static void getAreaTest4(){
        Circle c = new Circle(4.0);
        Assert.assertEquals(c.getArea(), 16*Math.PI);
    }
    public static void circleRadNeg(){
        try{
            Circle c = new Circle(-3.0);
            Assert.fail("Wrongly accepted negative radius\n");
        }
        catch(Exception IllegalArgumentException)
        {

        }
    }
    public static void getPerimeterTest0(){
        Circle c = new Circle(0.0);
        Assert.assertEquals(c.getPerimeter(), 0.0);
    }
    public static void getPerimeterTest6(){
        Circle c = new Circle(6.0);
        Assert.assertEquals(c.getPerimeter(), 12.0*Math.PI);
    }
}
