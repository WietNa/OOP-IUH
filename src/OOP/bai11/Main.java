package OOP.bai11;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
            float[] diem1 = {8f, 5f, 6f, 10f, 10f};
            float[] diem2 = {6.5f, 7f, 5f, 6.5f, 6f};
            float[] diem3 = {9f, 9f, 8f, 10f, 3f};

            Student st1 = new Student("Vu An Thanh Tung", LocalDate.of(1997, 11, 7), diem1);
            Student st2 = new Student("Nguyen Minh Hieu", LocalDate.of(1997, 2, 16), diem2);
            Student st3 = new Student("Nguyen Ho Gia Han", LocalDate.of(1997, 2, 1), diem3);
            Student st4 = new Student();

            System.out.println(st1.ghiChu());
            System.out.println(st2.ghiChu());
            System.out.println(st3.ghiChu());
            System.out.println(st4.ghiChu());
    }
}

