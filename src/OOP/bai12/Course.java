package OOP.bai12;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;

public class Course {
    private static Scanner sc = new Scanner(System.in);

    private String tenCourse;
    private LocalDate ngayMo;
    private int thoiGianHoc;
    private ArrayList<Student> listStudent = new ArrayList<>();

    public static Course createByInput() throws NumberFormatException
    {
        System.out.println("Nhap ten khoa hoc: ");
        String tenCourse = sc.nextLine();
        System.out.println("Nhap nam bat dau: ");
        int nam = Integer.parseInt(sc.nextLine());
        System.out.println("Nhap thang bat dau: ");
        int thang = Integer.parseInt(sc.nextLine());
        System.out.println("Nhap ngay bat dau: ");
        int ngay = Integer.parseInt(sc.nextLine());
        LocalDate date = LocalDate.of(nam, thang, ngay);
        System.out.println("Nhap so ngay hoc cua khoa hoc: ");
        int thoiGianHoc = Integer.parseInt(sc.nextLine());

        return new Course(tenCourse, date, thoiGianHoc);
    }

    public Course()
    {
        tenCourse = "chua xac dinh";
        ngayMo = LocalDate.of(9999, 12, 31);
        thoiGianHoc = 0;
    }

    public Course(String tenCourse, LocalDate ngayMo, int thoiGianHoc)
    {
        if (!tenCourse.equals(""))
            this.tenCourse = tenCourse;
        else
            this.tenCourse = "chua xac dinh";

        this.ngayMo = ngayMo;

        if (thoiGianHoc > 0)
            this.thoiGianHoc = thoiGianHoc;
        else
            this.thoiGianHoc = 0;
    }

    public String getTenCourse()
    {
        return tenCourse;
    }

    public LocalDate getNgayMo()
    {
        return ngayMo;
    }

    public int getThoiGianHoc()
    {
        return thoiGianHoc;
    }

    public void setTenCourse(String tenCourse)
    {
        if (!tenCourse.equals(""))
            this.tenCourse = tenCourse;
    }

    public void setNgayMo(LocalDate ngayMo)
    {
        this.ngayMo = ngayMo;
    }

    public void setThoiGianHoc(int thoiGianHoc)
    {
        if (thoiGianHoc > 0)
            this.thoiGianHoc = thoiGianHoc;
    }

    public void themStudent(Student student)
    {
        listStudent.add(student);
        student.themVaoCourse(this);
    }

    public String chiTietCourse()
    {
        DateTimeFormatter df = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        return String.format("%-20s %-15s %10d", tenCourse, ngayMo.format(df), thoiGianHoc);
    }

    public void inDanhSachStudent()
    {
        for (Student st : listStudent)
            System.out.println(st.chiTietStudent());
    }

    public boolean chuaKetThuc()
    {
        LocalDate ngayKetThuc = ngayMo.plusDays(thoiGianHoc);
        if (ngayKetThuc.isAfter(LocalDate.now()))
            return true;

        return false;
    }

    public boolean chuaBatDau()
    {
        if (ngayMo.isAfter(LocalDate.now()))
            return true;

        return false;
    }
}

