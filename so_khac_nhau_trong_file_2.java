import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class so_khac_nhau_trong_file_2 {
    public static int doi(String n){
        int sum = 0;
        for (int i = 0; i < n.length(); i++){
            sum = sum * 2 + (n.charAt(i) - '0');
        }
        return sum;
    }
    public static void main(String[] args) {
        int[] b = new int[1000];
        try{
            Scanner sc = new Scanner(new File("DATA.in"));
            while(sc.hasNext()){
                String a = sc.nextLine();
                int n =doi(a);
                b[n]++;
            }
            sc.close();
        } catch (FileNotFoundException e){

        }
        for(int i=1;i<1000;i++){
            if(b[i]>0){
                System.out.println(i + " "+ b[i]);
            }
        }
    }
}
