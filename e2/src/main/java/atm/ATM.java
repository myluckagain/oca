package atm;

import java.util.ArrayList;

public abstract class ATM implements Repair, Clean {
    int i=0;
    protected ArrayList<Cell> cells;

    public void setInitState(ArrayList<Cell> cells) {

        this.cells = new ArrayList<>();
        for (Cell cell : cells) {
            Cell localCell = new Cell();
            localCell.setNominal(cell.getNominal());
            localCell.setCount(cell.getCount());
            this.cells.add(localCell);
        }
    }

   public void deposit(int nominal, int count) {
        for (Cell cell : cells) {
            if (cell.getNominal() == nominal) {
                int newCount = cell.getCount() + count;
                cell.setCount(newCount);
            }
        }
    }

    public abstract void withDraw(int nominal, int count) ;

    public int getSum() {
        int sum = 0;
        for (Cell cell : cells) {
            sum = sum + cell.getNominal() * cell.getCount();
        }
        return sum;
    }
}
