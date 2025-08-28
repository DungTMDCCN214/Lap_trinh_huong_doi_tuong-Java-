import java.util.Scanner;

public class mang_doi_xung {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- >0){
            int ok=1;
            int n = sc.nextInt();
            int[] a = new int[n];
            for(int i=0;i<n;i++){
                a[i] = sc.nextInt();
            }
            for(int i=0;i<n/2;i++){
                if(a[i] != a[n-i-1]){
                    ok=0;
                    break;
                }
            }
            if(ok==0) System.out.println("NO");
            else System.out.println("YES");
        }
    }
}
