import java.util.Scanner;

public class dien_thoai_cuc_gach {
    static char check(char c){
        switch (c){
            case 'A': case 'B': case 'C':
                return '2';
            case 'D': case 'E': case 'F':
                return '3';
            case 'G': case 'H': case 'I':
                return '4';
            case 'J': case 'K': case 'L':
                return '5';
            case 'M': case 'N': case 'O':
                return '6';
            case 'P': case 'Q': case 'R': case 'S':
                return '7';
            case 'T': case 'U': case 'V':
                return '8';
            case 'W': case 'X': case 'Y': case 'Z':
                return '9';
            default:
                return '?';
        }
    }
    static boolean doi_xung(String s){
        int l = 0;
        int r = s.length()-1;
        while(l<r){
            if(s.charAt(l) != s.charAt(r)){
                return false;
            }
            l++;
            r--;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while(t-->0){
            String a = sc.nextLine().trim();
            StringBuilder d = new StringBuilder();
            for (char f:a.toCharArray()){
                if(f<='z' && f>='a'){
                    f-= 32;
                }
                d.append(check(f));
            }
            if(doi_xung(d.toString())){
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
