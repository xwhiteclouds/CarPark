package fop.w5cars;

public class CarPark {

    int n;
    Car[] spaces;

    public CarPark(int n) {
        this.n = n;
        this.spaces = new Car[n];
    }

    int park(Car c){
        int count = 0;
        for (int i = 0; i < spaces.length; i++){
            if (spaces[i] != null){
                count++;
            }
            if (spaces[i] == null){
                spaces[i] = c;
                count++;
                break;
            }
        }

        if (count == spaces.length)
            return -1;
        else
            return count;
    }

    int search(LicensePlate lp){
        for (int i = 0; i < spaces.length; i++){
            if (spaces[i] != null){
                if (spaces[i].lp.isEqual(lp)){
                    return i;
                }
            }
        }
        return -1;
    }

    Car driveOff(LicensePlate lp){
        for (int i = 0; i < spaces.length; i++) {
            if (spaces[i].lp.isEqual(lp)) {
                Car DroveOff = spaces[i];
                spaces[i] = null;
                return DroveOff;
            }
        }
        return null;
    }

    void printCp(){
        for (int i = 0; i < spaces.length; i++){

            if (this.spaces[i] == null){
                System.out.println(i + "\t\t" + null);
            }else
                System.out.println(i + "\t\t" + spaces[i].printCar());
        }
    }

}
