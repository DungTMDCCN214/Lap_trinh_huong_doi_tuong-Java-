import java.util.Scanner;

public class so_uu_the {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine(); // bỏ dòng thừa sau số test

        while(t-- > 0){
            String s = sc.nextLine().trim();
            int n = s.length();

            // Kiểm tra hợp lệ
            if(s.charAt(0) == '0'){
                System.out.println("INVALID");
                continue;
            }

            boolean valid = true;
            int cntEven = 0, cntOdd = 0;

            for(int i = 0; i < n; i++){
                char c = s.charAt(i);
                if(c < '0' || c > '9'){
                    valid = false;
                    break;
                }
                int d = c - '0';
                if(d % 2 == 0) cntEven++;
                else cntOdd++;
            }

            if(!valid){
                System.out.println("INVALID");
            } else {
                if(n % 2 == 0 && cntEven > cntOdd){
                    System.out.println("YES");
                } else if(n % 2 == 1 && cntOdd > cntEven){
                    System.out.println("YES");
                } else {
                    System.out.println("NO");
                }
            }
        }
    }
}
