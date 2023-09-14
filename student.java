import java.util.Scanner;
public class student{
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        int id=sc.nextInt();
        sc.nextLine();
        String name=sc. nextLine();
        char gender=sc.next().charAt(0);
        float mark1=sc.nextFloat();
        float mark2=sc.nextFloat();
        float mark3=sc.nextFloat();
        double result=mark1+mark2+mark3;
        System.out.println("name of student :"+name+" "+"gender of student"+" "+gender);
        System.out.println("total result is :"+result);
    }
}
