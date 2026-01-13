package ss2_loop.bai_tap;

import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
     // nhập dữ liệu
        int i =20;
//        int i2 =30;
        // kiểu dữ liệu
        // + kiêu nguyên thuỷ : byte, short, int, long, float, double, char, boolean => chỉ có thể lưu giá trị
        // + Tham chiếu: // có thể lưu giá trị + có các method hỗ trợ
               //   - Đối tượng : những class có sẵn trong java: Scanner, String, (Integer, Character, Double,Float,Boolean, Long, Short,Byte) => warper class
                //    - Interface: là các interfce => bài 8
        Scanner scanner = new Scanner(System.in);
//        System.out.println("nhập id");
//        int id = Integer.parseInt(scanner.nextLine());
//        System.out.println("nhập tên");
//        String name = scanner.nextLine();
//        System.out.println("nhập điểm");
//        float score = Float.parseFloat(scanner.nextLine());
//        System.out.println("id vừa nhập là : "+ id);
//        System.out.println("tên vừa nhập là : "+ name);
//        System.out.println("điểm vừa nhập là : "+ score);
        //
     // toàn sử dụng nextLine()
        // kiểm tra 1 số có phải là snt?
//        System.out.println("nhập 1 số cần kiểm tra");
//        int number = Integer.parseInt(scanner.nextLine());
//        boolean flag = true;
//        for (int i = 2; i <number ; i++) {
//            if (number%i==0){
//                flag = false;
//                break;
//            }
//        }
//        if (flag){
//            System.out.println(number + " là snt");
//        }else {
//            System.out.println(number + " không phải snt");
//        }
        // js: for-in, for-of : 2 vòng lặp cải tiến từ vòng lặp for => để duyệt mảng
        // java : forEach: // dùng để duyệt mảng hoặc danh sách
        int[] array = {10,20,30,40};
//        for (int j = 0; j <array.length ; j++) {
//            array[j] +=100;
//        }
        for (int e: array){
            e +=100;
        }

        for (int j = 0; j <array.length ; j++) {
            System.out.println(array[j]);
        }
        // duyệt mảng bằng forEach:
        for(int e :array){
            System.out.println(e);
        }
    }

}
