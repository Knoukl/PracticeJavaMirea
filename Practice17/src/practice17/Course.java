package practice17;

public class Course {
    private String courseName;
    private String courseId;
    private String courseCategory;

    public Course(String courseName, String courseId, String courseCategory) {
        this.courseName = courseName;
        this.courseId = courseId;
        this.courseCategory = courseCategory;
    }

    public String getId() {
        return courseId;
    }

    public void setId(String id) {
        this.courseId = id;
    }

    public String getName() {
        return courseName;
    }

    public void setName(String name) {
        this.courseName = name;
    }

    public String getCategory() {
        return courseCategory;
    }

    public void setCategory(String category) {
        this.courseCategory = category;
    }
}
