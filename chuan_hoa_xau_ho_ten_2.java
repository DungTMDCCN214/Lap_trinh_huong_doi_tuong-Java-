import java.util.Scanner;

public class chuan_hoa_xau_ho_ten_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while(t-->0){
            String a = sc.nextLine().trim();
            String[] b = a.split("\\s+");
            StringBuilder c = new StringBuilder();
            for(int i=0;i<b.length;i++){
                if(i==0){
                    b[i]=b[i].toUpperCase();
                } else{
                    b[i]=b[i].substring(0,1).toUpperCase()+b[i].substring(1).toLowerCase();
                }
            }
            for(int i=1;i<b.length;i++){
                c.append(b[i]);
                c.append(" ");
            }
            if(c.length()>0){
                System.out.print(c.toString().trim()+", ");
            }
            System.out.print(b[0]);
            System.out.println();
        }

    }
}
