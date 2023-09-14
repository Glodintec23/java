class product{
    private int productid;
    private String name;
    private int quantity;
    private double unitprice;
    public product(int id,String pname,int pquantity,double punitprice){
        productid=id;
        name=pname;
        quantity=pquantity;
        unitprice=punitprice;
    }
    public double total(){
        return quantity*unitprice;
    }
    public void display(){
        System.out.printf("%-10d%-10s%-10d%-15.2f%-10.2f%n",productid,name,quantity,unitprice,total());
    }
}
public class bill{
    public static void main(String args[]){
        product p1=new product(101,"glodin",200,100.0);
        product p2=new product(102,"joseph",100,90.0);
        double t1=p1.total();
        double t2=p2.total();
        double t3=t1+t2;
        System.out.println("id name quantity unitprice total");
        p1.display();
        p2.display();
    }
}