class Student{
    String name;
    int age;
    float marks;
    public void printDetails(){
        System.out.println("name"+"\n "+this.name+" \n"+"age"+" \n"+this.age+"\n "+"marks"+" \n"+this.marks);
    }
}
public class Students{
    public static void main(String[]args){
        Student student1=new Student();
        student1.name="glodin";
        student1.age=24;
        student1.marks=8;
        student1.printDetails();

        Student student2=new Student();
        student2.name="baghya";
        student2.age=25;
        student2.marks=9;
        student2.printDetails();
    }
}