import java.util.*;
public class uoc_so_chia_het_cho_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            if(n % 2 == 1){
                System.out.println(0);
            }else{
                long cnt = 0;
                n /= 2;
                for(int i = 1; i * i <= n; i++){
                  if(n % i == 0){
                      ++cnt;
                      if(n / i != i){
                          ++cnt;
                      }
                  }
                }
                System.out.println(cnt);
            }
        }
    }
}
