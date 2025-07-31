import java.util.HashSet;
import java.util.LinkedHashSet;

public class RemoveDuplicate {
    public static void main(String[] args) {
        String str = "programming";

        //using java 8
        StringBuilder sb1  = new StringBuilder();
        str.chars().distinct().forEach(c -> sb1.append((char)c));
        System.out.println(sb1);

        //using indexOf()
        StringBuilder sb2 = new StringBuilder();
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            int ind = str.indexOf(ch,i+1);
            if(ind == -1){
                sb2.append(ch);
            }
        }
        System.out.println(sb2);

        //using char[]
        StringBuilder sb3 = new StringBuilder();
        char[] arr = str.toCharArray();
        for(int i=0;i<arr.length;i++){
            boolean repeated = false;
            for(int j=i+1;j<arr.length;j++){
                if(arr[i] == arr[j]){
                    repeated = true;
                    break;
                }
            }
            if(repeated != true){
                sb3.append(arr[i]);
            }
        }
        System.out.println(sb3);

        //using set
        StringBuilder sb4 = new StringBuilder();
        HashSet<Integer> set = new LinkedHashSet<>();
        
    }
}
