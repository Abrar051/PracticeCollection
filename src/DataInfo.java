import java.util.*;
public class DataInfo {
    public static String email="";
    public static String username="";
    public static String password="";
    public static void main (String args[])
    {
        Scanner input = new Scanner(System.in);
        List<ObjectMaker> user = new ArrayList<>();
        System.out.println("Enter number of users : ");
        int userNumber = input.nextInt();
        for (int i =0;i<userNumber;i++)
        {
            System.out.print("Enter email : ");
            String email = input.next();
            System.out.print("Enter username : ");
            String username = input.next();
            System.out.print("Enter password : ");
            String password = input.next();
            ObjectMaker obj = new ObjectMaker(email , username , password);
            user.add(obj);
        }
        System.out.println(user);
        //Data matching
        System.out.print("Enter email : ");
        String email = input.next();
        System.out.print("Enter password : ");
        String password = input.next();
    }
}
