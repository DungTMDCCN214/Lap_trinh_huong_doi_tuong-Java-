import java.util.Scanner;

public class boi_so_nho_nhat_cua_n_so_nguyen_duong_dau_tien {
    public static long gcd (long a, long b){
        while(b!=0){
            long tmp=b;
            b = a%b;
            a=tmp;
        }
        return a;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- >0){
            long n = sc.nextInt();
            long d=1;
            for(long i=1;i<=n;i++){
                d = d*i/gcd(d,i);
            }
            System.out.println(d);
        }
    }
}
