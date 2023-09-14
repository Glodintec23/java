import java.util.*;
interface shape{
    double area();
    double perimeter();
}
class circle implements shape{
    private double radius;
    public circle(double radius){
        this.radius=radius;
    }
    public double area(){
        return Math.PI*radius*radius;
    }
    public double perimeter(){
        return 2*Math.PI*radius;
    }
}
class rectangle implements shape{
    private double length;
    private double width;
    public rectangle(double length,double width){
        this.length=length;
        this.width=width;
    }
    public double area(){
        return length*width;
    }
    public double perimeter(){
        return 2*(length*width);
    }
}
public class Area_perimeter{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        while(true){
            System.out.println("\n  menu");
            System.out.println("\n 1 circle");
            System.out.println("\n 2 rectangle");
            System.out.println("\n 3 exit");
            System.out.println("\n enter choice");
            int choice = sc.nextInt();
            switch(choice){
                case 1:
                    System.out.println("enter radius");
                    double radius = sc.nextDouble();
                    circle c1=new circle(radius);
                    System.out.println(c1.area());
                    System.out.println(c1.perimeter());
                    break;
                case 2:
                    System.out.println("length :");
                    double length=sc.nextDouble();
                    System.out.println("width :");
                    double width=sc.nextDouble();
                    rectangle r1=new rectangle(length,width);
                    System.out.println(r1.area());
                    System.out.println(r1.perimeter());
                    break;
                case 3:
                    System.exit(0);
                case 4:
                    System.out.println("invallid");
                    break;
            }
        }
    }
}