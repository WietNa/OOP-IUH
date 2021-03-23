package OOP.bai4;

public class Main {
    public static void main(String[] args)
    {
        Vehicle vehicle1 = new Vehicle("Nguyen Minh Hieu", "Future Neo", 35000000f, 100f);
        Vehicle vehicle2 = new Vehicle("Nguyen Ho Gia Han", "Ford Ranger", 250000000f, 3000f);
        Vehicle vehicle3 = new Vehicle("Vu An Thanh Tung", "Landscape", 1000000000f, 1500f);

        System.out.printf("%-30s %-20s %14s %20s %18s\n", "Ten Chu Xe", "Loai Xe", "Dung Tich", "Tri Gia", "Thue Phai Nop");
        System.out.println("===========================================================================================================");
        System.out.println(vehicle1);
        System.out.println(vehicle2);
        System.out.println(vehicle3);
    }
}
