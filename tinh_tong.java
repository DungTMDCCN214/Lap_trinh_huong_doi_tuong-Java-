import java.io.File;
import java.util.Scanner;

public class tinh_tong {
    public static void main(String[] args) {
        long sum = 0;
        try {
            Scanner sc = new Scanner(new File("DATA.in"));
            while(sc.hasNext()){
                String a = sc.next();
                try {
                    int num = Integer.parseInt(a);
                    sum += num;
                } catch (NumberFormatException e){
                }
            }
            sc.close();
        } catch (Exception e){
            e.printStackTrace();
        }
        System.out.println(sum);
    }
}
