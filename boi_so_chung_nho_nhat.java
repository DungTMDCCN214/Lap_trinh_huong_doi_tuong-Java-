import java.math.BigInteger;
import java.util.Scanner;

public class boi_so_chung_nho_nhat{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while(t-->0){
            BigInteger a = new BigInteger(sc.nextLine().trim());
            BigInteger b = new BigInteger(sc.nextLine().trim());
            BigInteger k = a.gcd(b);
            BigInteger l = a.multiply(b).divide(k);
            System.out.println(l);
        }
        sc.close();
    }
}
