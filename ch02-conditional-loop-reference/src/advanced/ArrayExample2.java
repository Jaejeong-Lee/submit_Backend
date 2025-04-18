package advanced;

public class ArrayExample2 {
    public static void main(String[] args) {
        int[] array = {1,5,3,8,2};
        int maxNum = 0;

        for (int item : array){
            if (item > maxNum){
                maxNum = item;
            }
        }
        System.out.println("maxNum = "+ maxNum);
    }
}
