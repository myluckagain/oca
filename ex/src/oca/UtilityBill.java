package oca;

public class UtilityBill {

    private double electricity;
    private double heating;
    private double garbageRemoval;

    public double getElectricity() {
        return electricity;
    }

    public void setElectricity(double electricity) {
        this.electricity = electricity;
    }

    public double getHeating() {
        return heating;
    }

    public void setHeating(double heating) {
        this.heating = heating;
    }

    public double getGarbageRemoval() {
        return garbageRemoval;
    }

    public void setGarbageRemoval(double garbageRemoval) {
        this.garbageRemoval = garbageRemoval;
    }


    @Override
    public final String toString() {
        return "UtilityBill{" +
                "electricity=" + electricity +
                ", heating=" + heating +
                ", garbageRemoval=" + garbageRemoval +
                '}';
    }

}
