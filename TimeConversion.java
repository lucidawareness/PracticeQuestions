public class TimeConversion {
    public static void main(String[] args) {
        String s = "07:05:45PM";
        int time = Integer.parseInt(s.substring(0, 2));
        String t;

        if (s.endsWith("PM") && time < 12) {
            time += 12;
            t = time + s.substring(2, 8);
        } else if (s.endsWith("AM") && time == 12) {
            t = "00" + s.substring(2, 8);
        } else {
            t = s.substring(0, 8);
        }

        System.out.println(t);
    }
}
