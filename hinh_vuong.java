import java.util.Scanner;

public class hinh_vuong {
    public static long hinhvuong(long xa1, long ya1, long xa2, long ya2,long xb1, long yb1, long xb2, long yb2){
        long left = Math.min(Math.min(xa1,xa2), Math.min(xb1, xb2));
        long right = Math.max(Math.max(xa1,xa2), Math.max(xb1,xb2));
        long bottom = Math.min(Math.min(ya1, ya2), Math.min(yb1,yb2));
        long top = Math.max(Math.max(ya1,ya2), Math.max(yb1,yb2));

        long w = right-left;
        long h = top-bottom;
        return Math.max(w,h);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long xa1 = sc.nextLong(), ya1 = sc.nextLong();
        long xa2 = sc.nextLong(), ya2 = sc.nextLong();
        long xb1 = sc.nextLong(), yb1 = sc.nextLong();
        long xb2 = sc.nextLong(), yb2 = sc.nextLong();

        long m = hinhvuong(xa1, ya1, xa2, ya2, xb1, yb1, xb2, yb2);
        long s = m*m;
        System.out.println(s);

    }
}
