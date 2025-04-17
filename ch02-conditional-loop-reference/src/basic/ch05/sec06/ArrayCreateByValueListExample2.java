package basic.ch05.sec06;

public class ArrayCreateByValueListExample2 {
    public static void main(String[] args) {
        int[] scores = new int[] {83,90,87};
        printItem(scores);
    }
    public static void printItem(int[] array){
        for (int i = 0 ; i < array.length ; i++ ){
            System.out.print("score[" + i + "]: ");
            System.out.println(array[i]);
        }
    }
}
