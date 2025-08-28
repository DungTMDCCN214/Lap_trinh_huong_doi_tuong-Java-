import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.TreeSet;
import java.util.*;
public class tap_tu_rieng_cua_hai_xau {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while(t-- >0){
            String a = sc.nextLine().trim();
            String b = sc.nextLine().trim();
            String[] e = a.split("\\s+");
            String[] f = b.split("\\s+");
            Set<String> setB = new HashSet<>(Arrays.asList(f));
            Set<String> result = new TreeSet<>();
            for(String w: e){
                if(!setB.contains(w)){
                    result.add(w);
                }
            }
            for(String w:result){
                System.out.print(w+" ");
            }
            System.out.println();
        }
    }
}
