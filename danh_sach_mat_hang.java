import java.util.*;

public class danh_sach_mat_hang implements Comparable<danh_sach_mat_hang> {
    private String ma;
    private String ten;
    private String donvi;
    private int giamua;
    private int giaban;
    private int loinhuan;
    private static  int sma = 1;
    public danh_sach_mat_hang(String ten, String donvi, int giamua, int giaban){
        this.ma = String.format("MH%03d", sma++);
        this.ten = ten;
        this.donvi = donvi;
        this.giamua = giamua;
        this.giaban = giaban;
        this.loinhuan = giaban - giamua;
    }
    public int getLoinhuan(){
        return loinhuan;
    }
    public String getMa(){
        return ma;
    }
    public int compareTo(danh_sach_mat_hang other){
        if(this.loinhuan != other.loinhuan){
            return other.loinhuan - this.loinhuan;
        }
        return this.ma.compareTo(other.ma);
    }
    public String toString(){
        return ma + " "+ ten + " "+ donvi+ " " + giamua + " "+
                giaban + " " + loinhuan;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        List<danh_sach_mat_hang> ds = new ArrayList<>();
        for (int i =0;i<t;i++){
            String ten = sc.nextLine().trim();
            String donvi = sc.nextLine().trim();
            int giamua = sc.nextInt();
            sc.nextLine();
            int giaban = sc.nextInt();
            sc.nextLine();
            ds.add(new danh_sach_mat_hang(ten, donvi, giamua, giaban));
        }
        Collections.sort(ds);
        for (danh_sach_mat_hang i : ds){
            System.out.println(i);
        }
    }
}
