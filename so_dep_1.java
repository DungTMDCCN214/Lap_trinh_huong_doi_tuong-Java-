import java.util.Scanner;

public class so_dep_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while(t-->0){
            String a =sc.nextLine().trim();
            int ok=0;
            for(int i=0;i<a.length()/2;i++){
                int left = a.charAt(i)-'0';
                int right = a.charAt(a.length()-i-1)-'0';
                if(left != right || left %2==1){
                    ok=1;
                    break;
                }
            }
            if(ok==0){
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
