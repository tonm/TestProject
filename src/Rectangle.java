/**
 * Created by IntelliJ IDEA.
 * User: gluglad
 * Date: Sep 8, 2010
 * Time: 9:43:53 AM
 * To change this template use File | Settings | File Templates.
 */
public class Rectangle {
    private double length, width;
 public Rectangle(double l, double w){
 length = l;
     width = w;
 }

    public double getPerimeter(){
        return (2*length + 2*width);

    }

    public double getArea(){
        return (length * width);
    }
}
