package basic.ch05.sec10;

public class AdvancedForExample {
    public static void main(String[] args) {
        int sum = 0;
        double avg =0;
        int[] scores = {95,71,84,93,87};
        for ( int score : scores) {
            sum += score;
        }
        avg = (double) sum / scores.length;
        System.out.println("sum = "+ sum);
        System.out.println("avg = "+ avg);
    }
}
