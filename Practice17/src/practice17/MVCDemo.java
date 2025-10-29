package practice17;

public class MVCDemo {
    public static void runDemo() {
        Course course = new Course("Java Programming", "01", "IT");
        CourseView view = new CourseView();
        CourseController controller = new CourseController(course, view);

        System.out.println("До изменения:");
        controller.updateView();

        // Изменяем данные
        controller.setCourseName("Python Development");
        controller.setCourseCategory("Software Engineering");

        System.out.println("\nПосле изменения:");
        controller.updateView();
    }
}
