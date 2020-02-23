
/**
 * An class to demsonstrate the equals( ) and the
 * compareTo( ) methods.
 * 
 * @author L. Lehmann 
 * @version v1
 */
public class Student
{
    
    private String lastName;
    private String firstName;
    private String ID;
    private int creditHours;
    private double gpa;
   
    public Student()
    {
        lastName = new String("unknown");
        firstName = new String("unknown");
        ID = new String("unknown");
        creditHours = 0;
        gpa = 0.0;
        
           
    }
    
    public Student(String inLast, String inFirst, String inID, double inGPA, int inCredits)
    {
        lastName = new String(inLast);
        firstName = new String(inFirst);
        ID = new String(inID);
        creditHours = inCredits> 0?inCredits:0;
        gpa = inGPA > 0?inGPA:0;
       
    }
      
    public String toString( )
    {   return  "\nStudent Name: " + this.lastName + ", " + firstName
               + "\tID: " + this.ID + "\tGPA: " + this.gpa + "\tCredits: " + creditHours;
    }
   
    public void setGPA(double inG)
    {
        gpa = inG >= 0? inG:gpa;
    }
    
     public void setCredits(double inCredits)
    {
        gpa = inCredits >= 0? inCredits:inCredits;
    }  
}
