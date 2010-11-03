/**
 * Created by IntelliJ IDEA.
 * User: gluglad
 * Date: Sep 8, 2010
 * Time: 10:35:24 AM
 * To change this template use File | Settings | File Templates.
 */
public class TeaParty {
    public String welcome(String lastName, boolean isWoman, boolean isSir)
    {
        if(isSir && isWoman)
        {
            throw new IllegalArgumentException("Can't be woman and man!\n");
        }
        return "Hello " + ((isWoman)?"Ms. ":(isSir)?"Sir ":"Mr. ") + lastName;
    }
}
