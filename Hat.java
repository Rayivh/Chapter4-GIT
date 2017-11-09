
public class Hat
{
    // instance variables - replace the example below with your own
    private boolean Leather;
    private String Color;
    
    public Hat()
    {
        
    }
    public Hat(boolean lthr, String clr)
    {
        this.Leather = lthr;
        this.Color = clr;
    }
    
    public String getColor() {
        return this.Color;
    }
    public Hat makeHat(){
        Hat Top = new Hat(this.Leather,this.Color);
        return Top;
    }
    
    public String toString() {
        return "Is this Hat Leather? "+ this.Leather;
    }
}
