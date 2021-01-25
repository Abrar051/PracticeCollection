public class ObjectMaker {
    private String email;
    private String password;
    private String username;
    ObjectMaker(String email , String username , String password)
    {
        this.email=email;
        this.username=username;
        this.password=password;
    }
    void printInfo ()
    {
        System.out.println("Your email is : "+this.email);
        System.out.println("Your password is : "+this.password);
    }
    void dataMatch ()
    {
        System.out.println("Data match");
    }
}
