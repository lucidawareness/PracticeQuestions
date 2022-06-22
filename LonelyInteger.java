import java.util.ArrayList;
import java.util.List;

public class LonelyInteger {
    public static void main(String[] args) {
        List<Integer> a = new ArrayList<>();
        a.add(0);
        a.add(0);
        a.add(1);
        a.add(2);
        a.add(1);
        int x = 0;

        for(int iter : a){
            x ^= iter;
        }

        System.out.println(x);
    }
}
