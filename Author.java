public class Author
{
    // instance variables - replace the example below with your own
    private String name;
    private int age;
  
    public Author(String nm, int yr)
    {
        // initialise instance variables
        this.name = nm;
        this.age = yr;
    }
    
    public String toString() {
        return "The name of the author is: " + this.name;
    }
}
