package ss2_loop.bai_tap;

import java.util.Arrays;
import java.util.Scanner;

public class DemoArray {
    public static void main(String[] args) {
      // tạo số nguyên
        int[] numbers = {10,20,30};
        int[] numbers2 = numbers;
        int[] copys = numbers.clone();
        System.out.println(numbers==numbers2); // true
        System.out.println(numbers==copys); // false
//        System.out.println(Arrays.toString(copys));

        // khai bảo mảng có thể chứa 3 phần tử
        // => mỗi một phần tử sẽ mang giá trị mặc định null
//        String[] cars = new String[2];
//        System.out.println(numbers.length);
        // Arrays: la một class tiện ích để làm việc với mảng.
//        System.out.println(Arrays.toString(numbers));
        // sử dụng vòng lặp để duyêt
        // sử dung for thường
//        for (int i = 0; i <numbers.length ; i++) {
//            System.out.println("Phần tử thứ " + i+ ":" +numbers[i]);
//        }
//        for (int number : numbers){
//            System.out.println(number);
//        }
//        System.out.println(cars.length);
//        System.out.println(Arrays.toString(cars));
        // độ dài cố định không thay đổi được: nhược điểm của mảng trong java => sau này (bài 10) dùng List
        // mảng trong java không có các phương thức hỗ trợ
//
//       int[] copyNumbers = new int[numbers.length+1];
//        for (int i = 0; i <copyNumbers.length ; i++) {
//            if (i <numbers.length){
//                copyNumbers[i]= numbers[i];
//            }else {
//                copyNumbers[i]= 40;
//            }
//        }
//        System.out.println(Arrays.toString(copyNumbers));

//        Scanner scanner = new Scanner(System.in);
//        for (int i=0; i<cars.length;i++){
//            System.out.println("nhập pt thứ "+ i);
//            cars[i] = scanner.nextLine();
//        }
//        System.out.println(Arrays.toString(cars));

//        int[] numbers1 = {1,2,3};
//        int[] numbers2 = {1,2,3};
//
//        System.out.println(numbers1==numbers2);// false
//        System.out.println(numbers1.equals(numbers2));//false
//        System.out.println(Arrays.equals(numbers1,numbers2));//true
        // mảng 2 chiều
//        int[][] nums = {
//                {10,3,4},
//                {3,5,6},
//                {3,5,7}
//        };
//        int[][] nums2 = new int[2][2];
//        for (int i = 0; i <nums2.length ; i++) {
//            for (int j = 0; j <nums2[i].length ; j++) {
//                System.out.println("nhập phần tử thứ "+i+":"+j);
//                nums2[i][j]= Integer.parseInt(scanner.nextLine());
//            }
//        }

//        for (int i = 0; i <nums2.length ; i++) {
//            for (int j = 0; j <nums2[i].length ; j++) {
//                System.out.print(nums2[i][j]+" " );
//            }
//            System.out.println("");
//        }

    }
}
