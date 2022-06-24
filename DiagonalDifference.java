import java.util.ArrayList;
import java.util.List;

public class DiagonalDifference {
    public static void main(String[] args) {
        List<List<Integer>> arr = new ArrayList<>();
        int diagonal = 0;

        for (int i = 0; i < arr.size(); i++) {
            diagonal += arr.get(i).get(i);
            diagonal -= arr.get(i).get(arr.size() - (i+1));
        }

        System.out.println(Math.abs(diagonal));
    }
}
