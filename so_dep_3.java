import java.util.Scanner;

public class so_dep_3 {
    public static boolean nguyento(int n){
        if(n<2) return false;
        for(int i=2;i*i<=n;i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        sc.nextLine();

        while(t-->0){
            int ok=0;
            String a = sc.nextLine().trim();
            for(int i=0;i<a.length()/2;i++){
                int left = a.charAt(i)-'0';
                int right = a.charAt(a.length()-i-1)-'0';
                if(left != right){
                    ok=1;
                    break;
                }
                if(!nguyento(left) || !nguyento(right)){
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
