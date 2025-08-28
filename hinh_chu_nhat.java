import java.util.Scanner;

public class hinh_chu_nhat {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a,b;
        a=sc.nextInt();
        b=sc.nextInt();
        if(a<=0 || b<=0){
            System.out.println(0);
        } else {
            int c = (a+b)*2;
            long d = (long) a*b;
            System.out.print(c);
            System.out.print(" ");
            System.out.print(d);
        }
        sc.close();
    }
}
