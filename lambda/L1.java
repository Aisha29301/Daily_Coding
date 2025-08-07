package lambda;
@FunctionalInterface
interface A{
    void show();
}

public class L1 {
    public static void main(String[] args) {
        A a = () -> System.out.println("defining show method");
        a.show();
    }
}
