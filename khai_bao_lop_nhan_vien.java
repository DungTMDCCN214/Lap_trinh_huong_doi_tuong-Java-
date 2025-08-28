import java.util.Scanner;

public class khai_bao_lop_nhan_vien {
    String ten;
    String gioitinh;
    String ns, dc, ms, date;
    khai_bao_lop_nhan_vien(String ten, String gioitinh, String ns, String dc, String ms, String date){
        this.ten = ten;
        this.gioitinh = gioitinh;
        this.ns = ns;
        this.dc=dc;
        this.ms=ms;
        this.date=date;
    }
    public String toString(){
        return "00001" + " " + ten +" "+gioitinh+" "+
                ns + " "+ dc+ " "+ms+" "+date;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String ten = sc.nextLine();
        String gioitinh = sc.nextLine();
        String ns = sc.nextLine();
        String dc = sc.nextLine();
        String ms = sc.nextLine();
        String date = sc.nextLine();
        khai_bao_lop_nhan_vien a = new khai_bao_lop_nhan_vien(ten, gioitinh,ns,dc,ms,date);
        System.out.println(a);
    }
}
