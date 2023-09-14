class shapes{
    int x;
    int y;
    double z;
    void cal(int l){
        x=l;
        System.out.println("\n area of square :"+x*x);
    }
    void cal(int l ,int b){
        x=l;
        y=b;
        System.out.println("\n area of triangle is :"+0.5*x*y);
    }
    void cal(double a){
        z=a;
        System.out.println("\n area of circle is :"+3.14*z*z);
    }
}
class shapesdemo{
    public static void main(String args[]){
        shapes s=new shapes();
        s.cal(5);
        s.cal(4,5);
        s.cal(3);
    }
}