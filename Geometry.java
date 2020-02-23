
/**
 * Write a description of class Geometry here.
 *
 * @author Matthew O'Neill
 * @version 3/12/19
 */
public class Geometry
{
    public static final double PI = 3.14159;
    
    
    public static double areaCircle(double radius)
    {
        if(radius < 0){
            System.err.print("Radius less than 0 Error:");
            return 0;
        }
        return PI * (radius * radius);
    }
    
    public static double areaRectangle(double length, double width)
    {
        if(length < 0 || width < 0){
            System.err.print("Width or length less than 0 error:");
            return 0;
        }
        return length * width;
    }
    
    
    public static double areaTriangle(double baseLength, double height)
    {
        if(baseLength < 0 || height < 0){
            System.err.print("Base or height less than 0 error:");
            return 0;
        }
        return .5 * baseLength * height;
    }
}
