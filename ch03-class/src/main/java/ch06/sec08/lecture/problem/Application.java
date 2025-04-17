package ch06.sec08.lecture.problem;

public class Application {
    public static void main(String[] args) {
        // 드라큘라(200), 프랑켄슈타인(300), 미이라(400)

        Monster dracullar = new Monster();
        dracullar.setKinds("드라큘라");
        dracullar.setHp(200);
//        dracullar.hp; // hp는 private으로 설정했기 때문에 에러
        // -> getter, setter 사용(alt + insert)

        Monster frankenstuein = new Monster();
        frankenstuein.setKinds("프랑켄슈타인");
        frankenstuein.setHp(300);

        Monster mira = new Monster();
        mira.setKinds("미이라");
        mira.setHp(400);;

        // 문제점 1. 여기서 name 대신 kinds로 바꾼다면? -> 일일이 코드에 name을 다 수정해야 함.
        // -> getter , setter 사용

    }
}
