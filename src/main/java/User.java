import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class User{
    private String usernmae;
    private String password;
    private int age=20;
    private double salaire;

    public double getSalaire() {
        return salaire;
    }

    public void setSalaire(double salaire) {
        this.salaire = salaire;
    }

    public int getAge() {
        return age;
    }

    private List<String> phones;

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
    public User(String usernmae,String password,int age,double salaire,List<String> phones){
        this.usernmae=usernmae;
        this.password=password;
        this.phones=phones;
        this.age=age;
        this.salaire=salaire;
    }
    @Override
    public String toString() {
        return "username: "+usernmae+"  password: "+password;
    }

    static HashMap<Long,User> getUsers(){
        HashMap<Long,User> collections=new HashMap<Long, User>();
        collections.put((long)1,new User("ismail","ktami",20, 55555,Arrays.asList("0606060612","222222222")));
        collections.put((long)3,new User("hassan","ktami",45, 124578,Arrays.asList("0606074612","1111111111")));
        collections.put((long)4,new User("ibrahim","ktami",12,100000, Arrays.asList("0606880612","9999999999")));
        collections.put((long)5,new User("khalid","ktami",47,20666 ,Arrays.asList("0606099612","1245745852")));
        return collections;
    }

    public List<String> getPhones() {
        return phones;
    }

    public void setPhones(List<String> phones) {
        this.phones = phones;
    }
}
