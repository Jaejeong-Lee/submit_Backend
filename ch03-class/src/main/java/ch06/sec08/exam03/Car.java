package ch06.sec08.exam03;

public class Car {
    int gas;
    // 리턴값이 없는 메소드로 매개값을 받아서 gas 필드값을 변경
    void setGas(int gas) {
    }
    // 리턴값이 boolean인 메소드로 gas 필드값이 0이면 false를, 0이 아니면 true를 리턴
// 리턴하기전 조건에 따라 "gas가 없습니다" 또는 "gas가 없습니다" 출력
    boolean isLeftGas() {
    }
    // 무한 루프를 돌면서 루프를 한 번 돌 때마다 gas의 값은 1 감소
// 주행이 가능한 상태라면 "달립니다.(gas잔량: xxx)" 출력
// 주행할 수 없는 상태라면 "멈춥니다.(gas잔량: xxx)" 출력 후 메소드를 종료
    void run() {
    }
}
