package siniflar.maas_hesaplayici;

public class Employee {
    String name;
    double salary;
    int workHours;
    int hireYear;
    double tax;
    int bonus;
    double raiseSalary;


    public Employee(String name, double salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    double calculateTax () {
        double tax = 0;
        if (this.salary < 0) {
            tax = 0;
        } else {
            tax = salary *0.03;
        }
        System.out.println("Vergi Kesintisi: " + tax);
        return tax;
    }

    int calcBonus() {

        if (this.workHours > 40 ) {
            System.out.println("Bonus: " + (this.workHours - 40) * 30 );
            return (this.workHours - 40) * 30;
        } else {
            return  0;
        }
    }

    double calcRaiseSalary() {

        if (this.hireYear <= 2002) {
            raiseSalary = salary * 0.15;
        } else if (this.hireYear <= 2012) {
            raiseSalary = salary * 0.10;
        } else {
            raiseSalary = salary * 0.05;
        }
        System.out.println("Maaş zammı: " + raiseSalary);
        return raiseSalary;
    }

    double calcTotalPayment() {
        double totalPayment = salary - tax + bonus + raiseSalary;
        System.out.println("Ödenecek Maaş: " + totalPayment);
        return totalPayment;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                ", workHours=" + workHours +
                ", hireYear=" + hireYear +
                '}';
    }
}
