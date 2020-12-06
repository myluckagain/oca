package oca;

//Переделать в ArrayList, поменять любые for на while

public class Application {


    public static void main(String[] args) {

        InputBillReader inputBillReader = new InputBillReader();
        try {
            //входные данные с консоли:
            //общий счет
            UtilityBill totalBill = inputBillReader.readTotalBill();
            // площади через пробел
            double[] areas = inputBillReader.readAreas();

            //вычисление
            Calculator calculator = new Calculator(totalBill, areas);
            UtilityBill[] bills = calculator.getBills();

            // вывод результата в консоль
            System.out.println("Получили такие отдельные счета:");
            for (UtilityBill utilityBill : bills) {
                System.out.println(utilityBill.toString());
            }

        } catch (Exception e) {
            System.out.println("Ошибка данных");
            e.printStackTrace();

        }

    }
}
