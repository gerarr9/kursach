import java.sql.SQLOutput;
import java.util.Random;

public class Main {
    private static final Employee[] EMPLOYEES = new Employee[10];

    public static void main(String[] args) {
        EMPLOYEES[0] = new Employee("Муратов Руслан Мергенович", 1, 50_000);
        EMPLOYEES[1] = new Employee("МБуга Бригада Марбадович", 1, 55_000);
        EMPLOYEES[2] = new Employee("Ашучеч Мичеч Лапович", 1, 53_000);
        EMPLOYEES[3] = new Employee("Кукарек Кутак Мутакович", 1, 35_000);
        EMPLOYEES[4] = new Employee("Газманов Олег Петрович", 2, 25_000);
        printFullInfo();
        int totalMoney = getTotalMoney();
        getTotalMoney();
        System.out.println("Всего деняг " + totalMoney);
         minSalary();
        System.out.println("Минимальная зарплата у "+minSalary());
        maxSalary();
        System.out.println("Максимальная зарплата у "+maxSalary());
        System.out.println("Средняя зарплата "+midSalary());
        printFullName();
    }

    private static void printFullInfo() {
        for (Employee employee : EMPLOYEES) {
            if (employee != null) {
                System.out.println(employee);
            }
        }
    }


    private static int getTotalMoney() {
        int sum = 0;
        for (Employee employee : EMPLOYEES) {
            if (employee != null) {
                sum += employee.getMoney();
            }
        }
        return sum;
    }

    private static Employee minSalary() {
        int min = Integer.MAX_VALUE;
        Employee employeeMinMoney = null;
        for (Employee employee : EMPLOYEES) {
            if (employee != null && employee.getMoney() < min) {
                min = employee.getMoney();
                employeeMinMoney = employee;
            }
        }
        return employeeMinMoney;
    }
    private static Employee maxSalary() {
        int max = Integer.MIN_VALUE;
        Employee employeeMaxMoney = null;
        for (Employee employee : EMPLOYEES) {
            if (employee != null && employee.getMoney() >max) {
                max = employee.getMoney();
                employeeMaxMoney = employee;
            }
        }
        return employeeMaxMoney;
    }
    private static double midSalary() {
        int count =0;
        for (Employee employee :EMPLOYEES){
            if (employee != null) {
                count++;
            }
            if (count != 0){
                return (double) getTotalMoney() / count;
            }
        }
        return  0;
    }
    private static void printFullName() {
        for (Employee employee : EMPLOYEES) {
            if (employee != null) {
                System.out.println(employee.getFullName());
            }
        }
    }
}
