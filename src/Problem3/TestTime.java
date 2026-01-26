package Problem3;

public class TestTime {
    public static void main(String[] args) {
        Time t1 = new Time(0,0,0);
        Time t2 = new Time(0,0,0);

        t1.setTime(21,10,15);
        t2.setTime(10,20,25);

        System.out.printf("Time 1: " + t1 +"\n");
        System.out.println("Time 2: " + t2);
        System.out.println("\n");

        t1.nextSecond();
        t2.previousSecond();

        System.out.println("Time 1: " + t1.toString());
        System.out.println("Time 2: " + t2.toString());
    }
}
