import java.util.Arrays;
import java.util.Scanner;

public class so_xa_cach {
    static int n;
    static boolean[] used = new boolean[11];
    static int[] a =new int[11];
    static boolean check(int k){
        if(k==0) return true;
        return Math.abs(a[k]-a[k-1])!=1;
    }
    static void backtrack(int k){
        if(k==n){
            for(int i=0;i<n;i++){
                System.out.print(a[i]);
            }
            System.out.println();
            return;
        }
        for(int i=1;i<=n;i++){
            if(!used[i]){
                a[k]=i;
                if(check(k)){
                    used[i]=true;
                    backtrack(k+1);
                    used[i]=false;
                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            n=sc.nextInt();
            Arrays.fill(used,false);
            backtrack(0);
        }
    }
}
// Dung sinh hoan vi loai bo so 0
//Va kiem tra hieu giua 2 so lien tiep