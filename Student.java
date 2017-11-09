
// ****************************************************************
//   Student.java
//
//   Define a student class that stores name, score on test 1, and
//   score on test 2.  Methods prompt for and read in grades,
//   compute the average, and return a string containing student's info.
// ****************************************************************
import java.util.Scanner;
public class Student
{
    //declare instance data
    private String studentName;
    private int test1;
    private int test2;
    //constructor
    
    public Student(String name)
    {
        studentName = name;
        //add body of constructor
    }
    
    //inputGrades: prompt for and read in student's grades for test1 and test2.
    //Use name in prompts, e.g., "Enter's Joe's score for test1".
    //-----------------------------------------------
    public void inputGrades()
    {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Test1");
        test1 = scan.nextInt();
        
        System.out.println("Test2");
        test2 = scan.nextInt();
        
    }
    //-----------------------------------------------
    //getAverage: compute and return the student's test average
    //-----------------------------------------------
    public double getAverage() 
    {
        return (test1 + test2) / 2.0;
    }
    //-----------------------------------------------
    //getName: return the student's name
    public String getName() {
        return this.studentName;
    }
    //-----------------------------------------------
    public void printName() {
        System.out.println("This student's name is " + this.studentName);
    }
    
    public String toString() {
        return "Name: " + this.studentName + "Test1: " + this.test1 + "Test2:" + this.test2;
    }
}
