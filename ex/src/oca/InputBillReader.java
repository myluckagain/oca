package oca;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputBillReader {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));



    public UtilityBill readTotalBill() throws IOException {

        UtilityBill utilityBill = new UtilityBill();

        System.out.println("Введите общую сумму за электричество и нажмите Enter:");

        String input = this.reader.readLine();
        utilityBill.setElectricity(Double.parseDouble(input));

        System.out.println("Введите общую сумму за отопление и нажмите Enter:");
        input = this.reader.readLine();
        utilityBill.setHeating(Double.parseDouble(input));

        System.out.println("Введите общую сумму за мусор и нажмите Enter:");
        input = this.reader.readLine();
        utilityBill.setGarbageRemoval(Double.parseDouble(input));

        return utilityBill;
    }

    public double[] readAreas() throws IOException {

        System.out.println("Введите площади через пробел и нажмите Enter:");

        String line = this.reader.readLine();

        String[] stringAreas = line.split(" ");

        double[] areas = new double[stringAreas.length];

        for (int i = 0; i < stringAreas.length; i++) {
            areas[i] = Double.parseDouble(stringAreas[i]); // 2.5.4
        }

        return areas;
    }
}
