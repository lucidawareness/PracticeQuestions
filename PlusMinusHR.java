import java.util.ArrayList;
import java.util.List;

public class PlusMinusHR {
    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>();
            arr.add(-4);
            arr.add(-3);
            arr.add(-9);
            arr.add(0);
            arr.add(4);
            arr.add(1);
        // Write your code here
        int positives = 0;
        int zeds = 0;
        int negatives = 0;
        int arrLength = arr.size();

        for (Integer integer : arr) {
            if (integer > 0) {
                positives += 1;
            }
            if (integer == 0) {
                zeds += 1;
            }
            if (integer < 0) {
                negatives += 1;
            }
        }

        double positivesRatio = (double) positives / arrLength;
        double zedsRatio = (double) zeds/arrLength;
        double negativesRatio = (double) negatives/arrLength;

        System.out.println(positives);
        System.out.println(negatives);
        System.out.println(zeds);
        System.out.println(arrLength);

        System.out.println(positivesRatio);
        System.out.println(negativesRatio);
        System.out.println(zedsRatio);
    }


}
