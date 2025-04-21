package basic.ch07.sec07.exam03;

public class ChildExample {
    public static void main(String[] args) {
        Parent parent = new Child();
        
        parent.field1 = "data1";
        parent.method1();
        parent.method2();

        // parent 공간에는 child 고유영역(parent와 겹치지 않는 영역)에서
        // 추가로 선언한 field2, method3이 없으므로
        // 둘은 사용할 수 없다.
//        parent.field2 = "data2";
//        parent.method3();

        Child child = (Child) parent;

        child.field2 = "data2";
        child.method3();
        // child 로 클래스 강제 형변환을 했기 때문에
        // field2와 method3을 사용할 수 있게 된다.
    }
}
