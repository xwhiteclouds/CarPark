package fop.w5cars;

public class Main {
    public static void main(String[] args) {
        LicensePlate lp1 = new LicensePlate("geo", "abcabc", 234);
        Car c1 = new Car("anano", lp1);
        LicensePlate lp2 = new LicensePlate("usa", "asdahda", 237);
        Car c2 = new Car("dhasda", lp2);
        CarPark cp = new CarPark(3);
        cp.park(c1);
        cp.park(c2);


//        System.out.println(cp.search(lp1));
//        System.out.println(cp.driveOff(lp1).brand);
        cp.printCp();
        System.out.println("\n\n");
        cp.driveOff((lp1));
        cp.printCp();
    }

}
