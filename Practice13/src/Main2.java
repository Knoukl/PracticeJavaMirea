import practice13.Person;


public class Main2 {
    public static void main(String[] args){
        Person p1 = new Person("Ivan", "Ivanov", "Ivanovich");
        Person p2 = new Person("Petr", "Petrov", null);
        Person p3 = new Person(null, "Sidorov", null);

        System.out.println(p1.getFullName()); // Ivanov I.I.
        System.out.println(p2.getFullName()); // Petrov P.
        System.out.println(p3.getFullName()); // Sidorov
    }
}
