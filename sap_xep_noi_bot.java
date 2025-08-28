import java.util.Scanner;

public class sap_xep_noi_bot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int[] a = new int[t];
        for(int i=0;i<t;i++){
            a[i] = sc.nextInt();
        }
        for(int i=0;i<t;i++){
            boolean check=false;
            for(int j=0;j<t-i-1;j++){
                if(a[j]>a[j+1]){
                    check=true;
                    int tmp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=tmp;
                }
            }
            if(check==false){
                break;
            }
            System.out.print("Buoc "+(i+1)+": ");
            for(int j=0;j<t;j++){
                System.out.print(a[j]+" ");
            }
            System.out.println();
        }
    }
}
