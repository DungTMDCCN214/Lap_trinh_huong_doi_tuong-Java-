import java.util.Scanner;

public class bien_so_dep {
    public static boolean check(String a){
        boolean k = true;
        for(int i=0;i<a.length()-1;i++){
            if(a.charAt(i)>=a.charAt(i+1)){
                k=false;
                break;
            }
        }
        if(k==true) return true;
        boolean l=true;
        for(int i=1;i<a.length();i++){
            if(a.charAt(i)!=a.charAt(0)){
                l=false;
                break;
            }
        }
        if(l==true){
            return true;
        }
        if(a.charAt(0) == a.charAt(1) && a.charAt(1)==a.charAt(2) && a.charAt(3)==a.charAt(4)){
            return true;
        }
        boolean z = true;
        for(int i=0;i<a.length();i++){
            if(a.charAt(i)!='6' && a.charAt(i)!='8'){
                z=false;
                break;
            }
        }
        if(z==true){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while(t-->0){
            String a = sc.nextLine();
            StringBuilder b = new StringBuilder();
            for(int i=5;i<=10;i++){
                if(i!=8){
                    b.append(a.charAt(i));
                }
            }
            if(check(b.toString())){
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
