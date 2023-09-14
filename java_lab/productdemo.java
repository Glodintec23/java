class product {
    int product_code;
    int product_price;
    String product_name;
    product(int pcode,int price, String pname  ){
        product_code=pcode;
        product_price=price;
        product_name=pname;
    }
    void display(){
        System.out.println("\n product_code"+product_code+"\n product_price"+product_price+"\n product_name"+product_name);
    }
}
class productdemo{
    public static void main(String args []){
    product ob1=new product(101,200,"kitkat");
    product ob2=new product(102,105,"munch");
    product ob3=new product(103,250,"milkynar");

    if(ob1.product_price<ob2.product_price && ob1.product_price<ob3.product_price){
        System.out.println("product with less price is");
        ob1.display();
    }
    else if(ob2.product_price<ob1.product_price && ob2.product_price<ob3.product_price){
    System.out.println("product with lowest price is");
    ob2.display();
    }
    else {
        System.out.println("product with lowest price is");
        ob3.display();
    }
}
}