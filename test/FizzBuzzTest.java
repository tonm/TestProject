import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by IntelliJ IDEA.
 * User: gluglad
 * Date: Sep 8, 2010
 * Time: 10:22:44 AM
 * To change this template use File | Settings | File Templates.
 */
@Test
public class FizzBuzzTest {
    public static void threeTest(){
        FizzBuzz f = new FizzBuzz();
        Assert.assertEquals(f.answer(9), "fizz");
        Assert.assertEquals(f.answer(3), "fizz");
        Assert.assertEquals(f.answer(-3), "fizz");
        Assert.assertEquals(f.answer(27), "fizz");
    }
    public static void fiveTest(){
        FizzBuzz f = new FizzBuzz();
        Assert.assertEquals(f.answer(5), "buzz");
        Assert.assertEquals(f.answer(-5), "buzz");
        Assert.assertEquals(f.answer(25), "buzz");
        Assert.assertEquals(f.answer(125), "buzz");
    }
    public static void threeFiveTest(){
        FizzBuzz f = new FizzBuzz();
        Assert.assertEquals(f.answer(15), "fizzbuzz" );
        Assert.assertEquals(f.answer(-15), "fizzbuzz" );
        Assert.assertEquals(f.answer(0), "fizzbuzz");
    }
    public static void neitherTest(){
        FizzBuzz f = new FizzBuzz();
        Assert.assertEquals(f.answer(7), "7");

    }
}
