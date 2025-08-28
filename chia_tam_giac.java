import java.util.Scanner;

public class chia_tam_giac {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int a= sc.nextInt();
            int b = sc.nextInt();
            for(int i=1;i<a;i++){
                double ans = b * Math.sqrt(1.0 * i/a);
                System.out.printf("%.6f ",ans);
            }
            System.out.println();
        }
    }
}
