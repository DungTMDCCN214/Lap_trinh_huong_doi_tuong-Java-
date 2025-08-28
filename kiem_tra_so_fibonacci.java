import java.util.Scanner;

public class kiem_tra_so_fibonacci {
    static long[] f = new long[94];

    static void fibo(){
        f[0]=0;
        f[1]=1;
        f[2]=1;
        for(int i=3;i<=92;i++) {
            f[i] = f[i - 1] + f[i - 2];
        }
    }
    static boolean check(long n){
        if(n==0 || n==1) return true;
        for(int i=1;i<=92;i++){
            if(n==f[i]){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        fibo();
        Scanner sc = new Scanner(System.in);
        int t;
        t=sc.nextInt();
        while(t-- >0){
            long a;
            a=sc.nextLong();
            if(check(a)){
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
