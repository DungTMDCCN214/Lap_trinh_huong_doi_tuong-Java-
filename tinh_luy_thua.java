import java.util.Scanner;

public class tinh_luy_thua {
    static final long MOD = 1000000007L;

    public static long luythua(long a, long b){
        if(b == 0) return 1;
        if(b == 1) return a % MOD;
        long half = luythua(a, b / 2);
        long result = (half * half) % MOD;
        if(b % 2 == 1){
            result = (result * (a % MOD)) % MOD;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true){
            long a = sc.nextLong();
            long b = sc.nextLong();
            if(a == 0 && b == 0){
                break;
            }
            System.out.println(luythua(a, b));
        }
    }
}
