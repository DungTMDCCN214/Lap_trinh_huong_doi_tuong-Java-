import java.util.Scanner;

public class ma_tran_nhi_phan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] a = new int[n][3];
        for(int i=0;i<n;i++){
            for(int j=0;j<3;j++){
                a[i][j]=sc.nextInt();
            }
        }
        int cnt=0;
        for(int i=0;i<n;i++){
            int x=0;
            int c=0;
            for(int j=0;j<3;j++){
                if(a[i][j]==0){
                    x++;
                } else {
                    c++;
                }
            }
            if(c>x){
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}
