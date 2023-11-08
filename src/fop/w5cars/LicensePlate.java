package fop.w5cars;

public class LicensePlate {

    String regionalCode;
    String letters;
    int digits;


    public LicensePlate(String regionalCode, String letters, int digits) {
        this.regionalCode = regionalCode;
        this.letters = letters;
        this.digits = digits;
    }

    boolean isEqual(LicensePlate other){
        int regCode = this.regionalCode.compareTo(other.regionalCode);
        int lett = this.letters.compareTo(other.letters);
        if (regCode == 0 && lett == 0 && this.digits == other.digits){
            return true;
        }
        return false;
    }

    public String printLP(){
//        <regionalCode>:<letters> <digits>
        return "<" + this.regionalCode + ">:\t" + "<" + this.letters + ">   " + "<" + this.digits + ">";
    }

}
