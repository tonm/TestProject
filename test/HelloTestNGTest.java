/**
 * Created by IntelliJ IDEA.
 * User: gluglad
 * Date: Sep 8, 2010
 * Time: 9:32:57 AM
 * To change this template use File | Settings | File Templates.
 */
import org.testng.Assert;
import org.testng.annotations.Test;

@Test
public class HelloTestNGTest {
    static public void testGetReply(){
        HelloTestNG t = new HelloTestNG();
        Assert.assertEquals(t.getReply(), "Hello TestNG!");
    }
}
