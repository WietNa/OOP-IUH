package OOP.bai7;

import java.text.DecimalFormat;

public class HinhTron {
    private Diem center;
    private double radius;

    public HinhTron() {
        center = new Diem();
        radius = 0.0;
    }

    public HinhTron(Diem center, double radius) {
        this.center = center;
        this.radius = radius;
    }

    public void setCenter(Diem center)
    {
        this.center = center;
    }

    public void setRadius(double radius)
    {
        this.radius = radius;
    }

    public Diem getCenter()
    {
        return center;
    }

    public double getRadius()
    {
        return radius;
    }

    public double perimeter()
    {
        return radius * 2.0 * Math.PI;
    }

    public double area()
    {
        return radius * radius * Math.PI;
    }

    @Override
    public String toString() {
        DecimalFormat df = new DecimalFormat("#.000");
        return "Hinh tron co tam " + center.toString() + " voi ban kinh " + radius
                + " co dien tich va chu vi lan luot la " + df.format(area()) + " va " +
                df.format(perimeter());
    }
}