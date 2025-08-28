import java.util.Scanner;

public class phan_tich_thua_so_nguyen_to {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i=1;i<=t;i++){
            long a=sc.nextLong();
            long c=a;
            System.out.printf("Test %d: ", i);
            for(int j=2;j * j<=c;j++){
                if(a%j==0){
                    int count=0;
                    while(a%j==0){
                        count++;
                        a/=j;
                    }
                    System.out.printf("%d(%d) ", j,count);
                }
            }
            if(a>1){
                System.out.printf("%d(1)",a);
            }
            System.out.println();
        }
    }
}
