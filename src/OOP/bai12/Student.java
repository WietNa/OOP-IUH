package OOP.bai12;

import java.util.ArrayList;
import java.util.Scanner;

public class Student {
    private static Scanner sc = new Scanner(System.in);

    private String hoTen;
    private String diaChi;
    private String soDienThoai;
    private ArrayList<Course> listCourse = new ArrayList<>();

    public static Student createByInput() {
        System.out.println("Nhap ho ten hoc vien: ");
        String hoTen = sc.nextLine();
        System.out.println("Nhap dia chi hoc vien: ");
        String diaChi = sc.nextLine();
        System.out.println("Nhap so dien thoai: ");
        String soDienThoai = sc.nextLine();
        return new Student(hoTen, diaChi, soDienThoai);
    }

    public Student() {
        hoTen = "chua xac dinh";
        diaChi = "chua xac dinh";
        soDienThoai = "chua xac dinh";
    }

    public Student(String hoTen, String diaChi, String soDienThoai) {
        if (!hoTen.equals(""))
            this.hoTen = hoTen;
        else
            this.hoTen = "chua xac dinh";

        if (!diaChi.equals(""))
            this.diaChi = diaChi;
        else
            this.diaChi = "chua xac dinh";

        if (!soDienThoai.equals(""))
            this.soDienThoai = soDienThoai;
        else
            this.soDienThoai = "chua xac dinh";
    }

    public String getHoTen() {
        return hoTen;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public String getSoDienThoai() {
        return soDienThoai;
    }

    public void setHoTen(String hoTen) {
        if (!hoTen.equals(""))
            this.hoTen = hoTen;
    }

    public void setDiaChi(String diaChi) {
        if (!diaChi.equals(""))
            this.diaChi = diaChi;
    }

    public void setSoDienThoai(String soDienThoai) {
        if (!soDienThoai.equals(""))
            this.soDienThoai = soDienThoai;
    }

    public void themVaoCourse(Course course) {
        listCourse.add(course);
    }

    public String chiTietStudent() {
        return String.format("%-20s %-20s %-20s", hoTen, diaChi, soDienThoai);
    }

    public void inDSCourse() {
        for (Course cr : listCourse)
            System.out.println(cr.chiTietCourse());
    }
}
