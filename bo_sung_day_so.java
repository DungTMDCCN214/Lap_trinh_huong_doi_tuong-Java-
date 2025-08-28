import java.util.Scanner;

public class bo_sung_day_so {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t= sc.nextInt();
        int[] a = new int[t];
        int[] b = new int[201];
        for(int i=0;i<t;i++){
            a[i] = sc.nextInt();
            b[a[i]]++;
        }
        int ok=0;
        for(int i=1;i<=a[t-1];i++){
            if(b[i]==0){
                ok=1;
                System.out.println(i);
            }
        }
        if(ok==0){
            System.out.println("Excellent!");
        }
    }
}
