package ss2_loop.bai_tap;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean flag = true;
        while (flag){
            System.out.println("------------Quản lý sinh viên--------------" +
                    "\n 1.Danh sách" +
                    "\n 2.Thêm mới" +
                    "\n 3.Xoá" +
                    "\n 4.Tìm kiếm" +
                    "\n 5.Thoát");
            System.out.println("---Chọn chức năng------------");
            int choose = Integer.parseInt(scanner.nextLine());
            switch (choose){
                case 1:
                    // code chức năng danh sách ở đây
                    System.out.println("Đây là chức năng danh sách");
                    break;
                case 2:
                    System.out.println("Đây là chức năng thêm mới");
                    break;
                case 3:
                    System.out.println("Đây là chức năng xoá");
                    break;
                case 4:
                    System.out.println("Đây là chức năng tìm kiếm");
                    break;
                default:
                    flag = false;
            }
        }
    }
}
