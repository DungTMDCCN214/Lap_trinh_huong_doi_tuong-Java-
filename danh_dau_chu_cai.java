
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class danh_dau_chu_cai {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Set<Character> b = new HashSet<>();
        String a = sc.nextLine();
        for(int i=0;i<a.length();i++){
            char c = a.charAt(i);
            b.add(Character.toLowerCase(c));
        }
        System.out.println(b.size());
    }
}
