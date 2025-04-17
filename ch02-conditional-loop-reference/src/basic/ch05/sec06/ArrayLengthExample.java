package basic.ch05.sec06;

public class ArrayLengthExample {
    public static void main(String[] args) {
        int[] arr = {84,90,96};
        int sum = 0;
        double avg = 0;
        for ( int a : arr){
            sum += a;
        }
        avg = (double) sum / arr.length;
        System.out.println(sum);
        System.out.println(avg);
    }
}
