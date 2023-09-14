class transpose{
    public static void main(String args[]){
        int arr1[][]={{1,2,3},{4,5,6},{7,8,9}};
        int i,j,k,flag=1;
        int tr[][]=new int [3][3];
        System.out.println("\n metrix befor transpose");
        for(i=0;i<3;i++){
            for(j=0;j<3;j++){
                System.out.print(arr1[i][j]+" ");
            }
            System.out.println();
        }
        for(i=0;i<3;i++){
            for(j=0;j<3;j++){
                tr[i][j]=arr1[j][i];
            }
        }
        System.out.println("\n metrix after transpose");
        for(i=0;i<3;i++){
            for(j=0;j<3;j++){
                System.out.print(tr[i][j]+" ");
            }
            System.out.println();
        }
        for(i=0;i<3;i++){
            for(j=0;j<3;j++){
                if( arr1[i][j]!=tr[i][j]){
                    flag=0;
                    break;
                }
            }
        }
        if(flag==0){
            System.out.println("\n not symmetric");
        }
        else{
            System.out.println("\n symmetric");
        }
    }
}