
/**
 * Write a description of class CarDriver here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class CarDriver
{
    public static void main(String[] args){
        Car myCar = new Car(2012, "Mustang");
        Car yourCar = new Car(2014, "Mustang");
        System.out.println(myCar);
        System.out.println(yourCar);
        System.out.println(myCar.equals(yourCar));
    }
}

