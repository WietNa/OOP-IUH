package OOP.bai3;

public class TamGiac {
    private float ma;
    private float mb;
    private float mc;

    public TamGiac(float ma, float mb, float mc) {
        boolean noTriangle = (ma + mb <= mc || ma + mc <= mb || mb + mc <= ma);
        if (ma <= 0 || mb <= 0 || mc <= 0 || noTriangle) {
            this.ma = 0f;
            this.mb = 0f;
            this.mc = 0f;
        }
        else {
            this.ma = ma;
            this.mb = mb;
            this.mc = mc;
        }

    }

    public TamGiac() {
        ma = 0f;
        mb = 0f;
        mc = 0f;
    }

    public float getMA() {
        return ma;
    }

    public float getMB() {
        return mb;
    }

    public float getMC() {
        return mc;
    }

    public void setMA(float ma) {
        boolean notTriangle = (ma + this.mb <= this.mc
                || ma + this.mc <= this.mb || this.mb + this.mc <= ma);

        if (ma <= 0 || notTriangle) {
        }
        else {
            this.ma = ma;
        }
    }

    public void setMB(float mb) {
        boolean notTriangle = (this.ma + mb <= this.mc
                || this.ma + this.mc <= mb || mb + this.mc <= this.ma);

        if (mb <= 0 || notTriangle) {
        }
        else {
            this.mb = mb;
        }
    }

    public void setMC(float mc) {
        boolean notTriangle = (this.ma + this.mb <= mc
                || this.ma + mc <= this.mb || this.mb + mc <= this.ma);

        if (mc <= 0 || notTriangle) {
        }
        else {
            this.mc = mc;
        }
    }

    public float P()
    {
        return ma + mb + mc;
    }

    public double S() {
        double p = (ma + mc + mc)/2.0f;

        return Math.sqrt(p * (p - ma) * (p - mb) * (p - mc));
    }

    public String KTamGiac() {
        boolean TamGiacDeu = (ma == mb && ma == mc);
        boolean TamGiacCan = (ma == mb || ma == mc || mb == mc);
        boolean TamGiacVuong = (ma*ma + mb*mb == mc*mc ||
                ma*ma + mc*mc == mb*mb || mb*mb + mc*mc == ma*ma);

        boolean KhongPhaiTamGiac = (ma + mb <= mc || ma + mc <= mb
                || mb + mc <= ma);

        if (KhongPhaiTamGiac)
            return "Khong phai tam giac";
        else
        if (TamGiacDeu)
            return "Tam giac deu";
        else if (TamGiacVuong && TamGiacCan)
            return "Tam giac vuong can";
        else if (TamGiacCan)
            return "Tam giac can";
        else if (TamGiacVuong)
            return "Tam giac vuong";
        else
            return "Tam giac thuong";
    }

    @Override
    public String toString() {
        return String.format("%-10.2f %-10.2f %-10.2f %-20s %-10.2f %-10.2f",
                ma, mb, mc, KTamGiac(), P(), S());
    }
}
