import java.util.Scanner;

public class danh_sach_ke {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int[][] a = new int[t][t];
        for(int i= 0;i<t;i++){
            for(int j=0;j<t;j++){
                a[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<t;i++){
            System.out.print("List("+(i+1)+") = ");
            for(int j=0;j<t;j++){
                if(a[i][j]==1){
                    System.out.print((j+1)+" ");
                }
            }
            System.out.println();
        }
    }
}
