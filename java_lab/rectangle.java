package graphic;
public class rect{
    private double length;
    private double width;
    public rect(double len,double wid){
        length=len;
        width=wid;
    }
    public double calculate_area(){
        return length*width;
    }
}