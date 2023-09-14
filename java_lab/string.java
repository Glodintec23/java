import java.util.Arrays;
class string{
    public static void main(String args[]){
        String name[]={"glodin","adrsh","seethalekshmi","baghya","devdathan"};
        int len=name.length;
        for(int i=0;i<len-1;i++){
            for(int j=i+1;j<len;j++){
                if(name[i].compareTo(name[j])>0){
                    String temp=name[i];
                    name[i]=name[j];
                    name[j]=temp;
                }
            }
        }
        System.out.println(Arrays.toString(name));
    }
}