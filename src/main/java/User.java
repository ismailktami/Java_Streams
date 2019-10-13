import java.util.HashMap;

public class User{
    private String usernmae;
    private String password;
    private int age=20;

    public int getAge() {
        return age;
    }

    public String getUsernmae() {
        return usernmae;
    }

    public String getPassword() {
        return password;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setUsernmae(String usernmae) {
        this.usernmae = usernmae;
    }

    public User(String usernmae,String password){
        this.usernmae=usernmae;
        this.password=password;
    }

    @Override
    public String toString() {
        return "username: "+usernmae+"  password: "+password;
    }

    static HashMap<Long,User> getUsers(){
        HashMap<Long,User> collections=new HashMap<Long, User>();
        collections.put((long)1,new User("ismail","ktami"));
        collections.put((long)3,new User("hassan","ktami"));
        collections.put((long)4,new User("ibrahim","ktami"));
        collections.put((long)5,new User("khalid","ktami"));
        return collections;
    }

}
