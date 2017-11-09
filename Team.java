
/**
 * Write a description of class Team here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Team
{
    // instance variables - replace the example below with your own
    private String teamName;
    private Athlete athletename;
    private Athlete[] players;
    public Team(String nm, int size) {
        this.teamName = nm;
        players = new Athlete[size];
    }
    public void addAthlete(int index, Athlete a){
        players[index] = a;
    }
    public String toString (){
        String output = "The team " + teamName + "had the following: \n";
        for(Athlete a : players) {
            output += a + "\n";
        }
        return output;
    }
}
