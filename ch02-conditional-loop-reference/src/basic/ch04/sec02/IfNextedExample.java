package basic.ch04.sec02;


public class IfNextedExample {
    public static void main(String[] args) {
        int score = (int)(Math.random()*20)+81;
        System.out.println("점수: " + score);
        String grade = "A";

        if (score >= 81) {
            grade = "B";
            if (score >= 85) {
                grade = "B+";
                if (score >= 90) {
                    grade = "A";
                    if (score >= 95) {
                        grade = "A+";
                    }
                }
            }
        }
        System.out.println("학점 : "+ grade);
    }
}
