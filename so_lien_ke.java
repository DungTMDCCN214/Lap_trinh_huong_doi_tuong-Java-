import java.util.Scanner;

public class so_lien_ke {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            long a = sc.nextLong();
            int ok=0;
            while(a>10){
                long m = a%10;
                a/=10;
                long n = a%10;
                if(Math.abs(m-n)!=1){
                    ok=1;
                    break;
                }
            }
            if(ok==0){
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
