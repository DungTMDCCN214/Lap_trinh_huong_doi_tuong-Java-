import java.util.Scanner;

public class khai_bao_lop_thi_sinh {
    String a, b;
    Double x1, x2, x3;
    khai_bao_lop_thi_sinh(String a, String b, Double x1, Double x2, Double x3) {
        this.a = a;
        this.b = b;
        this.x1 = x1;
        this.x2 = x2;
        this.x3 = x3;
    }
    public static Double tong(Double x1, Double x2, Double x3){
        return x1+x2+x3;
    }
    public String toString(){
        return a + " " + b + " "+tong(x1,x2,x3);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String b =sc.nextLine();
        Double x1 = sc.nextDouble();
        Double x2 = sc.nextDouble();
        Double x3 = sc.nextDouble();
        khai_bao_lop_thi_sinh ts = new khai_bao_lop_thi_sinh(a,b,x1,x2,x3);
        System.out.println(ts);
    }
}
