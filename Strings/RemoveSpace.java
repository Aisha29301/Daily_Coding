public class RemoveSpace {
    public static void main(String[] args) {
        String s = " J a  v a ";
        // s = s.trim(); //this only remove leading and trailing space of string
        s = s.replaceAll("\\s", "");

        System.out.println(s);
    }
}
