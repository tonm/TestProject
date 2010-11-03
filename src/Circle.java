/**
 * Created by IntelliJ IDEA.
 * User: gluglad
 * Date: Sep 8, 2010
 * Time: 10:00:32 AM
 * To change this template use File | Settings | File Templates.
 */
public class Circle {
    private double radius;
    public Circle(double radius){
        if (radius < 0){
            throw new IllegalArgumentException("negative radius");
        }
        this.radius = radius;
    }

    public double getPerimeter(){
        return (2*Math.PI*radius);
    }

    public double getArea(){
        return (Math.PI * radius * radius);
    }
}
