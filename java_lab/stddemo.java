class studentdetails{
    int r;
    String n;
    void details(int rollno,String name){
        r=rollno;
        n=name;
        System.out.println("\n roll_nuamber "+r+"\n name "+n);
    }
}
class marks extends studentdetails{
    int n1,n2,n3,n4;
    void mark(int m1,int m2,int m3,int m4){
        n1=m1;
        n2=m2;
        n3=m3;
        n4=m4;
        System.out.println("\n markes are "+n1+" "+n2+" "+n3+" "+n4);
    }
}
class total extends marks{
    int t;
    void total(){
        t=n1+n2+n3+n4;
        System.out.println("\n total is "+t);

    }
}
class stddemo{
    public static void main(String args[]){
        total s1 =new total();
        s1.details(1001,"glodin");
        s1.mark(45,55,43,42);
        s1.total();
    }
}