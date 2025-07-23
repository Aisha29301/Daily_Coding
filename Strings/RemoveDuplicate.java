public class RemoveDuplicate {
    public static void main(String[] args) {
        String str = "programming";

        //using java 8
        StringBuilder sb1  = new StringBuilder();
        str.chars().distinct().forEach(c -> sb1.append((char)c));
        System.out.println(sb1);

        //
    }
}
