import java.util.Scanner;

public class chuan_hoa_xau_ho_ten_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while(t-->0){
            String a = sc.nextLine().trim();
            // Doc va xoa khoang trang dau cuoi
            String[] b = a.split("\\s+");
            StringBuilder m = new StringBuilder();
            for(String w:b){
                if(w.length()>0){
                    m.append(Character.toUpperCase(w.charAt(0)));
                    if(w.length()>1){
                        m.append(w.substring(1).toLowerCase());
                    }
                    m.append(" ");
                }
            }
            System.out.println(m.toString().trim());
            //Bo khoang trang cuoi;
        }
    }
}
