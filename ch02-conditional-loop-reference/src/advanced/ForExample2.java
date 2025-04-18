package advanced;

public class ForExample2 {
    public static void main(String[] args) {
        for (int i = 0 ; i <5 ; i++){
            String star = "*";
            for (int j=0; j < i ; j++) {
                System.out.print(star);
            }
            System.out.println(star);
        }
    }
}
