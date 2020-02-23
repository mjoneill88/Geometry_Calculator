import java.util.Scanner;
import java.io.*;
import java.util.StringTokenizer;
/**
 * Write a description of class StudentTokenizerDriver here.
 *
 * @author Matthew O'Neill
 * @version 2/12/19
 */
public class StudentTokenizerDriver
{
    public static void main(String[] args) throws IOException
    {
        System.out.println("Hello");
        Scanner input = new Scanner(new File("studentdata.txt"));
        
        String str;
        
        String lastName;
        String firstName;
        String ID;
        int credits;
        double GPA;
        
        while(input.hasNext()){
            str = input.nextLine();
            StringTokenizer tokenizer = new StringTokenizer(str, ",");
            
            lastName = tokenizer.nextToken();
            firstName = tokenizer.nextToken();
            ID = tokenizer.nextToken();
            credits = Integer.parseInt(tokenizer.nextToken());
            GPA = Double.parseDouble(tokenizer.nextToken());
                
            Student student = new Student(lastName, firstName, ID, GPA, credits);
            
            System.out.println(student.toString());
        }
    }
}
