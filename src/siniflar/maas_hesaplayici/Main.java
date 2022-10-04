package siniflar.maas_hesaplayici;

public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee("Kemal", 2000, 45, 1985);
        System.out.println(employee);
        employee.calculateTax();
        employee.calcBonus();
        employee.calcRaiseSalary();
        employee.calcTotalPayment();

    }
}
