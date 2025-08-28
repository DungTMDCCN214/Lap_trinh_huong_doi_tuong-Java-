import java.util.Scanner;

public class danh_sach_canh {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int[][] a = new int[t][t];
        for(int i=0;i<t;i++){
            for(int j=0;j<t;j++){
                a[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<t;i++){
            for(int j=i+1;j<t;j++){
                if(a[i][j]==1){
                    System.out.println("("+(i+1)+","+(j+1)+")");
                }
            }
        }
    }
}
