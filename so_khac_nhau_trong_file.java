import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class so_khac_nhau_trong_file {
    public static void main(String[] args) {
        int[] b = new int[1000];
        try {
            Scanner sc = new Scanner(new File("DATA.in"));
            while(sc.hasNextInt()){
                int x = sc.nextInt();
                if(x<1000){
                    b[x]++;
                }
            }
            sc.close();
        } catch(FileNotFoundException e) {

        }
        for(int i=0;i<1000;i++){
            if(b[i]>0){
                System.out.println(i +" " + b[i]);
            }
        }
    }
}
