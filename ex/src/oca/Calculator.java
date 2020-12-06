package oca;

public class Calculator {

    private double[] areas;
    private double[] proportions;
    private UtilityBill totalUtilityBill;


    public Calculator(UtilityBill totalUtilityBill, double... areas) {

        this.totalUtilityBill=totalUtilityBill;
        this.areas = areas;
        this.proportions = calculateProportions();

    }

    private double[] calculateProportions() {
        double totalArea = 0;
        for (int i = 0; i < areas.length; i++) {
            totalArea = totalArea + areas[i];
        }

        double[] proportions = new double[areas.length];

        for (int i = 0; i < areas.length; i++) {
            proportions[i] = areas[i] / totalArea;
        }

        return proportions;
    }

    public UtilityBill[] getBills() {
        UtilityBill[] utilityBills = new UtilityBill[areas.length];

        for (int i = 0; i < areas.length; i++) {
            UtilityBill utilityBill = new UtilityBill();
            utilityBills[i] = utilityBill;

            utilityBill.setElectricity(totalUtilityBill.getElectricity() * this.proportions[i]);
            utilityBill.setGarbageRemoval(totalUtilityBill.getGarbageRemoval() * this.proportions[i]);
            utilityBill.setHeating(totalUtilityBill.getHeating() * this.proportions[i]);

        }
        return utilityBills;
    }
}
