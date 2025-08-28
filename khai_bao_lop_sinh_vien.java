import java.util.Scanner;

public class khai_bao_lop_sinh_vien {
    String ten;
    String lop;
    String ns;
    Float diem;
    khai_bao_lop_sinh_vien(String ten, String lop, String ns, Float diem){
        this.ten =ten;
        this.lop = lop;
        this.ns = ns;
        this.diem = diem;
    }
    public String chuan_hoa(String ns){
        String[] a = ns.split("/");
        String ngay = a[0];
        String thang = a[1];
        String nam = a[2];
        if(ngay.length()==1){
            ngay = "0"+ngay;
        }
        if(thang.length()==1){
            thang = "0"+thang;
        }
        return ngay + "/"+thang+"/"+nam;
    }
    public String toString(){
        return "B20DCCN001" + " " + ten+ " "+lop+" "+chuan_hoa(ns)+" "+String.format("%.2f",diem);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String ten,lop,ns;
        Float diem;
        ten = sc.nextLine();
        lop = sc.nextLine();
        ns = sc.nextLine();
        diem = sc.nextFloat();
        khai_bao_lop_sinh_vien a = new khai_bao_lop_sinh_vien(ten, lop, ns, diem);
        System.out.println(a);
    }
}
