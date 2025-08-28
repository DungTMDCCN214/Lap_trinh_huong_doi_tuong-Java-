import java.util.Scanner;

class Point{
    private double x,y;
    public Point(double x, double y){
        this.x = x;
        this.y = y;
    }
    public double kcach(Point other){
        return Math.sqrt((x- other.x) * (x- other.x) +(y- other.y) * (y- other.y));
    }
}
public class chu_vi_tam_giac {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            double x1 = sc.nextDouble();
            double y1 = sc.nextDouble();
            double x2 = sc.nextDouble();
            double y2 = sc.nextDouble();
            double x3 = sc.nextDouble();
            double y3 = sc.nextDouble();
            Point p1 = new Point(x1, y1);
            Point p2 = new Point(x2, y2);
            Point p3 = new Point(x3, y3);
            double a = p1.kcach(p2);
            double b = p2.kcach(p3);
            double c = p3.kcach(p1);
            if(a+b<=c || a+c<=b || b+c<=a){
                System.out.println("INVALID");
            } else {
                double chuvi = a+ b+ c;
                System.out.printf("%.3f",chuvi);
                System.out.println();
            }
        }
    }
}
