
import java.util.Scanner;

public class dao_tu {
    public static String dao_tu(String s){
        return new StringBuilder(s).reverse().toString();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while(t-->0){
            String a = sc.nextLine().trim();
            StringBuilder b = new StringBuilder();
            String[] c = a.split(" ");
            for(String i:c){
                System.out.print(dao_tu(i.toString())+ " ");
            }
            System.out.println();
        }
    }
}
