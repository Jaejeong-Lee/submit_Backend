package basic.ch05.sec09;

public class ArrayCopyByForExample {
    public static void main(String[] args) {
        int[] oldIntArray = {1,2,3};
        int[] newIntArray = new int[5];

        for (int i =0 ; i <5;i++){
            if (i<3) {
                newIntArray[i] = oldIntArray[i];
            } else {
                newIntArray[i] = 0;
            }
        }
        for (int i =0 ; i <5;i++){
            System.out.print(newIntArray[i]+", ");
        }
    }
}
