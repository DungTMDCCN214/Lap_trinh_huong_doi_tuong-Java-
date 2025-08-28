import java.util.Scanner;

public class so_nguyen_to {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t;
        t=sc.nextInt();
        while(t-- > 0){
            long a;
            a=sc.nextLong();
            long b=a;
            int ok=0;
            if(a<2){
                ok=1;
            } else {
                for (long i = 2; i * i  <= b; i++) {
                    if (a % i == 0) {
                        ok = 1;
                        break;
                    }
                }
            }
            if(ok==0){
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
        sc.close();
    }
}
