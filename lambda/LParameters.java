package lambda;

interface Add{
    int sum(int a,int b);
}
public class LParameters {
    public static void main(String[] args) {
        Add add = (a,b) -> a+b;
        System.out.println(add.sum(5,10));
    }
}
