//import java.util.Scanner;
//
//public class giao_cua_hai_day_so {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int m = sc.nextInt();
//
//        int[] a = new int[n];
//        int[] b = new int[m];
//
//        boolean[] presentA = new boolean[1000]; // đánh dấu số xuất hiện trong a[]
//        boolean[] presentB = new boolean[1000]; // đánh dấu số xuất hiện trong b[]
//
//        for (int i = 0; i < n; i++) {
//            a[i] = sc.nextInt();
//            presentA[a[i]] = true;
//        }
//
//        for (int i = 0; i < m; i++) {
//            b[i] = sc.nextInt();
//            presentB[b[i]] = true;
//        }
//
//        // In giao của hai tập theo thứ tự tăng dần
//        for (int i = 1; i < 1000; i++) {
//            if (presentA[i] && presentB[i]) {
//                System.out.print(i + " ");
//            }
//        }
//
//        sc.close();
//    }
//}

import java.util.Scanner;

public class giao_cua_hai_day_so {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int[] a = new int[n];
        int[] b = new int[m];
        int[] c = new int[1001];
        for(int i=0;i<n;i++){
            a[i] = sc.nextInt();
            c[a[i]]=1;
        }
        for(int i=0;i<m;i++){
            b[i]=sc.nextInt();
            if(c[b[i]]==1){
                c[b[i]]=2;
            }
        }
        for(int i=1;i<1000;i++){
            if(c[i]==2){
                System.out.print(i+" ");
                c[i]=0;
            }
        }
        sc.close();
    }
}