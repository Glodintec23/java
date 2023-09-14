class cpu{
    int price;
    cpu(int price){
        this.price=price;
    }
    void display(){
        System.out.println("\n price is  :"+this.price);
    }
    class processor{
        int core;
        String manufacture;
        processor(int core,String manufacture){
            this.core=core;
            this.manufacture=manufacture;
        }
    void display(){
        System.out.println("\n core :"+this.core+"\n manufacture :"+this.manufacture);
    }
    }
    public static class ram{
        int memory;
        String name;
        ram(int memory,String name){
            this.memory=memory;
            this.name=name;
        }
    void display(){
        System.out.println("\n memory:"+this.memory+"\n name:"+this.name);
    }
    }
    public static void main(String args[]){
        cpu cpu1 =new cpu(1200);
        cpu1.display();
        cpu.processor processor1=cpu1.new processor(5,"intel");
        processor1.display();
        cpu.ram ram1=new cpu.ram(6000,"amd");
        ram1.display();
    }
}