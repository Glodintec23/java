import java.util.*;
class stud_details{
    private int rollno;
    private String name;
    public int mark1;
    public int mark2;
    public int mark3;
    public stud_details(int num,String n,int m1,int m2, int m3){
        rollno=num;
        name=n;
        mark1=m1;
        mark2=m2;
        mark3=m3;
    }
    void display(){
        System.out.println(" rollno :"+rollno);
        System.out.println(" mark1 :"+mark1);
        System.out.println(" mark2 :"+mark2);
        System.out.println(" mark3 :"+mark3);
        System.out.println(" name :"+name);
        
    }
}
interface mark{
    public void calc();
}
class student extends stud_details implements mark{
    student(int num,String n,int m1,int m2,int m3){
        super(num,n,m1,m2,m3);
    }
    public void calc(){
        int total=mark1+mark2+mark3;
        int percentage=(total*100)/300;
        System.out.println("total"+total);
        System.out.println("percentage"+percentage);
        if(percentage>=80){
            System.out.println("A");
        }
        else if(percentage>=70 && percentage<=80){
            System.out.println("B");
        }
        else if(percentage>=60 && percentage <=70){
            System.out.println("C");
        }
        else if(percentage>=50 && percentage<=60){
            System.out.println("D");
        }
        else{
            System.out.println("fail");
        }
    }
    void display(){
        super.display();
    }
}
class marklist{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter name");
        String name=sc.nextLine();
        System.out.println("rollnumber");
        int roll=sc.nextInt();
        System.out.println("mark1");
        int mark1=sc.nextInt();
        System.out.println("mark2");
        int mark2=sc.nextInt();
        System.out.println("mark3");
        int mark3=sc.nextInt();
        student s1=new student(roll,name,mark1,mark2,mark3);
        s1.display();
        s1.calc();

    }
}
