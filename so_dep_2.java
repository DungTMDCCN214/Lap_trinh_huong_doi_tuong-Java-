import java.util.Scanner;

public class so_dep_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while(t-->0){
            String a = sc.nextLine().trim();
            int sum=0;
            int ok=0;
            if(a.charAt(0)-'0' !=8 || a.charAt(a.length()-1)-'0' !=8){
                ok=1;
            } else {
                for (int i = 0; i < a.length() / 2; i++) {
                    int left = a.charAt(i) - '0';
                    int right = a.charAt(a.length() - i - 1) - '0';
                    sum += (left + right);
                    if (left != right) {
                        ok = 1;
                        break;
                    }
                }
                if(a.length()%2==1){
                    int z=a.length()/2;
                    sum+=a.charAt(z)-'0';
                }
                if(sum%10!=0){
                    ok=1;
                }
            }
            if (ok == 0) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
