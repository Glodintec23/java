class product{
    int price;
    int code;
    String name;
    product(int price,int code,String name){
        this.price=price;
        this.code=code;
        this.name=name;
    }
    void display(){
        System.out.println("\nprice\n"+this.price+"\ncode \n"+this.code+"\nname \n"+this.name);
    }
}
class productdemo{
    public static void main(String args[]){
        product ob1=new product(200,101,"pencil");
        product ob2=new product(300,102,"pen");
        product ob3=new product(400,103,"rubber");

        if(ob1.price>ob2.price && ob1.price>ob3.price){
            ob1.display();
        }
        else if(ob2.price>ob1.price && ob2.price>ob3.price){
            ob2.display();
        }
        else{
            ob3.display();
        }
    }
}