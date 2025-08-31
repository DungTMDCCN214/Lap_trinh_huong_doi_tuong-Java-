import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class so_khac_nhau_trong_file_3 {
    public static void main(String[] args) {
        try {
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream("DATA.in"));
            ArrayList<Integer> list = (ArrayList<Integer>) ois.readObject();
            ois.close();

            int[] b = new int[1000];
            for(int x:list){
                b[x]++;
            }
            for(int i=0;i<1000;i++){
                if(b[i]>0){
                    System.out.println(i + " "+b[i]);
                }
            }
        } catch(Exception e){
            e.printStackTrace();
        }
    }
}
