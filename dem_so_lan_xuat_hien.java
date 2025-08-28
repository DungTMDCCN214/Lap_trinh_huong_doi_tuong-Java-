import java.util.Scanner;

public class dem_so_lan_xuat_hien {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int j=1;j<=t;j++){
            int n = sc.nextInt();
            int[] a = new int[n];
            int[] b = new int[100001];
            for(int i=0;i<n;i++){
                a[i] = sc.nextInt();
                b[a[i]] += 1;
            }
            System.out.println("Test " + j + ":" );

            for(int i=0;i<n;i++){
                if(b[a[i]] > 0){
                    System.out.println(a[i] + " xuat hien " + b[a[i]] + " lan");
                    b[a[i]]=0;
                }
            }
        }
    }
}
