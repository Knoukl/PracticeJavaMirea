package practice13;

public class Person {
    private String name;
    private String surname;
    private String patronymic;

    public Person(String name, String surname, String patronymic) {
        this.name = name;
        this.surname = surname;
        this.patronymic = patronymic;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public String getFullName() {
        StringBuilder fullName = new StringBuilder();

        if (surname != null && !surname.isEmpty()) {
            fullName.append(surname);
        }

        if (name != null && !name.isEmpty()) {
            fullName.append(" ").append(name.charAt(0)).append(".");
        }

        if (patronymic != null && !patronymic.isEmpty()) {
            fullName.append(patronymic.charAt(0)).append(".");
        }

        return fullName.toString().trim();
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", patronymic='" + patronymic + '\'' +
                '}';
    }
}
