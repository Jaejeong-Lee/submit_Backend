package basic.ch08.lecture;

public interface InterProduct {
    /*
     * 인터페이스는 상수 필드만 작성 가능
     * public static final -> 조합을 상수 필드
     */
    // public static final 숨어 있음(자동 완성해줌)
//    public static final int a = 0;
    int MIN_NUM = 10; // 상수는 대문자로 작성
    int MAX_NUM = 100;

    // 생성자를 가질 수 없음
//    public InterProduct() {} : (불가능)

    // 일반 메소드도 가질 수 없음.
//    public void nonStaticMethod() {};

    // * 추상 메소드만 작성 가능
    public abstract void nonStaticMethod();

    /*
    * 인터페이스 안에 작성한 메소드는 public abstract의 의미를 가진다.
    * 인터페이스를 상속받은 클래스는 메소드를 구현할 때,
    * 접근제어자를 public으로 해야 구현 가능하다.
    * (범위가 같거나 커야 하니까.)
     */
    // -> 앞에 public abstract 삭제 가능
    void abstMethod();

    // * static 메소드는 가능! (java 8버전 이후 가능)
    public static void staticMethod() {
        System.out.println("InterProduct 인터페이스에서 staticMethod 호출됨....");
    }

    // 인터페이스에서 일반 메소드를 만들기 위해서는 default 키워드를 붙여야 한다.
    public default void defaultMethod() {
        System.out.println("InterProduct 클래스의 defualtMethod 호출됨...");

        // default로 일반 메소드를 만들면 상속 가능!
        // 추상 메서드만 오버라이딩하면 되므로, 상속 시 이 default함수는 안 해도 됨.
    }

}
