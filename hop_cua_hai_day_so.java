import java.util.Scanner;

public class hop_cua_hai_day_so {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] a = new int[n];
        int[] b = new int[m];
        int[] c = new int[1001];
        for(int i=0;i<n;i++){
            a[i] = sc.nextInt();
            c[a[i]]=1;
        }
        for(int i=0;i<m;i++){
            b[i] = sc.nextInt();
            c[b[i]]=1;
        }
        for(int i=1;i<=1000;i++){
            if(c[i]==1){
                System.out.print(i + " ");
            }
        }
    }
}
