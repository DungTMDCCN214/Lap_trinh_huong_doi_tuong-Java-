import java.util.*;

public class sap_xep_thoi_gian {
    static class Time implements Comparable<Time> {
        int h, m, s;

        Time(int h, int m, int s) {
            this.h = h;
            this.m = m;
            this.s = s;
        }

        public int compareTo(Time other) {
            if (this.h != other.h) return this.h - other.h;
            if (this.m != other.m) return this.m - other.m;
            return this.s - other.s;
        }
        public String toString() {
            return h + " " + m + " " + s;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        List<Time> list = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            int h = sc.nextInt();
            int m = sc.nextInt();
            int s = sc.nextInt();
            list.add(new Time(h, m, s));
        }

        Collections.sort(list); // sắp xếp tăng dần

        for (Time t : list) {
            System.out.println(t);
        }
    }
}
