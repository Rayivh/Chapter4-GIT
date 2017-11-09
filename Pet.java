public class Pet
{
    private String breed;
    private String name;
    private Pet toy;
    
    private static int numPets;
    public Pet()
    {
        
    }
    public Pet(String bd, String nm)
    {
        this.breed = bd;
        this.name = nm;
        numPets++;
    }
    public String getName() {
        return this.name;
    }
    //public String mixBreed() {
    //    return this.breed + toy.breed;
    //}
    public Pet makePet(){
        Pet bear = new Pet(this.breed, toy.name);
        return bear;
    }
    public String toString() {
        return "The Pet's name is "+ this.name;
    }
    
    public boolean equals(Pet other){
        if(this.breed.equals(other.name)){
            return true;
        }
        else {
            return false;
        }
    }
    
    public static void example(){
        System.out.print("This is in a static method");
    }
    
}