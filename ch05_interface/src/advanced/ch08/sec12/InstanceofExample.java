package advanced.ch08.sec12;

public class InstanceofExample {
    public static void main(String[] args) {
        Taxi taxi= new Taxi();
        Bus bus= new Bus();

        ride(taxi);
        System.out.println();
        ride(bus);
    }
    public static void ride(Vehicle v){
        if (v instanceof Bus) {
            ((Bus) v).checkFare();
            v.run();
        } else{
            v.run();
        }
    }
}
