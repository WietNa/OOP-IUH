package OOP.bai12;

import java.time.LocalDate;
import java.util.Scanner;
import java.util.concurrent.Callable;

public class Main {
    private static Scanner sc = new Scanner(System.in);
    private static Manage mg = new Manage();

    private static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    private static void menuKhoaHoc() {
        boolean isBack = false;
        while (!isBack) {
            clearScreen();
            System.out.println("0. Tro ve chuong trinh chinh");
            System.out.println("1. Them Khoa Hoc");
            System.out.println("2. Tim Khoa Hoc theo ten");
            System.out.println("3. In Khoa Hoc chua ket thuc");
            System.out.println("4. In Khoa hoc chua bat dau");
            String userInput = sc.nextLine();
            switch (userInput) {
                case "0":
                    isBack = true;
                    break;
                case "1": {
                    clearScreen();
                    Course cr = Course.createByInput();
                    mg.addCourse(cr);
                    System.out.println("Nhan enter de ket thuc");
                    sc.nextLine();
                    break;
                }

                case "2": {
                    clearScreen();
                    System.out.println("Nhap ten khoa hoc: ");
                    String tenCourse = sc.nextLine();
                    Course cr = mg.getKhoaHocByName(tenCourse);
                    if (cr == null) {
                        System.out.println("Khong tim thay khoa hoc");
                    }
                    else {
                        System.out.println("Chi Tiet Khoa Hoc: ");
                        System.out.println(cr.chiTietCourse());
                        System.out.println("Danh sach hoc vien: ");
                        cr.inDanhSachStudent();
                    }
                    System.out.println("nhan enter de quay lai");
                    sc.nextLine();
                    break;
                }
                case "3": {
                    clearScreen();
                    System.out.println("Khoa hoc chua ket thuc: ");
                    mg.printKhoaHocChuaKetThuc();
                    System.out.println("nhan enter de quay lai");
                    sc.nextLine();
                    break;
                }
                case "4": {
                    clearScreen();
                    System.out.println("Khoa hoc chua bat dau: ");
                    mg.printKhoaHocChuaBatDau();
                    System.out.println("nhan enter de quay lai");
                    sc.nextLine();
                    break;
                }
                default:
                    clearScreen();
                    System.out.println("Unknown Command");
                    System.out.println("nhan enter de quay lai");
                    sc.nextLine();
                    break;
            }
        }
    }

    private static void menuHocVien() {
        boolean isBack = false;
        while (!isBack) {
            clearScreen();
            System.out.println("0. Tro ve chuong trinh chinh");
            System.out.println("1. Them Hoc Vien vao Khoa hoc");
            System.out.println("2. Tim Hoc vien theo so dien thoai");
            String userInput = sc.nextLine();
            switch (userInput) {
                case "0":
                    isBack = true;
                    break;
                case "1": {
                    clearScreen();
                    System.out.println("Nhap ten khoa hoc: ");
                    String tenCourse = sc.nextLine();
                    Course cr = mg.getKhoaHocByName(tenCourse);
                    if (cr == null) {
                        System.out.println("Khong tim thay Khoa hoc de them vao");
                    }
                    else {
                        Student st = Student.createByInput();
                        mg.addHocVienToKhoaHoc(st, cr);
                    }
                    System.out.println("Nhan enter de ket thuc");
                    sc.nextLine();
                    break;
                }
                case "2": {
                    clearScreen();
                    System.out.println("Nhap ten so dien thoai: ");
                    String soDienThoai = sc.nextLine();
                    Student st = mg.getHocVienByPhone(soDienThoai);
                    if (st == null) {
                        System.out.println("Khong tim thay hoc vien");
                    }
                    else {
                        System.out.println("Chi Tiet Hoc Vien: ");
                        System.out.println(st.chiTietStudent());
                        System.out.println("Danh sach Khoa hoc hoc vien da tham gia: ");
                        st.inDSCourse();
                    }
                    System.out.println("nhan enter de quay lai");
                    sc.nextLine();
                    break;
                }
                default:
                    System.out.println("Unknown Command");
                    System.out.println("nhan enter de quay lai");
                    sc.nextLine();
                    break;
            }
        }
    }

    private static void mainMenu() {
        boolean isStop = false;
        while (!isStop) {
            clearScreen();
            System.out.println("================Chuong Trinh Quan Ly Trung Tam Dao Tao================");
            System.out.println("----------------------------------------------------------------------");
            System.out.println("0. Thoat Chuong Trinh");
            System.out.println("1. Khoa Hoc");
            System.out.println("2. Hoc Vien");
            String userInput = sc.nextLine();
            switch (userInput) {
                case "0":
                    isStop = true;
                    break;
                case "1":
                    menuKhoaHoc();
                    break;
                case "2":
                    menuHocVien();
                    break;
                default:
                    System.out.println("Unknown Command");
                    break;
            }
        }
    }

    public static void main(String[] args) {
        mainMenu();

        Manage mg = new Manage();

        Course cr1 = new Course("DATASTRUCTURE", LocalDate.of(2021, 4, 1), 60);
        Course cr2 = new Course("OOP", LocalDate.of(2021, 1, 1), 30);
        Course cr3 = new Course("NETWORK_PROGRAMMING", LocalDate.of(2021, 3, 2), 15);
        Course cr4 = new Course("GAME_ENGINE", LocalDate.of(2020, 11, 23), 120);

        Student st1 = new Student("Vu An Thanh Tung", "125 Nguyen The Truyen", "0389509326");
        Student st2 = new Student("Nguyen Cong Quoc", "244 Truong Chinh", "0976879431");
        Student st3 = new Student("Nguyen Minh Hieu", "144 Au Co", "0987665543");
        Student st4 = new Student("Nguyen Ho Gia Han", "109 Nguyen Hue", "0352889765");
    }
}
