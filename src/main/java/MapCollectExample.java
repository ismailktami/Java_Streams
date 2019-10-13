import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

public class MapCollectExample {

public static void main(String[] args){

    HashMap<Long,User> collections=User.getUsers();
    List<Boolean> result = collections.values().stream().map(e->{
       return (e.getUsernmae().equals("ismail"));
    }).collect(Collectors.toList());
    result.stream().forEach(e-> System.out.println(e));



}



}
