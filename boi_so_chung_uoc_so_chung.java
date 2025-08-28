import java.util.Scanner;

public class boi_so_chung_uoc_so_chung {
    public static long gcd(long a, long b){
        while(b!=0){
            long tmp=b;
            b=a%b;
            a=tmp;
        }
        return a;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            long a = sc.nextLong();
            long b = sc.nextLong();
            long c = gcd(a,b);
            long d = a*b/c;
            System.out.println(d + " " + c);
        }
    }
}
