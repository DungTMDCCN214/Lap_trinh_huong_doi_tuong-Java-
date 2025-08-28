import java.util.Scanner;

public class tinh_so_fibonacci {
    static long[] f = new long[105];
    static long fibo(int n){
        if(n<2){
            return n;
        }
        if(f[n]!=0){
            return f[n];
        }
        long tmp=fibo(n-1)+fibo(n-2);
        f[n]=tmp;
        return f[n];
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t;
        t=sc.nextInt();
        while(t-- > 0){
            int a;
            a = sc.nextInt();
            System.out.println(fibo(a));
        }
    }
}
