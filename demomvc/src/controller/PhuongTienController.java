package controller;

import entity.Drone;
import entity.XeTuanTraMatTrang;
import service.DroneService;
import service.IDroneService;
import service.IXeTuanTraService;
import service.XeTuanTraMatTrangService;
import view.DroneView;
import view.XeTuanTraMatTrangView;

import java.util.List;
import java.util.Scanner;

public class PhuongTienController {
    private IDroneService droneService = new DroneService();
    private IXeTuanTraService xeTuanTraService = new XeTuanTraMatTrangService();
    public void displayMainMenu() {
        final int DISPLAY = 1;
        final int ADD = 2;
        final int DELETE = 3;
        final int SEARCH = 4;
        Scanner scanner = new Scanner(System.in);
        boolean flag = true;
        while (flag) {
            System.out.println("------------Quản lý phương tiện--------------" +
                    "\n 1.Danh sách" +
                    "\n 2.Thêm mới" +
                    "\n 3.Xoá" +
                    "\n 4.Tìm kiếm" +
                    "\n 5.Thoát");
            System.out.println("---Chọn chức năng------------");
            int choose = Integer.parseInt(scanner.nextLine());
            switch (choose) {
                case DISPLAY:
                    displayMenu();
                    break;
                case ADD:
                    addMenu();
                    break;
                case DELETE:
                    // nhập id cần xoá

                    break;
                case SEARCH:
                    System.out.println("Đây là chức năng tìm kiếm");
                    break;
                default:
                    flag = false;
            }
        }
    }
    public void displayMenu() {
        final int DRONE = 1;
        final int XE_TUAN_TRA_MAT_TRANG = 2;
        Scanner scanner = new Scanner(System.in);
        boolean flag = true;
        while (flag) {
            System.out.println("------------Chọn phương tiện--------------" +
                    "\n 1.Drone" +
                    "\n 2.Xe tuần tra mặt trăng" +
                    "\n 3.Quy lại menu chính");
            System.out.println("---Chọn chức năng------------");
            int choose = Integer.parseInt(scanner.nextLine());
            switch (choose) {
                case DRONE:
                     List<Drone> droneList = droneService.findAll();
                     DroneView.displayList(droneList);
                    break;
                case XE_TUAN_TRA_MAT_TRANG:
                    List<XeTuanTraMatTrang> xeTuanTraMatTrangList = xeTuanTraService.findAll();
                    XeTuanTraMatTrangView.displayList(xeTuanTraMatTrangList);
                    break;
                default:
                    flag = false;
            }
        }
    }
    public void addMenu() {
        final int DRONE = 1;
        final int XE_TUAN_TRA_MAT_TRANG = 2;
        Scanner scanner = new Scanner(System.in);
        boolean flag = true;
        while (flag) {
            System.out.println("------------Chọn phương tiện--------------" +
                    "\n 1.Drone" +
                    "\n 2.Xe tuần tra mặt trăng" +
                    "\n 3.Quy lại menu chính");
            System.out.println("---Chọn chức năng------------");
            int choose = Integer.parseInt(scanner.nextLine());
            switch (choose) {
                case DRONE:
                    Drone drone = DroneView.inputData();
                    droneService.add(drone);
                    System.out.println("Thêm mới thanh công");
                    break;
                case XE_TUAN_TRA_MAT_TRANG:
                    XeTuanTraMatTrang xeTuanTraMatTrang = XeTuanTraMatTrangView.inputData();
                    xeTuanTraService.add(xeTuanTraMatTrang);
                    System.out.println("Thêm mới thanh công");
                    break;
                default:
                    flag = false;
            }
        }
    }
}
