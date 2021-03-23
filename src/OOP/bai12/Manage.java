package OOP.bai12;

import java.util.ArrayList;

public class Manage {
    private ArrayList<Course> listCoruse = new ArrayList<>();
    private ArrayList<Student> listStudent = new ArrayList<>();

    public Manage() {
    }

    public Student getHocVienByPhone(String phone) {
        for (Student st : listStudent) {
            if (st.getSoDienThoai().equals(phone))
                return st;
        }
        return null;
    }

    public Course getKhoaHocByName(String name) {
        for (Course cr : listCoruse) {
            if (cr.getTenCourse().equals(name))
                return cr;
        }
        return null;
    }

    public void addCourse(Course cr){
        listCoruse.add(cr);
    }

    public void addHocVienToKhoaHoc(Student st, Course cr) {
        for (Student temp : listStudent)
            if (st.getSoDienThoai().equals(temp.getSoDienThoai())) return;
        listStudent.add(st);
        cr.themStudent(st);
    }

    public void printKhoaHocOfHocVien(Student st) {
        st.inDSCourse();
    }

    public void printKhoaHocChuaKetThuc() {
        for (Course cr : listCoruse)
            if (cr.chuaKetThuc()) System.out.println(cr.chiTietCourse());
    }

    public void printKhoaHocChuaBatDau() {
        for (Course cr : listCoruse)
            if (cr.chuaBatDau()) System.out.println(cr.chiTietCourse());
    }
}
