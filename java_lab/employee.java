class employees{
    int code;
    int salary;
    String name;
    employees(int code,int salary,String name){
        this.code=code;
        this.salary=salary;
        this.name=name;
    }
    employees(){
        code=101;
        salary=20000;
        name="glodin";
    }
    void display(){
        System.out.println("\n code\n"+this.code+"\n salary\n"+this.salary+"\n name\n"+name);
    }
}
class employee{
    public static void main(String args[]){
        employees ob1=new employees(101,20000,"joseph");
        employees ob2=new employees();
        ob1.display();
        ob2.display();
    }
}