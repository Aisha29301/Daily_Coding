package lambda;

public class Thread {

    public static void main(String[] args) {
        Runnable r = () -> System.out.println("thread running using lambda");
        r.run();
    }
}
