import java.util.Comparator;
import java.util.HashMap;
import java.util.List;

public class MaxMin {
    public static void main(String[] args) {
        HashMap<Long,User> users = User.getUsers();


        //Find max salaire
        users.values().stream().max(Comparator.comparing(user -> user.getSalaire())).ifPresent(user -> System.err.println("max salaire "+user));


        //Find Max
        users.values().stream().min(Comparator.comparing(user -> user.getSalaire())).ifPresent(user -> System.err.println("min salaire "+user));

        //Max to Min
        users.values().stream().sorted(Comparator.comparingDouble(User::getSalaire).reversed()).forEach(user -> System.out.println(user));

        //Find 10 first

        System.err.println("2 premiers salaires");
        users.values().stream().sorted(Comparator.comparing(User::getSalaire).reversed()).limit(2).forEach(e-> System.out.println(e));

        System.out.println("---------------------");
        System.out.println(users.values().stream().toString());

    }
}
