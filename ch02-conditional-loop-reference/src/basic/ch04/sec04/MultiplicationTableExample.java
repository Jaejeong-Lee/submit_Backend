package basic.ch04.sec04;

public class MultiplicationTableExample {
    public static void main(String[] args) {
        int ans = 0;
        for (int i = 2 ; i <= 9; i++){
            System.out.println("*** "+i+"단 ***");
            for ( int j= 1; j<=9; j++){
                ans = i * j;
                System.out.println(i+" X "+j+" = "+ans);
            }
        }
    }
}
