import java.util.Scanner;

public class cat_doi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); // số test case

        while (t-- > 0) {
            String b = sc.next();
            StringBuilder c = new StringBuilder();
            boolean valid = true;

            for (int i = 0; i < b.length(); i++) {
                char x = b.charAt(i);
                if (x == '0' || x == '8' || x == '9') {
                    c.append('0');
                } else if (x == '1') {
                    c.append('1');
                } else {
                    valid = false; // ký tự không hợp lệ
                    break;
                }
            }

            if (!valid) {
                System.out.println("INVALID");
                continue;
            }

            // Xóa số 0 ở đầu
            int start = 0;
            while (start < c.length() && c.charAt(start) == '0') {
                start++;
            }

            // Nếu toàn 0 => INVALID
            if (start == c.length()) {
                System.out.println("INVALID");
            } else {
                System.out.println(c.substring(start));
            }
        }

        sc.close();
    }
}
