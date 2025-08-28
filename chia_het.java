import java.math.BigInteger;
import java.util.Scanner;

public class chia_het {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while(t-->0){
            String l = sc.nextLine();
            String[] c = l.split(" ");
            BigInteger a = new BigInteger(c[0]);
            BigInteger b = new BigInteger(c[1]);
            if(a.remainder(b).equals(BigInteger.ZERO) || b.remainder(a).equals(BigInteger.ZERO)){
                System.out.println("YES");
                // remainder tuong tu nhu mod;
            } else {
                System.out.println("NO");
            }
        }
    }
}
