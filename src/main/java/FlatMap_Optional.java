import java.util.Collection;
import java.util.List;
import java.util.Optional;

public class FlatMap_Optional {


    public static void main(String[] args){
        Collection<User> users=  User.getUsers().values();


        Optional<String> strings= users.stream().map(e->e.getPhones().stream())
                .flatMap(s->s.filter(phone->phone.equals("0606060612"))).findAny();
        strings.ifPresent(phone-> System.out.println(phone));
    }
}
