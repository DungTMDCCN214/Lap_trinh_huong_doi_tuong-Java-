import java.util.Scanner;

public class liet_ke_to_hop_2 {
    static boolean m = false;
    public static void ktao(int k, int a[]){
        for(int i=1;i<=k;i++){
            a[i]=i;
        }
    }
    public static  void sinh(int n, int k, int a[]){
        int i=k;
        while(i>=1 && a[i]==n-k+i){
            i--;
        }
        if(i>=1){
            a[i]=a[i]+1;
            for(int j=i+1;j<=k;j++){
                a[j]=a[i]+j-i;
            }
        }else {
            m=true;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int[] a= new int[100];
        ktao(k,a);
        m=false;
        int cnt=0;
        while(!m){
            for(int i=1;i<=k;i++){
                System.out.print(a[i]);
            }
            cnt++;
            System.out.print(" ");
            sinh(n,k,a);
        }
        System.out.println();
        System.out.println("Tong cong co "+cnt+" to hop");
    }
}
