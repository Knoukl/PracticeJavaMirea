import practice10.Student;
import java.util.Comparator;

public class SortingStudentsByGPA implements Comparator<Student>{
    private Student[] iDNumber;
    //1)
    public void setArray() {
        iDNumber = new Student[]{
                new Student("Ivan", "Ivanov", "IT", 2, "IKBO-02-21", 4.3),
                new Student("Petr", "Petrov", "Math", 1, "IKBO-06-21", 3.8),
                new Student("Sidor", "Sidorov", "Physics", 3, "IKBO-03-21", 4.9),
                new Student("Alex", "Smirnov", "IT", 4, "IKBO-04-21", 4.1)
        };
    }
    //2)quicksort()
    @Override
    public int compare(Student s1, Student s2) {
        return Double.compare(s2.getGpa(), s1.getGpa());
    }

    public void quickSort(int left, int right) {
        int i = left, j = right;
        Student pivot = iDNumber[(left + right) / 2];

        while (i <= j) {
            while (compare(iDNumber[i], pivot) < 0) {
                i++;
            }
            while (compare(iDNumber[j], pivot) > 0) {
                j--;
            }
            if (i <= j) {
                Student temp = iDNumber[i];
                iDNumber[i] = iDNumber[j];
                iDNumber[j] = temp;
                i++;
                j--;
            }
        }
        if (left < j) {
            quickSort(left, j);
        }
        if (i < right) {
            quickSort(i, right);
        }
    }

    public void sortByGPA() {
        if (iDNumber != null && iDNumber.length > 1) {
            quickSort(0, iDNumber.length - 1);
        }
    }

    //4) пузырьковая сортировка
    public void sortBySurname() {
        int n = iDNumber.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (iDNumber[j].getSurname().compareTo(iDNumber[j + 1].getSurname()) > 0) {
                    Student temp = iDNumber[j];
                    iDNumber[j] = iDNumber[j + 1];
                    iDNumber[j + 1] = temp;
                }
            }
        }
    }
    //3)
    public void outArray() {
        for (Student s : iDNumber) {
            System.out.println(s);
        }
    }

    public static void main(String[] args){
        SortingStudentsByGPA sorter = new SortingStudentsByGPA();
        sorter.setArray();
        System.out.println("До сортировки:");
        sorter.outArray();

        sorter.sortByGPA();
        System.out.println("---------------------------------");
        System.out.println("После сортировки по убыванию GPA:");
        sorter.outArray();

        sorter.sortBySurname();
        System.out.println("---------------------------------");
        System.out.println("После сортировки по фамилии:");
        sorter.outArray();
    }
}
