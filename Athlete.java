
/**
 * Write a description of class Athlete here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Athlete
{
    // instance variables - replace the example below with your own
    private String athleteName;
    private int age;
    public Athlete() {
        
    }
    public Athlete(String atnm, int yr) {
        this.athleteName = atnm;
        this.age = yr;
    }
    public boolean equals(Athlete other){
        if(this.athleteName.equals(other.athleteName) && this.age == other.age){
            return true;
        }
        else {
            return false;
        }
    }
    public String toString(){
        return "The name of this athlete is " + this.athleteName + " and the athlete's age is " + this.age + "\n";
    }
}
