/**
 * Created by IntelliJ IDEA.
 * User: gluglad
 * Date: Sep 8, 2010
 * Time: 10:15:37 AM
 * To change this template use File | Settings | File Templates.
 */
public class FizzBuzz {
    String answer(int number){
        if((number % 3 == 0) && (number%5 == 0))
            return "fizzbuzz";

        else if (number%5 == 0){
            return "buzz";
        }

        else if (number%3 == 0){
            return "fizz";
        }

        else return Integer.toString (number);
    }
}
