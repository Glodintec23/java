class student{
    int rollno;
    String name;
    int mark1;
    int mark2;
    int total;
    student(int rollno,String name,int mark1,int mark2){
        this.rollno=rollno;
        this.name=name;
        this.mark1=mark1;
        this.mark2=mark2;
    }
    void total(){
        total=this.mark1+this.mark2;
        System.out.println("\n name :"+this.name+"\n rollno :"+this.rollno+"\n mark1 :"+this.mark1+"\n mark2 :"+this.mark2+"\n total :"+total);
    }

}
class students{
    public static void main(String args[]){
        int roll=Integer.parseInt(args[0]);
        int m1=Integer.parseInt(args[2]);
        int m2=Integer.parseInt(args[3]);

        student stud1=new student(roll,args[1],m1,m2);
        stud1.total();
    }
}