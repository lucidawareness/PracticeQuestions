import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MiniMaxSum {
    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(5);
        Collections.sort(arr);

        Long lowestSum = 0l;
        lowestSum += arr.get(0);
        lowestSum += arr.get(1);
        lowestSum += arr.get(2);
        lowestSum += arr.get(3);

        Long highestSum = 0l;
        highestSum += arr.get(arr.size()- 1);
        highestSum += arr.get(arr.size()- 2);
        highestSum += arr.get(arr.size()- 3);
        highestSum += arr.get(arr.size()- 4);

        System.out.println(lowestSum + " " + highestSum);
    }
}
