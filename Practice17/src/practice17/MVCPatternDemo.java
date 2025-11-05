package practice17;

public class MVCPatternDemo {

    public static Student retrieveStudentFromDatabase() {
        Student student = new Student("10", "Robert");
        return student;
    }

    public static void runDemo() {
        Student model = retrieveStudentFromDatabase();
        StudentView view = new StudentView();
        StudentController controller = new StudentController(model, view);

        System.out.println("Before update:");
        controller.updateView();

        controller.setStudentName("Michael");
        controller.setStudentRollNo("20");

        System.out.println("\nAfter update:");
        controller.updateView();
    }
}
