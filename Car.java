
/**
 * Write a description of class Car here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Car
{
    private int year;
    private String model;
    public Car() {
        
    }
    public Car(int yr,String nm){
        this.year = yr;
        this.model = nm;
    }
    public String getModel(){
        return this.model;
    }
    public String toString() {
        return "This car's model is " + this.model + "and is made by" + this.year;
    }
    public Car makeCar(int year, String Mustang){
        Car car1= new Car(this.year,this.model);
        return car1;
    }
    public boolean equals(Car other){
        if(this.model == other.model && this.year == other.year){
            return true;
        }
        else{
            return false;
        }
    }
}
