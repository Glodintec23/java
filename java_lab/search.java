class search{
    public static void main(String args[]){
        int ar[]=new int[10];
        int i,j,k,flag=0;
        int len=args.length;
        int l=len-1;
        int n=Integer.parseInt(args[l]);
        System.out.println("\n size of the string :"+l);
        for(i=0;i<l;i++){
            ar[i]=Integer.parseInt(args[i]);
        }
        for(i=0;i<l;i++){
            for(j=0;j<l;j++){
                if(ar[i]<ar[j]){
                    int temp =ar[i];
                    ar[i]=ar[j];
                    ar[j]=temp;
                }
            }
        }
        System.out.println("\n element to be srarched is"+n);
        for(i=0;i<l;i++){
            for(j=0;j<l;j++){
                if(ar[i]==n){
                    flag=1;
                    break;
                }
            }
        }
        if(flag==1){
            System.out.println("\n element found");
        }
        else{
            System.out.println("\nelement not found");
        }
    }
}