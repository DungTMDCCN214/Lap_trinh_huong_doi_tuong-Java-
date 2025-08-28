import java.util.Scanner;

public class tong_giai_thua {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        long sum=0;
        long tich=1;
        for(int i=1;i<=a;i++){
            tich *= i;
            sum += tich;
        }
        System.out.println(sum);
    }
}
