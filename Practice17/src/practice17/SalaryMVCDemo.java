package practice17;

public class SalaryMVCDemo {
    public static void runDemo() {
        Employee employee = new Employee("Иван Иванов", 500, 160);
        EmployeeView view = new EmployeeView();
        EmployeeController controller = new EmployeeController(employee, view);

        System.out.println("До изменения:");
        controller.updateView();

        controller.setHourlyRate(550);
        controller.setHoursWorked(170);

        System.out.println("\nПосле изменения:");
        controller.updateView();
    }
}
