class pens{
    String color;
    String type;
    public void write(){
        System.out.println("writing");
    }
    public void printColor(){
        System.out.println(this.color);
    }
    public void printType(){
        System.out.println(this.type);
    }
}
public class pen{
    public static void main(String[] args){
        pens pen1=new pens();
        pens pen2=new pens();
        // pen1
        pen1.color="blue";
        pen1.type="ball";
        pen1.printColor();
        pen1.printType();
        pen1.write();
        //pen2
        pen2.color="red";
        pen2.type="gel";
        pen2.printColor();
        pen2.printType();
        pen2.write();
    }
}