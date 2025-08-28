import java.util.Scanner;

public class giai_phuong_trinh_bac_nhat {
    public static void main(String[] args) {
        Scanner  sc = new Scanner((System.in));
        int a,b;
        a=sc.nextInt();
        b=sc.nextInt();
        if(a==0){
            if(b==0){
                System.out.println("VSN");
            } else {
                System.out.println("VN");
            }
        } else {
            float c=(float) -b/a;
            System.out.printf("%.2f", c);
        }
        sc.close();
    }
}
