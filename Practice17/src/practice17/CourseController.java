package practice17;

public class CourseController {
    private Course model;
    private CourseView view;

    public CourseController(Course model, CourseView view) {
        this.model = model;
        this.view = view;
    }

    public void setCourseName(String name) { model.setName(name); }
    public void setCourseId(String id) { model.setId(id); }
    public void setCourseCategory(String category) { model.setCategory(category); }

    public String getCourseName() { return model.getName(); }
    public String getCourseId() { return model.getId(); }
    public String getCourseCategory() { return model.getCategory(); }

    public void updateView() {
        view.printCourseDetails(model.getName(), model.getId(), model.getCategory());
    }
}
