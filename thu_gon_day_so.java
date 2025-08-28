import java.util.Scanner;
import java.util.Stack;

public class thu_gon_day_so {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int[] a = new int[t];
        for(int i=0;i<t;i++){
            a[i] = sc.nextInt();
        }
        Stack<Integer> b = new Stack<>();
        for(int x:a){
            if(!b.empty() && (b.peek()+x)%2==0){
                b.pop();
                // b.peek la lay ra o dinh stack;
            } else {
                b.push(x);
            }
        }
        System.out.println(b.size());
    }
}
