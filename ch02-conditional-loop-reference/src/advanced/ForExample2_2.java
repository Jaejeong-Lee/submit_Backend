package advanced;

public class ForExample2_2 {
    public static void main(String[] args) {
        for (int i = 5 ; i > 0 ; i--){
            String star = "*";
            for (int j=0; j < i-1 ; j++) {
                System.out.print(star);
            }
            System.out.println(star);
        }
    }
}
