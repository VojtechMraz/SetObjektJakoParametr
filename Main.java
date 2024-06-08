import java.util.HashSet;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("jedna");
        set.add("jedna");
        set.add("dva");
        
        System.out.println(returnSize(set));
    }

    public static int returnSize(Set set){
        return set.size();
    }

}
