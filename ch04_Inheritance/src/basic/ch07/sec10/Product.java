package basic.ch07.sec10;

public abstract class Product {
    private int nonStaticField;
    private static int StaticField;

    public Product() {
    }

    public abstract void abstMethod();

    public void nonStaticMethod(){
        System.out.println("추상클래스 안의 nonStaticMethod() 호출됨!");
    };
    public static void StaticMethod(){
        System.out.println("추상클래스 안의 staticMethod() 호출됨!");
    };
}
