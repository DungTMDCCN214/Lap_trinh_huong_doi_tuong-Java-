import java.util.Scanner;
import java.util.Stack;

public class rut_gon_xau_ky_tu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        Stack<Character> b = new Stack<>();
        for(char x:a.toCharArray()){
            if(!b.empty() && b.peek()==x){
                b.pop();
            } else {
                b.push(x);
            }
        }
        if(b.size()!=0){
            StringBuilder d = new StringBuilder();
            for(char k:b){
                d.append(k);
            }
            System.out.println(d);
        } else {
            System.out.println("Empty String");
        }
    }
}
// So sanh string thi phai dung equals()
// toCharArray() La duyet tung ky tu cua chuoi