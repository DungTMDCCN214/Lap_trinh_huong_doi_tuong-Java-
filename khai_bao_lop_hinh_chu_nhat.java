import java.util.Scanner;
//
//public class khai_bao_lop_hinh_chu_nhat {
//    // Thuộc tính
//    private double width;
//    private double height;
//    private String color;
//
//    // Constructor mặc định
//    public khai_bao_lop_hinh_chu_nhat() {
//        this.width = 1;
//        this.height = 1;
//        this.color = "white"; // màu mặc định
//    }
//
//    // Constructor có tham số
//    public khai_bao_lop_hinh_chu_nhat(double width, double height, String color) {
//        this.width = width;
//        this.height = height;
//        this.color = color;
//    }
//
//    // Getter và Setter
//    public double getWidth() {
//        return width;
//    }
//
//    public void setWidth(double width) {
//        this.width = width;
//    }
//
//    public double getHeight() {
//        return height;
//    }
//
//    public void setHeight(double height) {
//        this.height = height;
//    }
//
//    public String getColor() {
//        return color;
//    }
//
//    public void setColor(String color) {
//        this.color = color;
//    }
//
//    // Tính diện tích
//    public double findArea() {
//        return width * height;
//    }
//
//    // Tính chu vi
//    public double findPerimeter() {
//        return 2 * (width + height);
//    }
//
//    // toString(): in thông tin HCN
//    @Override
//    public String toString() {
//        return "Hình chữ nhật [width=" + width +
//                ", height=" + height +
//                ", color=" + color +
//                ", area=" + findArea() +
//                ", perimeter=" + findPerimeter() + "]";
//    }
//
//    // Main để kiểm tra
//    public static void main(String[] args) {
//        khai_bao_lop_hinh_chu_nhat hcn1 = new khai_bao_lop_hinh_chu_nhat();
//        khai_bao_lop_hinh_chu_nhat hcn2 = new khai_bao_lop_hinh_chu_nhat(5, 3, "red");
//
//        System.out.println(hcn1);
//        System.out.println(hcn2);
//    }
//}


public class khai_bao_lop_hinh_chu_nhat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        String color = sc.next();
        if(a<=0 || b<=0){
            System.out.println("INVALID");
        } else {
            String c = color.substring(0,1).toUpperCase() + color.substring(1).toLowerCase();
            int chu_vi = (a+b)*2;
            int dien_tich = a*b;
            System.out.println(chu_vi +" "+ dien_tich + " " + c);
        }
    }
}