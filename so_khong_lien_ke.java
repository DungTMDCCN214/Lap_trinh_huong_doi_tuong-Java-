import java.util.Scanner;

public class so_khong_lien_ke {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
             long a = sc.nextLong();
             long sum = 0;
             int ok=0;
             while(a>10){
                 long m = a%10;
                 a/=10;
                 sum+=m;
                 long n= a%10;
                 if(Math.abs(m-n)!=2){
                     ok=1;
                     break;
                 }
             }
             if(ok==0){
                 sum+=a;
                 if(sum%10!=0){
                     ok=1;
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
