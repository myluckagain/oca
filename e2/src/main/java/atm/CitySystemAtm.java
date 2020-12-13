package atm;

public class CitySystemAtm extends ATM {

    public void deposit(int nominal, int count) {
        System.out.println("CitySystemAtm deposit");
        super.deposit(nominal, count);
    }

    public void withDraw(int nominal, int count) {
        System.out.println("ничего");
        for (Cell cell : cells) {
            if (cell.getNominal() == nominal && cell.getCount() >= count) {
                cell.setCount(cell.getCount() - count);
            }
        }
    }

    void anotherMethod() {

    }

    @Override
    public void repair() {
        System.out.println("repair");
    }

    @Override
    public void clean() {
        System.out.println("clean");
    }
}
