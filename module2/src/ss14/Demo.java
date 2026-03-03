package ss14;

import ss10.Student;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        System.out.println("----start--------");

        try {
            boolean check = checkAge(201);
        } catch (AgeException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("----finish--------");

    }

    public static int getValueFromToArray() {
        // nếu nhập  vào chuỗi => mặc định lấy pt đầu tiên mảng
        // nếu nhập  index ngoài mảng thì => phân tử cuối mảng
        int[] array = {10, 20, 30, 40, 50};
        Scanner scanner = new Scanner(System.in);
        int index = -1;
        try {
            index = Integer.parseInt(scanner.nextLine());

            return array[index];
        } catch (NumberFormatException e) {
            System.out.println("nhập index là chuỗi");
            index = 0;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("lỗi nhập index ngoài pt mảng");
            index = array.length - 1;
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println("khôi này luôn chạy cho dù có không có exception");
            // ứng dụng đòng file, đóng kết nối DB
        }
        return array[index];
    }

    public static void infiniteRecursion() {
        System.out.println("Calling...");
        infiniteRecursion(); // không có điểm dừng
    }

    public static void readAndWriteFile(String filePath) throws IOException {
        File file = new File(filePath);
        FileWriter fileWriter = new FileWriter(file);
        System.out.println("chạy bình thường");

    }
    public static boolean checkAge(int age) throws AgeException {
        if (age<0){
            throw new AgeException(("Tuổi nhỏ hơn không"));
        }else if (age>200){
            throw new AgeException("Tuổi lớn hơn 200");
        }
        return true;
    }
}
