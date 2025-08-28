import java.util.Scanner;

public class tong_phan_so {
    long x, y;
    tong_phan_so(long x, long y){
        this.x = x;
        this.y = y;
    }
    public  static long gcd(long a, long b){
        while(b!=0){
            long tmp = a%b;
            a=b;
            b=tmp;
        }
        return a;
    }
    public tong_phan_so rut_gon(){
        long k = gcd(x,y);
        return new tong_phan_so(x/k,y/k);
    }
    public tong_phan_so tong (tong_phan_so b){
        long mau_chung = this.y * b.y / gcd(this.y,b.y);
        long tu = mau_chung/this.y*this.x + mau_chung/b.y*b.x;
        return new tong_phan_so(tu,mau_chung).rut_gon();
    }
    public String toString(){
        return x + "/" + y;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        long c = sc.nextLong();
        long d = sc.nextLong();
        tong_phan_so p1 = new tong_phan_so(a,b);
        tong_phan_so p2 = new tong_phan_so(c,d);
        System.out.println(p1.tong(p2));
    }
}
