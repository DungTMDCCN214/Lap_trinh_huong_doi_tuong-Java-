import java.util.Scanner;

public class tinh_thu_nhap_giao_vien {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String ma = sc.nextLine().trim();
        String ten = sc.nextLine().trim();
        long luong = sc.nextLong();
        sc.nextLine();
        String chucvu = ma.substring(0,2);
        int bacluong = Integer.parseInt(ma.substring(2,4));
        long phucap;
        if(chucvu.equals("HT")) phucap = 2000000;
        else if (chucvu.equals("HP")) {
            phucap = 900000;
        } else{
            phucap = 500000;
        }
        long thunhap = luong * bacluong + phucap;
        System.out.println(ma + " " + ten +" " + bacluong+ " "+phucap + " "+thunhap);
    }
}
