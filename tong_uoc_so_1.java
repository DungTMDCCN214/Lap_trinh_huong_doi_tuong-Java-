import java.util.Scanner;

public class tong_uoc_so_1 {
    static int MAX =2000000;
    static int[] f = new int[MAX+1];
    public static void sang(){
        for(int i=2;i<=MAX;i++){
            f[i]=i;
        }
        for(int i=2;i*i<=MAX;i++){
            if(f[i]==i){
                for(int j=i*i ; j<=MAX ;j+=i){
                    if(f[j]==j) f[j]=i;
                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sang();
        int t = sc.nextInt();
        long sum = 0;
            for(int i = 2; i <= MAX; i++) {
                sum += f[i];
            }
        while(t-- > 0){
            int a=sc.nextInt();
            while(a>1){
                sum += f[a];
                a/=f[a];
            }
        }
        sc.close();
        System.out.println(sum);
    }
}
