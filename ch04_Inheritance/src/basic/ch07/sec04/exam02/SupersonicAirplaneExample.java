package basic.ch07.sec04.exam02;

public class SupersonicAirplaneExample {
    public static void main(String[] args) {
        SuperSonicAirplane sa = new SuperSonicAirplane(); //1
        sa.takeOff();
        sa.fly();
        /*
            public void fly() {
                System.out.println("일반 비행합니다.");
         */
        sa.flyMode = SuperSonicAirplane.SUPERSONIC; //2
        sa.fly();
        /*
            @Override
            public void fly() {
                if(flyMode == SUPERSONIC) {
                    System.out.println("초음속 비행합니다.")
                } else {
                    super.fly();
                }
            }
         */
        sa.flyMode = SuperSonicAirplane.NORMAL; //1
        sa.fly();
        sa.land();
    }
}
