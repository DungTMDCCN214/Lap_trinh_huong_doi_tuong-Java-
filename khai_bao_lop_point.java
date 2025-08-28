import java.awt.*;
import java.util.Scanner;

public class khai_bao_lop_point {
    double x, y;
    khai_bao_lop_point(double x, double y){
        this.x=x;
        this.y=y;
    }
    double khoang_cach(khai_bao_lop_point other){
        return Math.sqrt((this.x-other.x) * (this.x-other.x) + (this.y - other.y)*(this.y-other.y));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t= sc.nextInt();
        while(t-->0){
            double x1 = sc.nextDouble();
            double y1 = sc.nextDouble();
            double x2 = sc.nextDouble();
            double y2 = sc.nextDouble();
            khai_bao_lop_point p1 = new khai_bao_lop_point(x1, y1);
            khai_bao_lop_point p2 = new khai_bao_lop_point(x2,y2);
            System.out.printf("%.4f\n", p1.khoang_cach(p2));
        }
        sc.close();
    }
}
