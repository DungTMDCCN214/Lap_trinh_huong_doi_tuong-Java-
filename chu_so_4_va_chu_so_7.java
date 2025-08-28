import java.util.Scanner;

public class chu_so_4_va_chu_so_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        int cnt=0;
        while(n>0){
            long k = n%10;
            if(k==4 || k==7){
                cnt++;
            }
            n/=10;
        }
        if(cnt==4 || cnt==7){
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
