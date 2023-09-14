import java.util.*;
class usernameexception extends Exception{
    public usernameexception(String msg){
        super(msg);
    }
}
class passwordexception extends Exception{
    public passwordexception(String msg){
        super(msg);
    }
}
class demoexception{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String name ="glodin";
        String pass="glodin123";
        System.out.println("enter name :");
        String user=sc.nextLine();
        System.out.println("enter password");
        String pas=sc.nextLine();
        try{
            if(!user.equals(name))
                throw new usernameexception("incorrect username");
            else if(!pas.equals(pass))
                throw new passwordexception("incorrect password");
            else
                System.out.println("login successful");
        }
        catch (usernameexception u){
            u.printStackTrace();
        }
        catch (passwordexception p){
            p.printStackTrace();
        }
    }
}