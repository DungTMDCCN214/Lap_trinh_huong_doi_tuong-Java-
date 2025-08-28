import java.util.Scanner;

public class sap_xep_chen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int[] a = new int[t];
        for(int i=0;i<t;i++){
            a[i] = sc.nextInt();
        }
        System.out.println("Buoc 0: " + a[0]);
        for(int i=1;i<t;i++){
            int k = a[i];
            int j=i-1;
            while(j>=0 && a[j]>k){
                a[j+1]=a[j];
                j--;
            }
            a[j+1]=k;
            System.out.print("Buoc " + i +": ");
            for(int m=0;m<=i;m++){
                System.out.print(a[m]+" ");
            }
            System.out.println();
        }
    }
}
