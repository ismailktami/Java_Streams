import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.function.Predicate;

public class FilterExample {
    public static void main(String[] args){
// Example List
        List<String> names= Arrays.asList("ismail","hassan","ibrahim");


        System.err.println("Filter by name ! ismail");
        names.stream().filter(new Predicate<String>() {
            @Override
            public boolean test(String name) {
                return !name.equals("ismail");
            }
        }).forEach(s -> System.out.println(s));

 //Example Collection User id;
        HashMap<Long,User> collections=User.getUsers();


        System.err.println("For each");
        collections.keySet().stream().forEach(e->{
            System.out.println(collections.get(e));
        });

        System.err.println("distinct");
        collections.values().stream().distinct().forEach(e-> System.out.println(e));

    }




}
