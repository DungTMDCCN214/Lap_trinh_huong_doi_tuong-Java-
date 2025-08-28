import java.util.Scanner;

public class sap_xep_doi_cho_truc_tiep {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t= sc.nextInt();
        int[] a = new int[t];
        for(int i=0;i<t;i++){
            a[i] = sc.nextInt();
        }
        for(int i=0;i<t-1;i++){
            int b = a[i];
            for(int j=i+1;j<t;j++){
                if(a[j]<b){
                    b=a[j];
                    a[j]=a[i];
                    a[i]=b;
                }
            }
            int z=i+1;
            System.out.print("Buoc "+ z + ": ");
            for(int j=0;j<t;j++){
                System.out.print(a[j] + " ");
            }
            System.out.println();
        }
    }
}
