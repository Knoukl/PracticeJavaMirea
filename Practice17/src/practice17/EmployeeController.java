package practice17;

public class EmployeeController {
    private Employee model;
    private EmployeeView view;

    public EmployeeController(Employee model, EmployeeView view) {
        this.model = model;
        this.view = view;
    }

    public void setEmployeeName(String name) { model.setName(name); }
    public void setHourlyRate(double rate) { model.setHourlyRate(rate); }
    public void setHoursWorked(int hours) { model.setHoursWorked(hours); }

    public void updateView() {
        view.printEmployeeDetails(model.getName(), model.calculateSalary());
    }
}
