import java.util.Scanner;

public class xau_nhi_phan {
    static long[] fib = new long[93];
    static void init(){
        fib[1]=1;
        fib[2]=1;
        for(int i=2;i<=92;i++){
            fib[i]=fib[i-1]+fib[i-2];
        }
    }
    static char check(int n ,long k){
        if(n==1) return '0';
        if(n==2) return '1';
        if(k<=fib[n-2]){
            return check(n-2,k);
        } else {
            return check(n-1, k-fib[n-2]);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        init();
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            long k = sc.nextLong();
            System.out.println(check(n,k));
        }
    }
}
