package OOP.bai2;

public class Student {
    private int maStudent;
    private String HoTen;
    private float diemLT;
    private float diemTH;
    public static int abc = 5;

    public Student()  {
        maStudent = 0;
        HoTen = "NULL";
        diemLT = 0f;
        diemTH = 0f;
    }

    public Student(int maStudent, String hoTen, float diemLT, float diemTH) {
        if (maStudent > 0)
            this.maStudent = maStudent;
        else
            maStudent = 0;

        if (!hoTen.equals(""))
            this.HoTen = hoTen;
        else
            this.HoTen = "NULL";

        if (diemLT >= 0f && diemLT <= 10f)
            this.diemLT = diemLT;
        else
            this.diemLT = 0f;

        if (diemTH >= 0f && diemTH <= 10f)
            this.diemTH = diemTH;
        else
            this.diemTH = 0f;
    }

    public int getMaStudent() {
        return maStudent;
    }

    public String getHoTen() {
        return HoTen;
    }

    public float getDiemLT() {
        return diemLT;
    }

    public float getDiemTH() {
        return diemTH;
    }

    public void setMaStudent(int maStudent) {
        if (maStudent > 0)
            this.maStudent = maStudent;
        else
            this.maStudent = 0;
    }

    public void setHoTen(String hoTen) {
        if (!hoTen.equals(""))
            this.HoTen = hoTen;
        else
            this.HoTen = "NULL";
    }

    public void setDiemLT(float diemLT) {
        if (diemLT >= 0f && diemLT <= 10f)
            this.diemLT = diemLT;
        else
            this.diemLT = 0f;
    }

    public void setDiemTH(float diemTH) {
        if (diemTH >= 0f && diemTH <= 10f)
            this.diemTH = diemTH;
        else
            this.diemTH = 0f;
    }

    public float getAvarage() {
        return (diemLT + diemTH) / 2f;
    }

    @Override
    public String toString() {
        return String.format("%-10d %-30s %5.2f   %5.2f   %5.2f", maStudent, HoTen, diemLT, diemTH, getAvarage());
    }

}
