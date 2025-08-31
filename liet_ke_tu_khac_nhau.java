import java.io.File;
import java.util.Scanner;
import java.util.TreeSet;

public class liet_ke_tu_khac_nhau {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(new File("VANBAN.in"));
            TreeSet<String> s = new TreeSet<>();
            while(sc.hasNext()){
                String a = sc.next().toLowerCase();
                s.add(a);
            }
            sc.close();
            for (String a:s){
                System.out.println(a);
            }
        } catch(Exception e){
            e.printStackTrace();
        }
    }
}
