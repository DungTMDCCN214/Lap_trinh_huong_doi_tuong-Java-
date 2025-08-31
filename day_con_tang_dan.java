import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class day_con_tang_dan {
    static int n;
    static int[] a;
    static ArrayList<String> res = new ArrayList<>();

    public static void main(String[] args) {
        try{
            Scanner sc = new Scanner(new File("DAYSO.in"));
            n = sc.nextInt();
            a = new int[n];
            for(int i=0;i<n;i++){
                a[i] = sc.nextInt();
            }
            sc.close();
            for(int j = 0;j<(1<<n);j++){
                ArrayList<Integer> tmp = new ArrayList<>();
                for(int i=0;i<n;i++){
                    if((j &(1 << i))!=0){
                        tmp.add(a[i]);
                    }
                }
                if(tmp.size()>=2 && isIncreasing(tmp)){
                    StringBuilder s = new StringBuilder();
                    for(int i=0;i<tmp.size();i++){
                        if(i>0){
                            s.append(" ");
                        }
                        s.append(tmp.get(i));
                    }
                    res.add(s.toString());
                }
            }
            Collections.sort(res);
            for(String j:res){
                System.out.println(j);
            }
        } catch(Exception e){
            e.printStackTrace();
        }
    }
    static boolean isIncreasing(ArrayList<Integer> list){
        for(int i=1;i<list.size();i++){
            if(list.get(i)<=list.get(i-1)){
                return false;
            }
        }
        return true;
    }
}
