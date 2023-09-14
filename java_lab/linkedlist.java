import java.util.LinkedList;
public class linkedlist{
    public static void main(String args[]){
        LinkedList<String>lst=new LinkedList<>();
        lst.add("apple");
        lst.add("mangoes");
        lst.add("pineapple");
        lst.add("banana");
        System.out.println("items in linked list are"+lst);
        lst.clear();
        System.out.println("after clearing "+lst);
    }
}