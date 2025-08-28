import java.util.Scanner;

public class diem_can_bang {
    public static int check(int sum, int n ,int a[]){
        int xum = 0;
        for(int i=0;i<n;i++){
            xum+=a[i];
            if(xum == sum-xum+a[i]){
                return (i+1);
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        while(t-- >0){
            int n = sc.nextInt();
            int[] a = new int[n];
            int sum=0;
            for(int i=0;i<n;i++){
                a[i]=sc.nextInt();
                sum+=a[i];
            }
            System.out.println(check(sum,n,a));
        }
    }
}
