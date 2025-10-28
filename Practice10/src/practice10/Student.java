package practice10;

public class Student {
    private String firstname;
    private String surname;
    private String spec;
    private int course;
    private String group;
    private double gpa;

    public Student(String firstname, String surname, String spec, int course, String group, double gpa){
        this.firstname = firstname;
        this.surname = surname;
        this.spec = spec;
        this.course = course;
        this.group = group;
        this.gpa = gpa;
    }

    public String getFirstname(){
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public void setSpec(String spec) {
        this.spec = spec;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public String getSurname(){
        return surname;
    }

    public String getSpec(){
        return spec;
    }

    public int getCourse(){
        return course;
    }

    public String getGroup(){
        return group;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    @Override
    public String toString() {
        return "Student{" +
                "firstname='" + firstname + '\'' +
                ", surname='" + surname + '\'' +
                ", spec='" + spec + '\'' +
                ", course=" + course +
                ", group='" + group + '\'' +
                ", gpa=" + gpa +
                '}';
    }
}
