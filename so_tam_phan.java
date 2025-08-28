import java.util.Scanner;

public class so_tam_phan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            long a = sc.nextLong();
            int ok=0;
            while(a>0){
                long b = a%10;
                a/=10;
                if(b!=0 && b!=1 && b!=2){
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
