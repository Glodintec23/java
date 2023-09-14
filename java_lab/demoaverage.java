import java.util.*;
class negativeexception extends Exception{
    public negativeexception(){
        super("negative input is not allowed");
    }
}
class demoaverage{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number :");
        int n=sc.nextInt();
        int sum=0;
        int count=0;
        for(int i=0;i<n;i++){
            try{
                System.out.println("enter integer");
                int num=sc.nextInt();
                if(num<0){
                    throw new negativeexception();
                }
                sum+=num;
                count++;
            }
            catch(negativeexception e){
                System.out.println(e.getMessage());
            }
        }
        double avg=sum/n;
        System.out.println("average is "+avg);
    }
}