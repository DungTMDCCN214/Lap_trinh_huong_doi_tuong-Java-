import java.util.Scanner;

public class so_chinh_phuong {
    public static void main(String[] args) {
        Scanner sc = new Scanner( System.in);
        int t = sc.nextInt();
        while(t-->0){
            long a = sc.nextLong();
            long b = (long)Math.sqrt(a);
            if(b*b==a || (b+1)*(b+1)==a){
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
