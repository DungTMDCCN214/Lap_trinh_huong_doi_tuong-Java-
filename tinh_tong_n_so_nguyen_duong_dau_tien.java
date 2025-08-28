import java.util.Scanner;

public class tinh_tong_n_so_nguyen_duong_dau_tien {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int m;
        m=sc.nextInt();
        while(m>0){
            long a;
            m--;
            a=sc.nextInt();
            long c=(a+1)*a/2;
            System.out.println(c);
        }
        sc.close();
    }
}
