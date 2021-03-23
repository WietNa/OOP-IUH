package OOP.bai3;

public class Main {
    public static void main(String[] args) {
        TamGiac tamgiac1 = new TamGiac(1, 4, 1);
        TamGiac tamgiac2 = new TamGiac(-3, 5, 1);
        TamGiac tamgiac3 = new TamGiac(2, 3, 4);
        TamGiac tamgiac4 = new TamGiac(4, 4, 3);
        TamGiac tamgiac5 = new TamGiac(7, 7, 7);

        System.out.printf("%-10s %-10s %-10s %-20s %-10s %-10s\n", "CanhA", "CanhB", "CanhC", "Kieu Tam Giac", "CV", "DT");
        System.out.println(tamgiac1.toString());
        System.out.println(tamgiac2.toString());
        System.out.println(tamgiac3.toString());
        System.out.println(tamgiac4.toString());
        System.out.println(tamgiac5.toString());
    }
}
