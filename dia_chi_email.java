import java.util.*;

public class dia_chi_email {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();

        Map<String, Integer> emailCount = new HashMap<>();

        while(t-- > 0){
            String a = sc.nextLine().trim();
            // Xử lý chuỗi: bỏ khoảng trắng thừa
            String[] b = a.toLowerCase().trim().split("\\s+");

            // Lấy phần tên (cuối cùng)
            StringBuilder m = new StringBuilder(b[b.length-1]);

            // Ghép thêm chữ cái đầu của các từ còn lại (họ + đệm)
            for(int i=0;i<b.length-1;i++){
                m.append(b[i].charAt(0));
            }

            String emailBase = m.toString();

            // Kiểm tra trùng email
            int count = emailCount.getOrDefault(emailBase, 0);
            emailCount.put(emailBase, count + 1);

            if(count == 0){
                System.out.println(emailBase + "@ptit.edu.vn");
            } else {
                System.out.println(emailBase + (count+1) + "@ptit.edu.vn");
            }
        }
    }
}
