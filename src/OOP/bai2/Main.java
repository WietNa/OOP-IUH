package OOP.bai2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        Student student1 = new Student(111, "Vu An Thanh Tung", 6.7f, 5.7f);
        Student student2 = new Student(222, "Nguyen Minh Hieu", 7.7f, 9.7f);
        Student student3 = new Student();

        System.out.println("Nhap HoTen: ");
        String name = sc.nextLine();
        System.out.println("Nhap MSSV: ");
        int mssv = sc.nextInt();
        System.out.println("Nhap diem LT: ");
        float diemLT = sc.nextFloat();
        System.out.println("Nhap diem TH: ");
        float diemTH = sc.nextFloat();
        student3.setMaStudent(mssv);
        student3.setHoTen(name);
        student3.setDiemLT(diemLT);
        student3.setDiemTH(diemTH);

        System.out.printf("%-10s %-30s %10s   %10s   %10s\n", "MSSV", "Ho Va Ten", "Diem LT", "Diem TH", "Diem TB");
        System.out.println(student1.toString());
        System.out.println(student2.toString());
        System.out.println(student3.toString());

    }
}
