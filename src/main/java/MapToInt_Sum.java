import java.util.HashMap;

public class MapToInt_Sum  {

    public static  void main(String[] args ){
        HashMap<Long,User> users=User.getUsers();

        //Moyen age dans HashMap<Long,User> avec API stream
        int moyen_age=users.values().stream().skip(1).mapToInt(User::getAge).sum()/users.size();
        System.out.println(moyen_age);
    }
}
