class demosum{
    public static void main(String arg[]){
        int sum=0;
        int invalid=0;
        int num=0;
        for(int i=0;i<arg.length;i++){
            try{
                num=Integer.parseInt(arg[i]);
                sum=num+sum;
            }
            catch(NumberFormatException e){
                invalid=invalid+1;
            }
        }
        System.out.println("sum "+sum);
        System.out.println("invallid "+invalid);
    }
}