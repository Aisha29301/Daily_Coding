public class Test2 {
    public static void main(String[] args) {
        String s1 = "Welcome To  India";
        s1 = s1.trim();
        String rev = "";
        // String rev = new StringBuilder(s1).reverse().toString();
        String[] words = s1.split(" ");
        for(int i=words.length-1;i>=0;i--){
            rev += new StringBuilder(words[i]).reverse().append(" ");
        }
        System.out.println(rev);
    }
}
