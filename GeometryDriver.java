
/**
 * Write a description of class GeometryDriver here.
 *
 * @author Matthew O'Neill
 * @version 3/12/19
 */

import java.util.Scanner;

public class GeometryDriver
{
    
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        String playChoice = "y";
        
        while(playChoice.equals("quit") == false){
            System.out.println("What area do you want to calculate");
            System.out.println("1. for area of a circle");
            System.out.println("2. for area of a rectangle");
            System.out.println("3. for area fo a triangle");
            System.out.println("quit");
            
            playChoice = input.next();
            
            if(playChoice.equals("1")){
                System.out.println("What is the radius of the circle?");
                double radius = input.nextDouble();
                
                System.out.println(Geometry.areaCircle(radius));
            }
            else if(playChoice.equals("2")){
                System.out.println("What is the length of the rectangle");
                double length = input.nextDouble();
                
                System.out.println("What is the width of the rectangle?");
                double width = input.nextDouble();
                
                System.out.println(Geometry.areaRectangle(length, width));
            }
            else if(playChoice.equals("3")){
                System.out.println("What is the base length of the triangle?");
                double base = input.nextDouble();
                
                System.out.println("What is the height of the triangle?");
                double height = input.nextDouble();
                
                System.out.println(Geometry.areaTriangle(base, height));
            }
            //System.out.println("Do you want to continue playing, input quit to stop:");
            //playChoice = input.next();
        }
        
        
        
        System.out.println("The program is done");
    }
}
