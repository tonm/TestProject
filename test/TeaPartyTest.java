import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by IntelliJ IDEA.
 * User: gluglad
 * Date: Sep 8, 2010
 * Time: 10:42:32 AM
 * To change this template use File | Settings | File Templates.
 */
@Test
public class TeaPartyTest {
    public void nameTest(){
        TeaParty t = new TeaParty();
        Assert.assertEquals(t.welcome("Google", true, false), "Hello Ms. Google");
        Assert.assertEquals(t.welcome("Google", false, true), "Hello Sir Google");
        Assert.assertEquals(t.welcome("Google", false, false), "Hello Mr. Google");
        try{t.welcome("Google", true, true);
        Assert.fail("Ms. and Sir");}
        catch(Exception IllegalArgumentException){}
    }
}
