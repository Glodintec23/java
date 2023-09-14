import java.util.*;
class emp{
    int empid,salary;
    String name,address;
    emp(int eid,int sal,String n,String add){
        empid=eid;
        salary=sal;
        name=n;
        address=add;
    }
}
class teacher extends emp{
    String dep,sub;
    teacher(int eid,int sal,String n,String add,String d,String s){
        super(eid,sal,n,add);
        dep=d;
        sub=s;
    }
    void dispaly(){
        System.out.println("\n id"+empid);
        System.out.println("\n name"+name);
        System.out.println("\n salary"+salary);
        System.out.println("\n address"+address);
        System.out.println("\n department"+dep);
        System.out.println("\n subject"+sub);
    }
}
class arrayobject{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        teacher t[]=new teacher[5];
        System.out.println("enter the range");
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            System.out.println("enter id");
            int id =sc.nextInt();
            sc.nextLine();
            System.out.println("enter salary");
            int salary=sc.nextInt();
            sc.nextLine();
            System.out.println("enter name");
            String name=sc.nextLine();
            System.out.println("enter address");
            String address=sc.nextLine();
            System.out.println("enter department");
            String dep=sc.nextLine();
            System.out.println("enter subject");
            String sub=sc.nextLine();

            t[i]= new teacher(id,salary,name,address,dep,sub);
        }
        for(int i=0;i<n;i++){
            t[i].dispaly();
        }
    }
}