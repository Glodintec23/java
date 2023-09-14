import java.util.*;
class employee{
    int eno;
    int salary;
    String name;
    employee(int eno,int salary,String name){
        this.eno=eno;
        this.salary=salary;
        this.name=name;
    }
    int show(){
        return this.eno;
    }
}
class company{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        employee e[]=new employee[5];
        int n,id,salary;
        String name;
        System.out.println("\n enter number of employees : ");
        n=sc.nextInt();
        sc.nextLine();
        for(int i=0;i<n;i++){
            System.out.println("\n enter name: ");
            name=sc.nextLine();
            System.out.println("\n enter id :");
            id=sc.nextInt();
            sc.nextLine();
            System.out.println("\n enter salary");
            salary=sc.nextInt();
            sc.nextLine();
            e[i]=new employee(id,salary,name);
        }
        System.out.println("\n enter the name to be searched :");
        int f=0;
        int ele = sc.nextInt();
        for(int i=0;i<n;i++){
            int h=e[i].show();
            if(ele==h){
                f=f+1;
            }
        }
        if(f>0){
            System.out.println("\n present");
        }
        else{
            System.out.println("\n not present");
        }
    }
}