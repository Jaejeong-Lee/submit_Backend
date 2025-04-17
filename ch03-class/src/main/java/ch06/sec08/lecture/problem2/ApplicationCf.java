package ch06.sec08.lecture.problem2;

import ch06.sec08.lecture.problem.Monster;
// 그대로 class 복사하면 import문이 생김.
// => ch06.sec08.lecture.problem.Monster(이게 실제 이름)가 아니라
//  Monster로만 사용할 수 있게 됨.

public class ApplicationCf {
    public static void main(String[] args) {
        // 드라큘라(200), 프랑켄슈타인(300), 미이라(400)

        ch06.sec08.lecture.problem.Monster dracullar = new ch06.sec08.lecture.problem.Monster();
        // -> 대신 import가 되면 Monster만 사용하게 됨.
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
