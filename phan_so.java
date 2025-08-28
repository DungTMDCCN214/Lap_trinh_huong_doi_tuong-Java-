import java.util.Scanner;

public class phan_so {
    private long tu;
    private long mau;
    public  phan_so(long tu, long mau){
        this.tu = tu;
        this.mau = mau;
    }
    public static long gcd(long a, long b){
        while(b!=0){
            long tmp = a%b;
            a=b;
            b=tmp;
        }
        return a;
    }
    public  void rutgon(){
        long k =gcd(tu, mau);
        tu/=k;
        mau/=k;
    }
    public String toString(){
        return tu + "/" + mau;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long tu = sc.nextLong();
        long mau = sc.nextLong();
        phan_so z = new phan_so(tu, mau);
        z.rutgon();
        System.out.println(z);
        // tu goi toString de in;
    }
}
