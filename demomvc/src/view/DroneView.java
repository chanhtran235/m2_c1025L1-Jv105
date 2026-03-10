package view;

import entity.Drone;
import entity.XeTuanTraMatTrang;

import java.util.List;
import java.util.Scanner;

public class DroneView {
    private static Scanner scanner = new Scanner(System.in);

    public static Drone inputData() {
        System.out.println("Nhập số hiệu");
        String soHieu = scanner.nextLine();
        System.out.println("Nhập hãng sản xuất");
        String hangSanXuat = scanner.nextLine();
        System.out.println("Nhập năm sản xuất");
        int namSanXuat = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập người điều phối");
        String nguoiDieuPhoi = scanner.nextLine();
        System.out.println("Nhập tâm bay");
        float tamBayToiDa = Float.parseFloat(scanner.nextLine());
        return new Drone(soHieu,hangSanXuat,namSanXuat,nguoiDieuPhoi,tamBayToiDa);
    }
    public static int inputId(){
        System.out.println("Nhập id cần xoá");
        return Integer.parseInt(scanner.nextLine());
    }

    public static void displayList(List<Drone> list){
        for (int i = 0; i <list.size() ; i++) {
            System.out.println(list.get(i));
        }
    }
}
