import java.util.Scanner;

public class xau_doi_xung {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while(t-->0){
            String a = sc.nextLine();
            int n = a.length();
            int cnt = 0;
            for(int i=0;i<n/2;i++){
                if(a.charAt(i) != a.charAt(n-i-1)){
                    cnt++;
                }
            }
            if(cnt > 1){
                System.out.println("NO");
            } else if(cnt==1){
                System.out.println("YES");
            } else {
                if(n%2==0){
                    System.out.println("NO");
                } else {
                    System.out.println("YES");
                }
            }
        }
    }
}
