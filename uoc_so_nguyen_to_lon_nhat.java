import java.util.Scanner;

public class uoc_so_nguyen_to_lon_nhat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t--> 0){
            long a = sc.nextLong();
            long b=1;
            for(long i=2; i*i <=a;i++){
                if(a%i==0){
                    while(a%i==0){
                        a/=i;
                    }
                    b=i;
                }
            }
            if(a!=1){
                b=a;
            }
            System.out.println(b);
        }
    }
}
