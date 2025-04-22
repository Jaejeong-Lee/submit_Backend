package com.ohgiraffers.hw1.run;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[][] students = new String[3][6];
        for (int i = 0 ; i < 3 ; i++) {
            for (int j = 0; j < 6; j++) {
                students[i][j] = sc.nextLine();
            }
        }



        // 1번 : 학생 정보를 모두 출력하세요
        // 3명의 학생 정보를 기록할 수 있게 객체 배열 할당
        // 위의 사용데이터 참고하여 3명의 학생 정보 초기화
        // 위의 학생 정보 모두 출력 --> 향상된 for문 이용해서



        // 2번 : 사원정보를 입력받고 기록 할 수 있게 하세요
        // 최대 10명의 사원 정보를 기록할 수 있게 배열을 할당
        // 사원들의 정보를 키보드로 계속 입력 받고 --> while(true) 무한 반복문을 통해
        // 계속 추가할 것인지 물어보고, 대소문자 상관없이 ‘y’이면 계속 객체 추가
        // 한 명씩 추가 될 때마다 카운트함

        // 2명 정도의 사원 정보를 입력 받아 객체 배열에 저장
        // 현재 기록된 사원들의 정보를 모두 출력

    }
}
