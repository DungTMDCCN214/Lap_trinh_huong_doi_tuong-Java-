import java.math.BigInteger;
import java.util.Scanner;

//public class hieu_so_nguyen_lon {
////    public static int sosanh(String a, String b){
////        if(a.length() != b.length()){
////            return a.length() - b.length();
////        }
////        return a.compareTo(b);
////    }
////    public  static String tru(String a, String b){
////        StringBuilder res = new StringBuilder();
////        int i = a.length()-1;
////        int j = b.length()-1;
////        int borrow = 0;
////        // (điều_kiện ? giá_trị1 : giá_trị2)
////        //if (điều_kiện) {
////        //    kq = giá_trị1;
////        //} else {
////        //    kq = giá_trị2;
////        //}
////        while(i>=0  || j>=0){
////            int x = (i>=0 ? a.charAt(i)-'0': 0);
////            int y = (j>=0 ? b.charAt(j)-'0' : 0);
////            int z = x-y-borrow;
////            if(z<0){
////                z+=10;
////                borrow=1;
////            } else {
////                borrow=0;
////            }
////            res.append(z);
////            i--;
////            j--;
////        }
////        res.reverse().toString();
////        while(res.length()>1 && res.charAt(0)=='0'){
////            res.deleteCharAt(0);
////        }
////
////        return res.toString();
////    }
////    public static void main(String[] args) {
////        Scanner sc = new Scanner(System.in);
////        int t = sc.nextInt();
////        sc.nextLine();
////        while(t-->0){
////            String x = sc.nextLine().trim();
////            String y = sc.nextLine().trim();
////            if(x.equals(y)){
////                System.out.println("0");
////                continue;
////            }
////            int cmp = sosanh(x,y);
////            if(cmp>0){
////                System.out.println(tru(x,y));
////            } else {
////                System.out.println(tru(y,x));
////            }
////        }
////    }
//}
public class hieu_so_nguyen_lon {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            BigInteger a = sc.nextBigInteger();
            BigInteger b = sc.nextBigInteger();
            BigInteger c;
            int m;
            if(a.compareTo(b)>0){
                c = a.subtract(b);
                m = a.toString().length();
            } else {
                c = b.subtract(a);
                m = b.toString().length();
            }
            if(c.toString().length()!=m){
                for(int i=0;i<m-c.toString().length();i++){
                    System.out.print("0");
                }
            }
            System.out.println(c);
        }
    }
}
