import java.util.Scanner;

public class sap_xep_chon {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int[] a = new int[t];
        for(int i=0;i<t;i++){
            a[i] = sc.nextInt();
        }
        for(int i=0;i<t-1;i++){
            int c = a[i];
            int d=i;
            for(int j=i+1;j<t;j++){
                if(a[j]<c){
                    c=a[j];
                    d=j;
                }
            }
            int tmp=a[i];
            a[i]=a[d];
            a[d]=tmp;
            int z=i+1;
            System.out.print("Buoc "+ z + ": ");
            for(int j=0;j<t;j++){
                System.out.print(a[j]+" ");
            }
            System.out.println();
        }
    }
}
