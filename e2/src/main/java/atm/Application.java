package atm;

import java.util.ArrayList;

public class Application {
    public static void main(String[] args) {
        ATM atm=new CitySystemAtm();
        ArrayList<Cell> cells=new ArrayList<>();

        Cell cell1=new Cell(100, 5);
        Cell cell2=new Cell(200,5);
        Cell cell3=new Cell(500, 100);

        cells.add(cell1);
        cells.add(cell2);
        cells.add(cell3);

        System.out.println(cells);
        atm.setInitState(cells);

        System.out.println(atm.getSum());
        atm.deposit(100, 5);
        System.out.println(atm.getSum());

        atm.withDraw(200, 2);
        System.out.println(atm.getSum());

        Repair repair =new CitySystemAtm();
        repair.repair();
        Clean clean =new CitySystemAtm();
        clean.clean();
    }
}
